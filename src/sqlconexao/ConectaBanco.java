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
 * @author Weslley.Campos 
 * Conexão com Banco de Dados 
 * Padrão de usuario: pi2
 * Padrão de senha: 123 
 * Nome do Banco ProjetoIntegrador
 */
public class ConectaBanco {

    public Statement stm;
    public ResultSet rs;
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String caminho = "jdbc:sqlserver://localhost:1433;databaseName=PROJETOINTEGRADOR";
    private String usuario = "pi2";
    private String senha = "123";
    public Connection conn;

    public void conexao() {
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão\nErro: " + ex);
        }
    }

    public void executaSQL(String sql) {
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro de Executa SQL!\n" + ex.getMessage());
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
