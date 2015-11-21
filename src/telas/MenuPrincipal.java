/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import sqlconexao.ConectaBanco;
import utilitarios.ModeloTabela;

/**
 *
 * @author rafael Mello
 */
public class MenuPrincipal extends javax.swing.JFrame {

    ConectaBanco conecta = new ConectaBanco();//Weslley

    /**
     * Creates new form MenuPrincilap
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        conecta.conexao();//Weslley
        preencherTabelaMinimo("select * from produto where QTD_ESTOQUE < QTD_MINIMO");
        preencherTabelaMaximo("select * from produto where QTD_ESTOQUE > QTD_MAXIMO");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableQtdMinima = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableQtdMaxima = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAtividades = new javax.swing.JMenu();
        subMenuVendas = new javax.swing.JMenuItem();
        subMenuEntradaProduto = new javax.swing.JMenuItem();
        subMenucliene = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos abaixo da quantidade mínima", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 11))); // NOI18N

        jTableQtdMinima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableQtdMinima);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos acima da quantidade máxima", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 11))); // NOI18N

        jTableQtdMaxima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableQtdMaxima);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jMenuAtividades.setText("Atividades");

        subMenuVendas.setText("Vendas");
        subMenuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuVendasActionPerformed(evt);
            }
        });
        jMenuAtividades.add(subMenuVendas);

        subMenuEntradaProduto.setText("Entrada de Produtos");
        subMenuEntradaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuEntradaProdutoActionPerformed(evt);
            }
        });
        jMenuAtividades.add(subMenuEntradaProduto);

        subMenucliene.setText("Cadastrar Produto");
        subMenucliene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuclieneActionPerformed(evt);
            }
        });
        jMenuAtividades.add(subMenucliene);

        jMenuBar1.add(jMenuAtividades);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuclieneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuclieneActionPerformed
        // TODO add your handling code here:
    CadProduto fcadPro = new CadProduto();
    fcadPro.setVisible(true);
                fcadPro.setLocationRelativeTo(null);

//        Cliente telacli = new Cliente();
//        telacli.setVisible(true);
//        telacli.setLocationRelativeTo(null);
    }//GEN-LAST:event_subMenuclieneActionPerformed

    private void subMenuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuVendasActionPerformed
        new TelaVendas().setVisible(true);
    }//GEN-LAST:event_subMenuVendasActionPerformed

    private void subMenuEntradaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuEntradaProdutoActionPerformed
        new EntradaProduto().setVisible(true);
    }//GEN-LAST:event_subMenuEntradaProdutoActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(WIDTH);
        new JLog();
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        preencherTabelaMinimo("select * from produto where QTD_ESTOQUE < QTD_MINIMO");
        preencherTabelaMaximo("select * from produto where QTD_ESTOQUE > QTD_MAXIMO");
    }//GEN-LAST:event_btnAtualizarActionPerformed

    public void preencherTabelaMinimo(String SQL) {

        ArrayList dados = new ArrayList();

        //Na String, inserir os nomes das colunas conforme informações que serão apresentadas
        String[] Colunas = new String[]{"Descricao Produto", "Quantidade Atual"};

        //Inicia conexão com banco
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do {
                /*Adiciona no objeto da Tabela, todas as informações que deseja apresentar na tabela de 
                 *Pesquisa dos produtos
                 */
                dados.add(new Object[]{conecta.rs.getString("DESCRICAO_PRODUTO"), conecta.rs.getInt("QTD_ESTOQUE")});
            } while (conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não existe produtos com o texto digitado.\n" + ex.getMessage());
        }

        /*
         *Criar todas as colunas e ordenar sequencia...
         *Conforme adição dos dados acima
         */
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableQtdMinima.setModel(modelo);
        jTableQtdMinima.getColumnModel().getColumn(0).setPreferredWidth(193);
        jTableQtdMinima.getColumnModel().getColumn(0).setResizable(false);
        jTableQtdMinima.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTableQtdMinima.getColumnModel().getColumn(1).setResizable(false);
        jTableQtdMinima.getTableHeader().setReorderingAllowed(false);
        jTableQtdMinima.setAutoResizeMode(jTableQtdMinima.AUTO_RESIZE_OFF);
        jTableQtdMinima.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public void preencherTabelaMaximo(String SQL) {

        ArrayList dados = new ArrayList();

        //Na String, inserir os nomes das colunas conforme informações que serão apresentadas
        String[] Colunas = new String[]{"Descricao Produto", "Quantidade Atual"};

        //Inicia conexão com banco
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do {
                /*Adiciona no objeto da Tabela, todas as informações que deseja apresentar na tabela de 
                 *Pesquisa dos produtos
                 */
                dados.add(new Object[]{conecta.rs.getString("DESCRICAO_PRODUTO"), conecta.rs.getInt("QTD_ESTOQUE")});
            } while (conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não existe produtos com o texto digitado.\n" + ex.getMessage());
        }

        /*
         *Criar todas as colunas e ordenar sequencia...
         *Conforme adição dos dados acima
         */
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableQtdMaxima.setModel(modelo);
        jTableQtdMaxima.getColumnModel().getColumn(0).setPreferredWidth(198);
        jTableQtdMaxima.getColumnModel().getColumn(0).setResizable(false);
        jTableQtdMaxima.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTableQtdMaxima.getColumnModel().getColumn(1).setResizable(false);
        jTableQtdMaxima.getTableHeader().setReorderingAllowed(false);
        jTableQtdMaxima.setAutoResizeMode(jTableQtdMaxima.AUTO_RESIZE_OFF);
        jTableQtdMaxima.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAtividades;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableQtdMaxima;
    private javax.swing.JTable jTableQtdMinima;
    private javax.swing.JMenuItem subMenuEntradaProduto;
    private javax.swing.JMenuItem subMenuVendas;
    private javax.swing.JMenuItem subMenucliene;
    // End of variables declaration//GEN-END:variables
}
