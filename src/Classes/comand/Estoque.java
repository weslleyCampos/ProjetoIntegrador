package Classes.comand;
import java.io.Serializable;
import java.util.Objects;
import javax.swing.JOptionPane;
import telas.FrameCadProduto;
//import telas.FrameLog;
import DAO.Dao_Estoque;
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

    /**public Estoque() {
    
       FrameCadProduto  fram= new FrameCadProduto();
       
        
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.codProd);
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
        final SistemEstoque other = (SistemEstoque) obj;
        if (!Objects.equals(this.codProd, other.codProd)) {
            return false;
        }
        return true;
    }
    **/
    private int codProd=1;
    private String descricao;
    private double preco;
    private int qtdMax;
    private int qtdMin;
    private int idModelo;

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
