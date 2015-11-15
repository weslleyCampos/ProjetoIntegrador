/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import sqlconexao.ConectaBanco;
import utilitarios.Saida;
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
     * @param comboBox
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
     * Converte data para joga no banco
     *
     * @param data
     * @return
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

}
