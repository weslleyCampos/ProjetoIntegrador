/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Weslley.Campos
 */
public class Entrada {
    
     int idEntrada;
     int idProduto;
     String idVendedor;
     String dataChegada;
     int qtdItem;
     String descricaoProduto;
     
     public Entrada(){
     }
     
     public Entrada(int idEntrada, int idProduto, String idVendedor, String dataChegada, int qtdItem, String descricaoProduto){
         this.idEntrada = idEntrada;
         this.idProduto = idProduto;
         this.idVendedor = idVendedor;
         this.dataChegada = dataChegada;
         this.qtdItem = qtdItem;
         this.descricaoProduto = descricaoProduto;
     }

    /**
     * @return the idEntrada
     */
    public int getIdEntrada() {
        return idEntrada;
    }

    /**
     * @param idEntrada the idEntrada to set
     */
    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the idVendedor
     */
    public String getIdVendedor() {
        return idVendedor;
    }

    /**
     * @param idVendedor the idVendedor to set
     */
    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }

    /**
     * @return the dataChegada
     */
    public String getDataChegada() {
        return dataChegada;
    }

    /**
     * @param dataChegada the dataChegada to set
     */
    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    /**
     * @return the qtdItem
     */
    public int getQtdItem() {
        return qtdItem;
    }

    /**
     * @param qtdItem the qtdItem to set
     */
    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    /**
     * @return the descricaoProduto
     */
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    /**
     * @param descricaoProduto the descricaoProduto to set
     */
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
    public String toString(){
        return idEntrada + ":" + idProduto + ":" + idVendedor + ":" + descricaoProduto + ":" + dataChegada;
    }
    
    
}
