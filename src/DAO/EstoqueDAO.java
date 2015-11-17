/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import utilitarios.Dados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utilitarios.Estoque;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;
import sqlconexao.ConectaBanco;
import telas.CadProduto;

/**
 *
 * @author rafael Mello
 */
public class EstoqueDAO {

    int codProduto;
    ConectaBanco conecta = new ConectaBanco();
    PreparedStatement stm = null;

    public Estoque salvarDados(Estoque obj) throws Exception {

        try {
            String sql = "insert into PRODUTO(DESCRICAO_PRODUTO,ID_MODELO,PRECO_UNITARIO,QTD_MINIMO,QTD_MAXIMO) values(?,?,?,?,?)";
            conecta.conexao();

            stm = conecta.conn.prepareStatement(sql);
            stm.setString(1, obj.getDescricao());
            stm.setInt(2, obj.getIdModelo());
            stm.setDouble(3, (obj.getPreco()));
            stm.setInt(4, obj.getQtdMin());
            stm.setInt(5, obj.getQtdMax());

            stm.executeUpdate();
            System.out.println("Cadastro realizado com Sucesso");
            JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso");
            stm.close();
            conecta.conn.close();

        } catch (SQLException e) {
            System.out.println("Erro ao salvar informações");
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Dao não inicializado");
        }
        return obj;
    }

    public Estoque consultarEstoque(Estoque pesq) {

        PreparedStatement stm = null;

        String SQL = " update to Usuario (codProd, modelo,fornecedor, descricao, preco,qtdMax,qtdMin)" + " values (?,?,?)";

        try {

        } catch (Exception e) {
        }
        return consultarEstoque(pesq);

    }

    public void delete(Estoque del) {
        conecta.conexao();
        try {
            String sql = "delete from produto where ID_PRODUTO = ? ";
            stm = conecta.conn.prepareStatement(sql);
            stm.setInt(1, del.getCodProd());
            stm.execute();
            JOptionPane.showMessageDialog(null, "produto escluido com sucesso ");

        } catch (SQLException ex) {
            System.out.println("Erro ao obter valores SQL" + ex.getMessage());
        }
        catch (NullPointerException ex){
            System.out.println("Dados não inicializados");
            
        }
    }

    public Estoque atualizaDados(Estoque at) {

        conecta.conexao();
        try {
            String sql = ("update produto set DESCRICAO_PRODUTO=?  where ID_PRODUTO=? ");
            stm = conecta.conn.prepareStatement(sql);
            stm.setString(1, at.getDescricao());
            stm.setInt(2, at.getCodProd());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso !!");
        } catch (SQLException ex) {
            System.out.println("não foi possivel atualização ");
        } catch (NullPointerException ex) {
            System.out.println("dao Atualizar não inicializado");

        }
        return at;
    }

    //associa o nome do modelo ao codigo do produto
}

/**
 * public class Dao_Estoque { // ARRAYLIST DE DADOS DO ESTOQUE DOM RETORNO GET.
 * public List<SistemEstoque> getEstoque(){
 *
 * return Dados.ListaEstoque; } //SALVAR DADOS NO CADASTRO DE ESTOQUE public
 * boolean salvaEst(SistemEstoque obj){
 *
 * if ( obj.getCodProd()==null){ //ADICIONA UM USUARIO A PARTIR DA VERIRICAÇÃO
 * DE COD DE PRODUTO Integer codProd= Dados.ListaEstoque.size()+1;
 * obj.setCodProd(codProd); Dados.ListaEstoque.add(obj); } return true; } }
 *
 */
