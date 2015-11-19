/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import utilitarios.Dados;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import classes.Produtos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sqlconexao.ConectaBanco;

/**
 *
 * @author rafael Mello
 */
public class ProdutosDAO {

    ConectaBanco conecta = new ConectaBanco();
    PreparedStatement stm = null;
    Dados lisDados = new Dados();

    public Produtos salvarDados(Produtos obj) throws Exception {
//        inseerção de dados a partir do objetos estoque passado por parametro na classe
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

    public boolean consultarEstoque(Produtos pesq) {

        PreparedStatement stm = null;

        String SQL = " update to Usuario (codProd, modelo,fornecedor, descricao, preco,qtdMax,qtdMin)" + " values (?,?,?)";
        pesq.getCodProd();
        try {

        } catch (Exception e) {
        }
        return true;

    }

    public void delete(Produtos del) {
        conecta.conexao();
        try {
//            executa um comando sql de DELETE da tabela produto onde o id_produto for igual ao retorno 
//                    de parametros via obj
            String sql = "delete from modelo_produto where MODELO = ? ";
            stm = conecta.conn.prepareStatement(sql);
            stm.setInt(1, del.getCodProd());

            stm.execute();
            JOptionPane.showMessageDialog(null, "produto escluido com sucesso ");

        } catch (SQLException ex) {
            System.out.println("Erro ao obter valores SQL" + ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Dados não inicializados");

        }
    }

    public Produtos atualizaDados(Produtos at) {

        conecta.conexao();
        try {
//          string sql que recebe como parametros os oos valores de objeto estoque e insere na tabela produtos
//                  onde id_produtos for igual ao retorni
            String sql = ("update produto set DESCRICAO_PRODUTO=?, ID_MODELO=? where ID_PRODUTO=? ");
            stm = conecta.conn.prepareStatement(sql);
            stm.setString(1, at.getDescricao());
            stm.setInt(2, at.getIdModelo());
            stm.setInt(3, at.getCodProd());

            stm.execute();
            JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso !!");

        } catch (SQLException ex) {
            System.out.println("não foi possivel atualização ");
        } catch (NullPointerException ex) {
            System.out.println("dao Atualizar não inicializado");

        }
        return at;
    }
    int codModelo;

    public int buscarCodigModelo(String nome) {
        conecta.conexao();
        conecta.executaSQL("select * from modelo_produto where MODELO = '" + nome + "'");
        try {
            conecta.rs.first();
            codModelo = conecta.rs.getInt("id_modelo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar codigo do vendedor.\n" + ex);
        }
        conecta.desconecta();
        return codModelo;

    }

    public ArrayList preencheDados(String sql) {
        conecta.conexao();
        conecta.executaSQL(sql);
        ArrayList dados = new ArrayList();

        try {
            conecta.rs.first();
            do {
//                adiciona novos valores de objeto a tabela pelo comando add e result set do banco
                dados.add(new Object[]{conecta.rs.getInt("ID_PRODUTO"), conecta.rs.getString("MODELO"),
                    conecta.rs.getString("DESCRICAO_PRODUTO"), conecta.rs.getInt("PRECO_UNITARIO"), conecta.rs.getInt("QTD_MAXIMO"), conecta.rs.getInt("QTD_MINIMO")});
            } while (conecta.rs.next());
        } catch (SQLException ex) {
            System.out.println("Erro ao preencher o array " + ex);
        } catch (NullPointerException ex) {
            System.out.println("tabela não inicializada" + ex);
        }
        return dados;
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
