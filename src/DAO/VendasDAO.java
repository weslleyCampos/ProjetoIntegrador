/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import sqlconexao.ConectaBanco;
import utilitarios.ModeloTabela;
import utilitarios.Saida;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author giovane.psimoes
 */
public class VendasDAO {

    ConectaBanco conecta = new ConectaBanco();
    int codigoVendedor;
    PreparedStatement pst = null;

    public VendasDAO() {
        conecta.conexao();
    }

    public void confirmaVenda(Saida venda) {

        buscarCodigoVendedor(venda.getIdVendedor());

        try {
            String sql = "insert into MOVIMENTACAO_SAIDA (id_vendedor, descricao, data_saida, preco_total, qtd) values (?,?,?,?,?)";
            conecta.conexao();
            pst = conecta.conn.prepareStatement(sql);

            //PreparedStatement pst = conecta.conn.prepareStatement("insert into MOVIMENTACAO_ENTRADA (id_entrada, id_produto, id_vendedor,data_chegada, qtd) values (?,?,?,?,?)");
            //pst.setInt(1, venda.getIdSaida());
            //pst.setInt(1, venda.getIdProduto());
            pst.setInt(1, codigoVendedor);
            pst.setString(2, venda.getDescricaoProduto());
            pst.setDate(3, formataData(venda.getDataSaida()));
            pst.setDouble(4, venda.getPrecoTotal());
            pst.setInt(5, venda.getQtdItem());
            pst.executeUpdate();
            pst.close();
            conecta.conn.close();

//            JOptionPane.showMessageDialog(null, "Produto adicionado no carrinho");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro " + ex);
        }
    }

    /**
     * Converte data para joga no banco
     * @param data
     * @return
     * @throws Exception 
     */
    public static java.sql.Date formataData(String data) {
        if (data == null || data.equals("")) {
            return null;
        }

        java.sql.Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = new java.sql.Date(((java.util.Date) formatter.parse(data)).getTime());
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return date;
    }

    public void buscarCodigoVendedor(String nome) {
        conecta.conexao();
        conecta.executaSQL("select * from vendedor where nome_vendedor = '" + nome + "'");
        try {
            conecta.rs.first();
            codigoVendedor = conecta.rs.getInt("id_vendedor");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar codigo do vendedor.\n" + ex);
        }
        conecta.desconecta();
    }

    /**
     * Preenche o ComboBox com os nomes dos vendedores
     */
    public void preencherCombo(JComboBox comboBox) {

        conecta.executaSQL("select * from vendedor order by NOME_VENDEDOR");

        try {
            conecta.rs.first();
            do {
                comboBox.addItem(conecta.rs.getString("nome_vendedor"));
            } while (conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os vendedores!\n" + ex.getMessage());
        }

    }

    /**
     * Preenche uma tabela
     *
     * @param SQL String com comando em SQL
     * @param tabela Tabela a ser preenchida
     */
    public void preencherTabela(String SQL, JTable tabela) {
        ArrayList dados = new ArrayList(); // onde vai ser listado os itens do Banco
        // nome das colunas que serão mostradas na tabela
        String[] colunas = new String[]{"Código", "Descricao Produto", "Preço Unitario", "Qtd Atual de Estoque"};
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do {
                /*Adiciona no objeto da Tabela, todas as informações que deseja apresentar na tabela de 
                 *Pesquisa dos produtos
                 */
                dados.add(new Object[]{conecta.rs.getInt("ID_PRODUTO"), conecta.rs.getString("DESCRICAO_PRODUTO"), conecta.rs.getString("PRECO_UNITARIO"), conecta.rs.getInt("QTD_ESTOQUE")});
            } while (conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não existe produtos com o texto digitado.\n" + ex.getMessage());
        }
        // Cria um modelo de tabela
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        // Chama o método para setar os novos valores na tabela
        setModel(modelo, tabela);

    }

    /**
     * Atualiza uma Tabela
     *
     * @param modelo - é o ModeloTabela
     * @param tabela - tabela a qual será atualizada
     */
    public void setModel(ModeloTabela modelo, JTable tabela) {
        tabela.setModel(modelo);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(0).setResizable(false);

        tabela.getColumnModel().getColumn(1).setPreferredWidth(408);
        tabela.getColumnModel().getColumn(1).setResizable(false);

        tabela.getColumnModel().getColumn(2).setPreferredWidth(90);
        tabela.getColumnModel().getColumn(2).setResizable(false);

        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
