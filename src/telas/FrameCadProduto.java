/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import utilitarios.ModeloTabela;
import javax.swing.text.DefaultFormatterFactory;
import DAO.EstoqueDAO;
import java.awt.Choice;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import utilitarios.Estoque;
import java.awt.event.ItemListener;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.ListSelectionModel;
import javax.swing.text.MaskFormatter;
import sqlconexao.ConectaBanco;

/**
 *
 * @author rafael Mello
 */
public class FrameCadProduto extends javax.swing.JFrame {

    EstoqueDAO dao = new EstoqueDAO();
    Estoque est = new Estoque();
    ConectaBanco conectar = new ConectaBanco();
    String des="";
    /**
     * Creates new form Estoque
     */
    public FrameCadProduto() {
        initComponents();
        conectar.conexao();
        
        //faz o get/ Select da tabela produtos para o cbBox
        conectar.executaSQL("select * from MODELO_PRODUTO order by MODELO");

        CbModelo.removeAllItems();
        //conectar.executaSQL("select * from MODELO_PRODUTO order by ID_MODELO");

        try {
            conectar.rs.first();
            do {

                CbModelo.addItem(conectar.rs.getString("MODELO"));
                jComboBox1.addItem(conectar.rs.getString("ID_MODELO"));

            } while (conectar.rs.next());

        } catch (SQLException ex) {
            System.out.println("erro ao inserir no Combobox " + ex);
        } catch (NullPointerException ex) {
            System.out.println("não CB não inicializado ");
        }
        tbExibe.setVisible(false);
        btnAtualiza.setVisible(false);
        btnDelete.setVisible(false);
        
                preencheTabela("select * from  PRODUTO order by ID_MODELO");
               preencheTabela("select wWERE QTD_ESTOQUE=(SELECT MIN(QTD_ESTOQUE) FROM PRODUTO  ");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        CbModelo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQtdMin = new javax.swing.JTextField();
        txtQtdMax = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnSlavar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnMod = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbExibe = new javax.swing.JTable();
        lbTAbela = new javax.swing.JLabel();
        btnAtualiza = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Estoque");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.darkGray));

        CbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbModeloActionPerformed(evt);
            }
        });

        jLabel4.setText("Modelo:");

        jLabel10.setText("Codigo Modelo:");

        jLabel3.setText("Descrição Modelo:");

        txtDescricao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantidade Minima:");

        txtQtdMax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jLabel6.setText("Quantidade Máxima:");

        jLabel7.setText("Preço Unitário R$ :");

        btnSlavar.setText("Salvar");
        btnSlavar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSlavarActionPerformed(evt);
            }
        });

        jButton2.setText("Limpar");

        btnFechar.setText("Cancelar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnMod.setText("modificações");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(141, 141, 141)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtQtdMin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdMax, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDescricao))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(140, 140, 140))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnSlavar)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(btnMod)
                .addGap(18, 18, 18)
                .addComponent(btnFechar)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFechar)
                    .addComponent(btnSlavar)
                    .addComponent(jButton2)
                    .addComponent(btnMod))
                .addGap(58, 58, 58))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel8)
                .addGap(207, 207, 207))
        );

        tbExibe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        tbExibe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbExibe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbExibeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbExibe);

        lbTAbela.setText("Tabela de Produtos");

        btnAtualiza.setText("Atualizar");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbTAbela)
                .addGap(18, 18, 18)
                .addComponent(btnAtualiza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTAbela)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnDelete)
                        .addComponent(btnAtualiza)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        conectar.desconecta();

        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSlavarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSlavarActionPerformed
        // TODO add your handling code here:
        // validação de campos vazios

        Estoque esto = new Estoque();

        if (txtDescricao.getText().equals("") || txtQtdMin.getText().equals("") || txtQtdMin.getText().equals("") || txtQtdMax.getText().equals("")
                || txtPreco.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Preencha todos os campos");

        } else {
            esto.setDescricao(txtDescricao.getText());
            esto.setPreco(Double.parseDouble(txtPreco.getText()));
            esto.setQtdMin(Integer.parseInt(txtQtdMin.getText()));
            esto.setQtdMax(Integer.parseInt(txtQtdMax.getText()));
            esto.setIdModelo((int) (jComboBox1.getSelectedItem()));

            try {
                dao.salvarDados(esto);
            } catch (Exception ex) {
                Logger.getLogger(FrameCadProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSlavarActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void CbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbModeloActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        // TODO add your handling code here:
        btnAtualiza.setVisible(true);
        btnDelete.setVisible(true);
        tbExibe.setVisible(true);
    }//GEN-LAST:event_btnModActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int saida =JOptionPane.showOptionDialog(null, "Deseja deletar esse Item ?!", null, JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        if(JOptionPane.YES_OPTION==saida && des!=""){
            try {
                if(conectar.rs.getInt("QTD_ESTOQUE")>0){
                       conectar.executaSQL("delete from produto where DESCRICAO_PRODUTO='" +txtDescricao.getText());
                       JOptionPane.showMessageDialog(null, "produto escluido com sucesso ");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Produto não pode ser excluido, necessario zerar estoque!");
                }
            } catch (SQLException ex) {
                System.out.println("Erro ao obter valores SQL"+ex);
            }
            
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tbExibeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbExibeMouseClicked
        des= ""+tbExibe.getValueAt(tbExibe.getSelectedRow(), 2);
        txtDescricao.setText(des);
    }//GEN-LAST:event_tbExibeMouseClicked

    public void preencheTabela(String SQL) {
        ArrayList dados = new ArrayList();

        String[] Colunas = new String[]{"ID", "MODELO", "DESCRIÇÃO", "QUANTIDADE EM ESTOQUE"};
        conectar.executaSQL(SQL);

        try {
            conectar.rs.first();
            do {
                dados.add(new Object[]{conectar.rs.getInt("ID_PRODUTO"), conectar.rs.getInt("ID_MODELO"), 
                    conectar.rs.getString("DESCRICAO_PRODUTO"), conectar.rs.getInt("QTD_ESTOQUE")});
            } while (conectar.rs.next());
        } catch (SQLException ex) {
            System.out.println("Erro ao preencher o array " + ex);
        }
        ModeloTabela model = new ModeloTabela(dados, Colunas);
        tbExibe.setModel(model);
        tbExibe.getColumnModel().getColumn(0).setPreferredWidth(40);
        tbExibe.getColumnModel().getColumn(0).setResizable(false);
        tbExibe.getColumnModel().getColumn(1).setPreferredWidth(145);
        tbExibe.getColumnModel().getColumn(1).setResizable(false);
        tbExibe.getColumnModel().getColumn(2).setPreferredWidth(180);
        tbExibe.getColumnModel().getColumn(2).setResizable(false);
        tbExibe.getColumnModel().getColumn(3).setPreferredWidth(173);
        tbExibe.getColumnModel().getColumn(3).setResizable(false);
        tbExibe.getTableHeader().setReorderingAllowed(false);
        tbExibe.setAutoResizeMode(tbExibe.AUTO_RESIZE_OFF);
        tbExibe.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

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
            java.util.logging.Logger.getLogger(FrameCadProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                FrameCadProduto fcadPro = new FrameCadProduto();
                fcadPro.setLocationRelativeTo(null);
                fcadPro.setVisible(true);
                fcadPro.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CbModelo;
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnSlavar;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTAbela;
    private javax.swing.JTable tbExibe;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JFormattedTextField txtQtdMax;
    private javax.swing.JTextField txtQtdMin;
    // End of variables declaration//GEN-END:variables

}
