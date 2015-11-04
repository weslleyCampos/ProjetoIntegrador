/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utilitarios.Login;
import utilitarios.Estoque;

/**
 *
 * @author rafael Mello
 */
public class DaoLogin {
    
    
    Connection con;
    
      
    public Login logar( Login log){
        // VARIAVEL ONDE SE PREPARA A CONFIRMAÇÃO NO BANCO ( STATEMENT == CONFIRMAÇÃO )
        PreparedStatement stm = null;
        
        String sql= "Teste Login      (Usuario, Senha,)"+" values (?,?)";
        
        try{
            //con = conectarBD.getConection
            
            // cada um stm.setxxx referencia a variavel seu tipo e a ordem em que foi alocada no INSERT DO BD COMO ACIMA
            stm = con.prepareStatement(sql);
            stm.setString(1, log.getLogin());
            stm.setString(2, log.getSenha());
            
            
            // EXECUTAR CONSULTA
            stm.executeQuery();
            stm.close();
            con.close();
        } catch ( SQLException e){
            
        }
            return log;
    }
}
