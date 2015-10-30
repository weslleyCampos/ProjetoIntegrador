/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import Classes.comand.Dados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Classes.comand.Estoque;
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
import telas.FrameCadProduto;

/**
 *
 * @author rafael Mello
 */
public class Dao_Estoque {

    ConectaBanco conecta = new ConectaBanco();

    public Estoque salvarDados(Estoque obj) throws Exception {

        PreparedStatement stm = null;

        try {
            String sql = "insert into PRODUTO(DESCRICAO_PRODUTO,ID_MODELO,PRECO_UNITARIO,QTD_MINIMO,QTD_MAXIMO) values(?,?,?,?,?)";
            conecta.conexao();
            stm = conecta.conn.prepareStatement(sql);
            stm.setString(1, obj.getDescricao());
            stm.setInt(2, obj.getIdModelo());
            stm.setDouble(3, (obj.getPreco()));
            stm.setInt(4, obj.getQtdMin());
            stm.setInt(5, obj.getQtdMax());

            stm.executeQuery();
            System.out.println("CAdastro realizado com Sucesso");
            stm.close();
            conecta.conn.close();

        } catch (SQLException e) {
            System.out.println("Erro ao salvar informações");
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
