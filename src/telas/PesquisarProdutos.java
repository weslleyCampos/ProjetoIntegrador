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
 * @author weslley campos
 * 
 */
public class PesquisarProdutos extends javax.swing.JFrame {
    
    //Declara conexão com banco de dados
    ConectaBanco conecta = new ConectaBanco();

    String idProduto, nomeProduto;

    public PesquisarProdutos() {
        initComponents();
        conecta.conexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelDescricao = new javax.swing.JLabel();
        txtDescricaoProduto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisas = new javax.swing.JTable();
        btnConfirmarProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Produtos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Myriad Pro", 2, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N

        jLabelDescricao.setText("Descrição do Produto");

        jButton1.setText("Procurar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTablePesquisas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePesquisas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricao)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnConfirmarProduto.setText("Adicionar");
        btnConfirmarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnConfirmarProduto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmarProduto)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        preencherTabelaPesquisa("select * from produto where descricao_produto like '%" + txtDescricaoProduto.getText() + "%'");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTablePesquisasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisasMouseClicked
               
        //Apresentar informações nos campos quando a linha na tabela de pesquisa for clicada
        //Comando facilita na entrada dos produtos evitando possiveis erros de digitação ou produtos não existentes 
        idProduto = "" + jTablePesquisas.getValueAt(jTablePesquisas.getSelectedRow(), 0);
        nomeProduto = "" + jTablePesquisas.getValueAt(jTablePesquisas.getSelectedRow(), 1);
        txtDescricaoProduto.setText(nomeProduto);
        
    }//GEN-LAST:event_jTablePesquisasMouseClicked

    private void btnConfirmarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarProdutoActionPerformed
               
        setVisible(false);
    }//GEN-LAST:event_btnConfirmarProdutoActionPerformed
//Preenchimento da tabela de Pesquisa de Produtos

    public void preencherTabelaPesquisa(String SQL) {

        ArrayList dados = new ArrayList();

        //Na String, inserir os nomes das colunas conforme informações que serão apresentadas
        String[] Colunas = new String[]{"", "Descricao Produto", "Preço Unitario", "Qtd Atual de Estoque"};

        //Inicia conexão com banco
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do {
                /*Adiciona no objeto da Tabela, todas as informações que deseja apresentar na tabela de 
                 *Pesquisa dos produtos
                 */
                dados.add(new Object[]{conecta.rs.getInt("ID_PRODUTO"), conecta.rs.getString("DESCRICAO_PRODUTO"), conecta.rs.getString("PRECO_UNITARIO"), conecta.rs.getInt("QTD_ESTOQUE")});
            } while (conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não existe produtos com o texto digitado.\n" + ex.getMessage());
        }

        /*
         *Criar todas as colunas e ordenar sequencia...
         *Conforme adição dos dados acima
         */
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTablePesquisas.setModel(modelo);
        jTablePesquisas.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTablePesquisas.getColumnModel().getColumn(0).setResizable(false);
        jTablePesquisas.getColumnModel().getColumn(1).setPreferredWidth(220);
        jTablePesquisas.getColumnModel().getColumn(1).setResizable(false);
        jTablePesquisas.getColumnModel().getColumn(2).setPreferredWidth(115);
        jTablePesquisas.getColumnModel().getColumn(2).setResizable(false);
        jTablePesquisas.getColumnModel().getColumn(3).setPreferredWidth(145);
        jTablePesquisas.getColumnModel().getColumn(3).setResizable(false);
        jTablePesquisas.getTableHeader().setReorderingAllowed(false);
        jTablePesquisas.setAutoResizeMode(jTablePesquisas.AUTO_RESIZE_OFF);
        jTablePesquisas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

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
            java.util.logging.Logger.getLogger(PesquisarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePesquisas;
    private javax.swing.JTextField txtDescricaoProduto;
    // End of variables declaration//GEN-END:variables
}
