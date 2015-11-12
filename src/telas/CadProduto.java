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
public class CadProduto extends javax.swing.JFrame {

    EstoqueDAO dao = new EstoqueDAO();
    Estoque est = new Estoque();
    ConectaBanco conectar = new ConectaBanco();
    String des = "";
    public int idmod;
    public int idprod;

    /**
     * Creates new form Estoque
     */
    public CadProduto() {
        initComponents();
        conectar.conexao();

        //faz o get/ Select da tabela produtos para o cbBox
        conectar.executaSQL("select * from MODELO_PRODUTO order by Id_modelo");

        CbModelo.removeAllItems();
        //conectar.executaSQL("select * from MODELO_PRODUTO order by ID_MODELO");

        try {
            conectar.rs.first();
            do {

                CbModelo.addItem(conectar.rs.getString("MODELO"));
                cbCodMod.addItem(conectar.rs.getInt("ID_MODELO"));

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
        cbCodMod = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbExibe = new javax.swing.JTable();
        lbTAbela = new javax.swing.JLabel();
        btnAtualiza = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Estoque");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.darkGray));

        CbModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbModeloMouseClicked(evt);
            }
        });
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

        cbCodMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCodModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCodMod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnSlavar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(btnMod)
                        .addGap(18, 18, 18)
                        .addComponent(btnFechar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(cbCodMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        btnAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaActionPerformed(evt);
            }
        });

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
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTAbela)
                        .addGap(20, 20, 20)
                        .addComponent(btnAtualiza)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualiza)
                    .addComponent(btnDelete)
                    .addComponent(lbTAbela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public int buscarCodProduto(String modelo) {
        conectar.conexao();
        conectar.executaSQL("Select * from modelo_produto where modelo= '" + modelo + "");

        try {
            conectar.rs.first();

            idmod = conectar.rs.getInt("id_modelo");
            cbCodMod.setSelectedIndex(idmod);
        } catch (SQLException ex) {
            System.out.println("Não foi possivel obter codigo do produto" + ex);
        } catch (NullPointerException e) {
            System.out.println("não inicializado" + e);

        }
        conectar.desconecta();
        return idmod;
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int saida = JOptionPane.showOptionDialog(null, "Deseja deletar esse Item ?!", null, JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);

//        if (JOptionPane.YES_OPTION == saida && des != "") {
//            
////            est.deletarProduto(idprod);
//             try {
////                if (conecta.rs.getInt("QTD_ESTOQUE") ==0) {
//                    conectar.executaSQL("delete from produto where ID_PRODUTO= "+ );
//                    
//                    JOptionPane.showMessageDialog(null, "produto escluido com sucesso ");
////                } else {
////                    JOptionPane.showMessageDialog(null, "Produto não pode ser excluido, necessario zerar estoque!");
////                }
//            }
//        catch( StackOverflowError ex){
//            System.out.println("Memoria no limite");
//                    }
//        catch( NullPointerException ex){
//            System.out.println("Dao não inicializado ");
//        }
//
//        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tbExibeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbExibeMouseClicked
    idprod=  (int) tbExibe.getValueAt(tbExibe.getSelectedRow(), 0);
        idmod = (int) tbExibe.getValueAt(tbExibe.getSelectedRow(), 1);
        des = "" + tbExibe.getValueAt(tbExibe.getSelectedRow(), 2);

        txtDescricao.setText(des);
        cbCodMod.setSelectedIndex(idmod);

    }//GEN-LAST:event_tbExibeMouseClicked

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        // TODO add your handling code here:
        btnAtualiza.setVisible(true);
        btnDelete.setVisible(true);
        tbExibe.setVisible(true);
    }//GEN-LAST:event_btnModActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        conectar.desconecta();

        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSlavarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSlavarActionPerformed
        // TODO add your handling code here:
        // validação de campos vazios

        String valorcombo = CbModelo.getSelectedItem().toString();
        if (txtDescricao.getText().equals("") || txtQtdMin.getText().equals("") || txtQtdMin.getText().equals("") || txtQtdMax.getText().equals("")
                || txtPreco.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Preencha todos os campos");

        } //        setando valores em variaveis
        else {
            String Descricao = (txtDescricao.getText());
            double preco = (Double.parseDouble(txtPreco.getText()));
            int qtdminimo = (Integer.parseInt(txtQtdMin.getText()));
            int qtdmaximo = (Integer.parseInt(txtQtdMax.getText()));
            String modPro = (cbCodMod.getSelectedItem().toString());

            Estoque e = new Estoque(Descricao, preco, qtdmaximo, qtdminimo, buscarCodProduto(modPro));
            est.salvarestoque(e);
//          

        }


    }//GEN-LAST:event_btnSlavarActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void CbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbModeloActionPerformed

    private void cbCodModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCodModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCodModActionPerformed

    private void CbModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbModeloMouseClicked
        // TODO add your handling code here:

        String saida = CbModelo.getSelectedItem().toString();

        cbCodMod.setSelectedItem(buscarCodProduto(saida));

    }//GEN-LAST:event_CbModeloMouseClicked

    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed
        // TODO add your handling code here:
       
          
        est.setDescricao(txtDescricao.getText());
        est.atualizaDados(est);
      
        
    }//GEN-LAST:event_btnAtualizaActionPerformed

    public void preencheTabela(String SQL) {
        ArrayList dados = new ArrayList();

        String[] Colunas = new String[]{"ID", "MODELO", "    DESCRIÇÃO", "QUANTIDADE EM ESTOQUE"};
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
        tbExibe.getColumnModel().getColumn(0).setPreferredWidth(30);
        tbExibe.getColumnModel().getColumn(0).setResizable(false);
        tbExibe.getColumnModel().getColumn(1).setPreferredWidth(65);
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
            java.util.logging.Logger.getLogger(CadProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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

                CadProduto fcadPro = new CadProduto();
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
    private javax.swing.JComboBox cbCodMod;
    private javax.swing.JButton jButton2;
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
