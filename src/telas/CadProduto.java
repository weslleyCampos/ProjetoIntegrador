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
import classes.Estoque;

/**
 *
 * @author rafael Mello
 */
public class CadProduto extends javax.swing.JFrame {

    EstoqueDAO dao = new EstoqueDAO();
    Estoque est = new Estoque();
    ConectaBanco conectar = new ConectaBanco();

    public Integer idmod;
    public Integer idprod;

    /**
     * Creates new form Estoque
     */
    public CadProduto() {
        initComponents();
        conectar.conexao();

        //faz o get/ Select da tabela produtos para o cbBox em ordem especificada
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

        preencheTabela("select * from  PRODUTO  order by ID_MODELO ");

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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtQtdMin = new javax.swing.JTextField();
        txtcodProduto = new javax.swing.JTextField();
        txtQtdMax = new javax.swing.JFormattedTextField();
        txtPreco = new javax.swing.JTextField();
        CbModelo = new javax.swing.JComboBox();
        cbCodMod = new javax.swing.JComboBox();
        btnSlavar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbExibe = new javax.swing.JTable();
        lbTAbela = new javax.swing.JLabel();
        btnAtualiza = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Estoque");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controle de Estoque", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.darkGray));

        jLabel1.setText("Codigo do Produto:");

        jLabel10.setText("Codigo Modelo:");

        jLabel3.setText("Descrição Modelo:");

        jLabel4.setText("Modelo:");

        jLabel5.setText("Quantidade Min:");

        jLabel6.setText("Quantidade Máx:");

        jLabel7.setText("Preço Unitário R$ :");

        txtDescricao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        txtcodProduto.setEditable(false);

        txtQtdMax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

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

        cbCodMod.setAutoscrolls(true);
        cbCodMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCodModActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(67, 67, 67))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(CbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtPreco, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtQtdMin))
                                                .addGap(41, 41, 41)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtQtdMax)
                                            .addComponent(txtcodProduto)
                                            .addComponent(cbCodMod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(txtDescricao))
                                .addGap(55, 55, 55))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSlavar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFechar)
                        .addGap(43, 43, 43)))
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(CbModelo)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbCodMod))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtQtdMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodProduto))
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSlavar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel8)
                .addGap(238, 238, 238))
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
        tbExibe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbExibeKeyReleased(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lbTAbela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(btnAtualiza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTAbela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAtualiza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int saida = JOptionPane.showOptionDialog(null, "Deseja deletar esse Item ?!", null, JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (JOptionPane.YES_OPTION == saida && idprod != null) {
            est.setCodProd(idprod);
            dao.delete(est);
        }
        preencheTabela("select * from  PRODUTO  order by ID_MODELO ");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tbExibeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbExibeMouseClicked
        int indiceLinha = tbExibe.getSelectedRow();
        cbCodMod.setSelectedIndex((int) tbExibe.getValueAt(indiceLinha, 1));
        txtDescricao.setText(tbExibe.getValueAt(indiceLinha, 2).toString());
        idprod = (int) tbExibe.getValueAt(indiceLinha, 0);
        est.setCodProd(idprod);

//    est.setDescricao(txtDescricao.getText());
//    dao.consultarIdProduto(est);
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
            int modPro = (int) (cbCodMod.getSelectedItem());

            Estoque e = new Estoque(Descricao, preco, qtdmaximo, qtdminimo, modPro);
            est.salvarestoque(e);
        }
        preencheTabela("select * from  PRODUTO  order by ID_MODELO ");


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

    }//GEN-LAST:event_CbModeloMouseClicked

    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed
        // TODO add your handling code here:

        est.setDescricao(txtDescricao.getText());
        est.setIdModelo(cbCodMod.getSelectedIndex());
        est.atualizaDados(est);

        preencheTabela("select * from  PRODUTO  order by ID_MODELO ");
    }//GEN-LAST:event_btnAtualizaActionPerformed

    private void tbExibeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbExibeKeyReleased
        // TODO add your handling code here:
        int indiceLinha = tbExibe.getSelectedRow();
        cbCodMod.setSelectedIndex((int) tbExibe.getValueAt(indiceLinha, 1));
        txtDescricao.setText(tbExibe.getValueAt(indiceLinha, 2).toString());
        txtDescricao.setText(tbExibe.getValueAt(indiceLinha, 2).toString());
        est.setIdModelo(CbModelo.getSelectedIndex());
    }//GEN-LAST:event_tbExibeKeyReleased

    public void preencheTabela(String SQL) {
        ArrayList dados = new ArrayList();

        String[] Colunas = new String[]{"ID", "ID MODELO", "             DESCRIÇÃO"
            + "", "QUANTIDADE EM ESTOQUE"};
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
        tbExibe.getColumnModel().getColumn(1).setPreferredWidth(80);
        tbExibe.getColumnModel().getColumn(1).setResizable(false);
        tbExibe.getColumnModel().getColumn(2).setPreferredWidth(170);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTAbela;
    private javax.swing.JTable tbExibe;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JFormattedTextField txtQtdMax;
    private javax.swing.JTextField txtQtdMin;
    private javax.swing.JTextField txtcodProduto;
    // End of variables declaration//GEN-END:variables

}
