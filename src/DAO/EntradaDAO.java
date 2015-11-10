/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sqlconexao.ConectaBanco;
import utilitarios.Entrada;

/**
 *
 * @author Weslley
 */
public class EntradaDAO {

    ConectaBanco conecta = new ConectaBanco();

    PreparedStatement pst = null;

    int codigoVendedor;

//    public Entrada salvarEntrada(ArrayList<Entrada> colecao){
//        for(){
//            
//        }
//    }
    
    public Entrada salvarEntrada(Entrada salvar) {

        buscarCodigoVendedor(salvar.getIdVendedor());

        try {
            String sql = "insert into MOVIMENTACAO_ENTRADA (id_entrada, id_produto, id_vendedor,data_chegada, qtd) values (?,?,?,?,?)";
            conecta.conexao();
            pst = conecta.conn.prepareStatement(sql);
            //PreparedStatement pst = conecta.conn.prepareStatement("insert into MOVIMENTACAO_ENTRADA (id_entrada, id_produto, id_vendedor,data_chegada, qtd) values (?,?,?,?,?)");
            pst.setInt(1, salvar.getIdEntrada());
            pst.setInt(2, salvar.getIdProduto());
            pst.setInt(3, codigoVendedor);
            pst.setString(4, salvar.getDataChegada());
            pst.setInt(5, salvar.getQtdItem());
            pst.executeUpdate();
            pst.close();
            conecta.conn.close();

//            JOptionPane.showMessageDialog(null, "Produto adicionado no carrinho");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim" + ex);
        }
        return salvar;
    }
    /*
    * Para encontrar o ID_Vendedor e realizar o vinculo
    * essa função realiza a busca de acordo com o nome marcado na ComboBox
    * retornando o ID da tabela de Vendedor
    */
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
    


}
