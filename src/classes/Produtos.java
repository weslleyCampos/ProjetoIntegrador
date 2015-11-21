package classes;
//import telas.FrameLog;

import DAO.ProdutosDAO;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafael Mello
 */
public class Produtos {

    ProdutosDAO dao = new ProdutosDAO();
    private static int codProd;
    private static String descricao;
    private static double preco;
    private static int qtdMax;
    private static int qtdMin;
    private static int idModelo;

    public Produtos() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.codProd;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produtos other = (Produtos) obj;
        if (this.codProd != other.codProd) {
            return false;
        }
        return true;
    }

    public boolean validaQtd(int id) {

        return dao.validaQuantidadeMaxima(id);
    }

    public Produtos(String descricao, double preco, int qtdMax, int qtdMin, int idModelo) {
        this.descricao = descricao;
        this.preco = preco;
        this.qtdMax = qtdMax;
        this.qtdMin = qtdMin;
        this.idModelo = idModelo;
    }
// metodo de conexão com banco de dados via objeto.

    public void salvarestoque(Object esyo) {
        try {
            dao.salvarDados((Produtos) esyo);
        } catch (Exception ex) {
            System.out.println("Erro ao incluir dados" + ex);
        }
    }

    public String preencheTab() {
        String saida = "select p.ID_PRODUTO,p.DESCRICAO_PRODUTO,m.MODELO,p.PRECO_UNITARIO, p.QTD_MAXIMO,p.QTD_MINIMO\n"
                + "from produto p\n"
                + "inner join  modelo_produto m\n"
                + "on p.id_modelo = m.id_modelo;\n";

        return saida;
    }

    public int buscaModelo(String model) {
        int saida = dao.buscarCodigModelo(model);
        return saida;
    }

    public void atualizaDados(Object refresh) {

        dao.atualizaDados((Produtos) refresh);
    }

    public void deletProd(Object d) {

        dao.delete((Produtos) d);
    }

    public Integer getCodProd() {
        return codProd;
    }

    public void setCodProd(Integer codProd) {
        this.codProd = codProd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Integer getQtdMax() {
        return qtdMax;
    }

    public void setQtdMax(Integer qtdMax) {
        this.qtdMax = qtdMax;
    }

    public Integer getQtdMin() {
        return qtdMin;
    }

    public void setQtdMin(Integer qtdMin) {
        this.qtdMin = qtdMin;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public ArrayList dados(String SQL) {

        return dao.preencheDados(SQL);
    }
}
