/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Weslley.Campos Conexão com Banco de Dados Padrão de usuario: pi2
 * Padrão de senha: 123 Nome do Banco ProjetoIntegrador
 * "com.mysql.jdbc.SQLServerDriver";
 *
 * "com.microsoft.sqlserver.jdbc.SQLServerDriver";
 * jdbc:sqlserver://localhost:1433;databaseName=PROJETOINTEGRADOR"; pi2
 */
public class ConectaBanco {

    public Statement stm;
    public ResultSet rs;
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String caminho = "jdbc:sqlserver://localhost:1433;databaseName=PROJETOINTEGRADOR";
    private String usuario = "pi2";
    private String senha = "123";
    public Connection conn;
    public Connection conn1;
    private String driver1 = "com.mysql.jdbc.SQLServerDriver";
    private String caminho1 = "jdbc:mysql://localhost:3306/projetointegrador";
    private String usuario1 = "root";
    private String senha1 = "1234";

    public void conexao() {
        try {
            System.setProperty("jdbc.Drivers", driver);

            //conexão mySQL
            //conn = DriverManager.getConnection(caminho1, usuario1, senha1);
            
            //conexão SQL server
                conn = DriverManager.getConnection(caminho, usuario, senha);
                
            //JOptionPane.showMessageDialog(null, "Conectado");
        } catch (SQLException ex) {
            try {
                //conexão SQL server
                conn = DriverManager.getConnection(caminho, usuario, senha);
                
            } catch (SQLException exx) {
                JOptionPane.showMessageDialog(null, "Erro de conexão\nErro: " + exx);
            }
        }
    }

    public void executaSQL(String sql) {
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Executa SQL!\n" + ex.getMessage());
        }
    }

    public void desconecta() {
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão");
        }
    }
}
