/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import sqlconexao.ConectaBanco;
import utilitarios.ModeloTabela;

/**
 *
 * @author giovane.psimoes
 */
public class VendasDAO {

    ConectaBanco conecta = new ConectaBanco();

    public VendasDAO() {
        conecta.conexao();
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
