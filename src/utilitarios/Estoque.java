package utilitarios;
import java.io.Serializable;
import java.util.Objects;
import javax.swing.JOptionPane;
import telas.CadProduto;
//import telas.FrameLog;
import DAO.EstoqueDAO;
import java.util.List;
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
public class Estoque  {

    EstoqueDAO daoest= new EstoqueDAO();
    private int codProd=1;
    private String descricao;
    private double preco;
    private int qtdMax;
    private int qtdMin;
    private int idModelo;

    public Estoque() {
    }

    public Estoque(String descricao, double preco, int qtdMax, int qtdMin, int idModelo) {
        this.descricao = descricao;
        this.preco = preco;
        this.qtdMax = qtdMax;
        this.qtdMin = qtdMin;
        this.idModelo = idModelo;
    }
// metodo de conexão com banco de dados via objeto.
    public void salvarestoque(Object esyo){
         try {
                daoest.salvarDados((Estoque) esyo);
            } catch (Exception ex) {
                System.out.println("Erro ao incluir dados"+ex);
            }        
    }
    
    public void atualizaDados(Object refresh){
        
        daoest.atualizaDados((Estoque) refresh);
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
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

  


    
}
