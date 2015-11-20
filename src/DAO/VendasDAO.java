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
import classes.Vendas;

/**
 *
 * @author giovane.psimoes
 */
public class VendasDAO {

    ConectaBanco conecta = new ConectaBanco();
    int codigoVendedor;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    Vendas vend= new Vendas();
    public VendasDAO() {
        conecta.conexao();
    }

    public void confirmaVenda(Vendas venda) {

        buscarCodigoVendedor(venda.getIdVendedor());
        conecta.conexao();
        
        try {
            // Insere os dados na tabela MOVIMENTACAO_SAIDA
            String sqlIn = "insert into MOVIMENTACAO_SAIDA (id_vendedor, id_produto, data_saida, preco_total, qtd) values (?,?,?,?,?)";

            pst = conecta.conn.prepareStatement(sqlIn);

            pst.setInt(1, codigoVendedor);
            pst.setInt(2, venda.getIdProduto());
            pst.setString(3, venda.getDataSaida());
            pst.setDouble(4, venda.getPrecoTotal());
            pst.setInt(5,(atual- venda.getQtdItem()));
            pst.execute();
            pst.close();

            // Atualiza a quantidade atual do produto em estoque
            String sqlOut = "update produto set QTD_ESTOQUE = QTD_ESTOQUE - ? where ID_PRODUTO =?";

            pst1 = conecta.conn.prepareStatement(sqlOut);

            pst1.setInt(1, venda.getQtdItem());
            pst1.setInt(2, venda.getIdProduto());
            pst1.executeUpdate();
            pst1.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro " + ex);
        } finally {
            conecta.desconecta();
        }
    }

    /**
     * 
     * @param nome 
     */
    public void buscarCodigoVendedor(String nome) {
        conecta.conexao();
        conecta.executaSQL("select * from vendedor where nome_vendedor = '" + nome + "'");
        try {
            conecta.rs.first();
            codigoVendedor = conecta.rs.getInt("id_vendedor");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar codigo do vendedor.\n" + ex);
        } finally {
            conecta.desconecta();
        }
    }
    
    /**
     * Preenche o ComboBox com os nomes dos vendedores
     *
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
        } finally {
            conecta.desconecta();
        }
    }

}
