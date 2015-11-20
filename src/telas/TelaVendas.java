/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import DAO.VendasDAO;
import java.sql.SQLException;
import java.util.Date;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import sqlconexao.ConectaBanco;
import utilitarios.ModeloTabela;
 
/**
 *
 * @author Giovane PSimoes
 */
public class TelaVendas extends javax.swing.JFrame {

    DecimalFormat df = new DecimalFormat("0.00"); // Formata a string do campo Preço Total
    ArrayList dadosCarrinho = new ArrayList(); // ArrayList que vai adicionando produtos no Carrinho.
    String[] colunasCarrinho = new String[]{"Código", "Descricao Produto", "Qantidade", "Preço"}; // Colunas da tabela carrinho
    VendasDAO vendasDAO = new VendasDAO();
    ConectaBanco conecta = new ConectaBanco();

    /**
     * Creates new form Vendas
     */
    public TelaVendas() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Pega no banco de dados, todos os produtos para jogar na tabela de Pesquisa
        preencherTabela("select * from PRODUTO order by ID_PRODUTO", jTable_Pesquisa); 
        //Preenche o combobox com os nomes dos vendedores
        vendasDAO.preencherCombo(jCombo_Vendedor);
        //Seta o campo valor total para 0;
        jText_ValorTotal.setText("0.00");
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
        jText_CodProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jText_Descricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jText_Quantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCombo_Vendedor = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jText_ValorUn = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Pesquisa = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton_Sair = new javax.swing.JButton();
        jButton_ConfirmVenda = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Carrinho = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jText_ValorTotal = new javax.swing.JTextField();
        jButton_Excluir = new javax.swing.JButton();
        jButton_AddCarrinho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Venda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Myriad Pro", 2, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        jLabel1.setText("Cod. Produto");

        jText_CodProduto.setEditable(false);
        jText_CodProduto.setText(" ");

        jLabel2.setText("Descrição");

        jLabel3.setText("Quantidade");

        jLabel4.setText("Vendedor");

        jLabel7.setText("Valor R$");

        jText_ValorUn.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jText_CodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCombo_Vendedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_ValorUn))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_CodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jCombo_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jText_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jText_ValorUn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jText_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTable_Pesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_PesquisaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Pesquisa);

        jLabel5.setText("Pesquisa de Produtos");

        jLabel6.setText("Carrinho");

        jButton_Sair.setText("Sair");
        jButton_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SairActionPerformed(evt);
            }
        });

        jButton_ConfirmVenda.setText("Confirmar Venda");
        jButton_ConfirmVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConfirmVendaActionPerformed(evt);
            }
        });

        jTable_Carrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable_Carrinho);

        jLabel8.setFont(new java.awt.Font("Myriad Pro", 2, 18)); // NOI18N
        jLabel8.setText("Valor TOTAL R$");

        jText_ValorTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_Excluir.setText("Excluir do Carrinho");
        jButton_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirActionPerformed(evt);
            }
        });

        jButton_AddCarrinho.setText("Adicionar ao Carrinho");
        jButton_AddCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddCarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Excluir)
                        .addGap(335, 335, 335)
                        .addComponent(jButton_ConfirmVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Sair))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jButton_AddCarrinho))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton_AddCarrinho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jText_ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Sair)
                    .addComponent(jButton_ConfirmVenda)
                    .addComponent(jButton_Excluir))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AddCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddCarrinhoActionPerformed
        // Adiciona os valores preenchidos dos campos para a tabela carrinho.
        // Todos os campos devem ser preenchidos
        if (!jText_Quantidade.getText().trim().equals("")) {
            // Valores usados para comparar a quantidade digitada com a disponibilidade de estoque
            int qtd = Integer.parseInt(jText_Quantidade.getText()); //Converte para int o valor do campo de texto quantidade
            int qtdDisp = Integer.parseInt(jTable_Pesquisa.getValueAt(jTable_Pesquisa.getSelectedRow(), 3).toString()); //Converte a quantidade de estoque da tabela para int.
            // Testa se tem quantidade disponível
            if (qtd <= qtdDisp) { //A quantidade digitada é menor que a disponível.
                adicionarCarrinho(dadosCarrinho); //Adiciona o produto na tabela Carrinho
                atualizaPrecoTotal(); //Atualiza o preço total
            } else {
                JOptionPane.showMessageDialog(rootPane, "Quantidade não disponível!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!");
        }
    }//GEN-LAST:event_jButton_AddCarrinhoActionPerformed

    private void jButton_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_SairActionPerformed

    private void jTable_PesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_PesquisaMouseClicked
        // Captura os valores da tabela Pesquisa, da linha em que o usurário clicou
        String idProduto = "" + jTable_Pesquisa.getValueAt(jTable_Pesquisa.getSelectedRow(), 0);
        String descProduto = "" + jTable_Pesquisa.getValueAt(jTable_Pesquisa.getSelectedRow(), 1);
        String valor = "" + jTable_Pesquisa.getValueAt(jTable_Pesquisa.getSelectedRow(), 2);
        // Preenche os campos com os valores do produto que foi clicado
        jText_CodProduto.setText(idProduto);
        jText_Descricao.setText(descProduto);
        jText_ValorUn.setText(valor);
    }//GEN-LAST:event_jTable_PesquisaMouseClicked

    private void jButton_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirActionPerformed
        // testa se a tabela carrinho não está vazia
        if (jTable_Carrinho.getRowCount() > 0) {
            // Exclui um produto
            excluirCarrinho(dadosCarrinho, jTable_Carrinho.getSelectedRow());
            // Atualiza o preço total
            atualizaPrecoTotal();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Carrinho Vazio!");
        }
    }//GEN-LAST:event_jButton_ExcluirActionPerformed

    private void jButton_ConfirmVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConfirmVendaActionPerformed
        // Testa se o carrinho não está limpo
        if (jTable_Carrinho.getRowCount() > 0) {
            // Varre a tabela carrinho para guardar as informações de cada linha e criar Objetos
            for (int i = 0; i < jTable_Carrinho.getRowCount(); i++) {
                //Pegando informação dos campos da tabela
                String vendedor = jCombo_Vendedor.getSelectedItem().toString(); //Pego o nome do vendedor
                String dataAtual = getDateTime(); // Pegando a data do sistema
                int qtdItem = Integer.parseInt(jTable_Carrinho.getValueAt(i, 2).toString()); //Pega a quantidade
                int idProduto = Integer.parseInt(jTable_Carrinho.getValueAt(i, 0).toString()); //Pega o ID_Modelo
                double preco = (Double) jTable_Carrinho.getValueAt(i, 3); //Pega o modelo

                //Cria um objeto com as informações de cada linha da tabela Carrinho
                classes.Vendas s = new classes.Vendas();
                s.setIdVendedor(vendedor);
                s.setDataSaida(dataAtual);
                s.setQtdItem(qtdItem);
                s.setIdProduto(idProduto);
                s.setPrecoTotal(preco);

                vendasDAO.confirmaVenda(s); //Insere os objetos no banco de dados.

            }

            // limpa o carrinho
            while (jTable_Carrinho.getRowCount() > 0) {
                excluirCarrinho(dadosCarrinho, 0);
            }
            //Limpa o Valor Total
            jText_ValorTotal.setText(null);

            JOptionPane.showMessageDialog(rootPane, "Venda Confirmada!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Carrinho Vazio!");
        }
    }//GEN-LAST:event_jButton_ConfirmVendaActionPerformed


    /**
     * Atualiza o preço total dos produtos e insere no campo de texto Total
     * 
     */
    public void atualizaPrecoTotal() {
        //String soma;
        double soma = 0;
        //Cria um modelo de tabela
        ModeloTabela carrinho = new ModeloTabela(dadosCarrinho, colunasCarrinho);
        setModel(carrinho, jTable_Carrinho);
        //Varre a tabela carrinho pegando o preço total de cada produto
        for (int i = 0; i < carrinho.getRowCount(); i++) {
            String valor = carrinho.getValueAt(i, 3).toString(); //Pega o preço total de cada produto
            soma += Double.parseDouble(valor); //Vai somando
        }
        jText_ValorTotal.setText(df.format(soma)); //Mostra o preço total da compra

    }

    /**
     *
     * @return
     */
    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    /**
     *
     * @param dados
     * @param linha
     */
    public void excluirCarrinho(ArrayList dados, int linha) {
        //Testa se foi selecionado alguma linha da tabela Carrinho
        if (linha > -1) {
            // Cria um modelo de tabela
            ModeloTabela carrinho = new ModeloTabela(dados, colunasCarrinho);
            // Chama o método de remover linha do ModeloTabela
            carrinho.removeProduto(linha);
            // Chama o método para setar os novos valores na tabela
            setModel(carrinho, jTable_Carrinho); // Aqui vc coloca o Modelo de Tabela e qual é a jTabel que vc quer usar, nesse caso para excluir a linha
        } else {
            JOptionPane.showMessageDialog(rootPane, "Escolha uma linha para excluir!");
        }
    }

    /**
     * Preenche uma tabela
     *
     * @param SQL String com comando em SQL
     * @param tabela Tabela a ser preenchida
     */
    public void preencherTabela(String SQL, JTable tabela) {
        ArrayList dados = new ArrayList(); // onde vai ser listado os itens do Banco
        // nome das colunas que serão mostradas na tabela
        String[] colunas = new String[]{"Código", "Descricao Produto", "Preço Unitario", "Qtd Atual de Estoque"};
        conecta.conexao();
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
        // Cria um modelo de tabela
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        // Chama o método para setar os novos valores na tabela
        setModel(modelo, tabela);

    }
    
    

    /**
     *
     * @param dados
     */
    public void adicionarCarrinho(ArrayList dados) {
        // Nome das colunas que serão mostradas na tabela
        String[] colunas = new String[]{"Código", "Descricao Produto", "Qantidade", "Preço"};
        // Converte preço e quantidade para multiplicar o valor do produto pela quantidade
        double precoTotalUn = Integer.parseInt(jText_Quantidade.getText()) * Double.parseDouble(jText_ValorUn.getText());
        // Adiciona no ArrayList um produto novo.
        dados.add(new Object[]{jText_CodProduto.getText(), jText_Descricao.getText(), jText_Quantidade.getText(), precoTotalUn});
        // Cria o modelo de tabela
        ModeloTabela carrinho = new ModeloTabela(dados, colunas);
        // Chama o método para setar os novos valores na tabela
        setModel(carrinho, jTable_Carrinho);
    }

    /**
     * Atualiza uma Tabela
     *
     * @param modelo - é o ModeloTabela
     * @param tabela - tabela a qual será atualizada
     */
    public void setModel(ModeloTabela modelo, JTable tabela) {
        tabela.setModel(modelo);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(0).setResizable(false);

        tabela.getColumnModel().getColumn(1).setPreferredWidth(408);
        tabela.getColumnModel().getColumn(1).setResizable(false);

        tabela.getColumnModel().getColumn(2).setPreferredWidth(90);
        tabela.getColumnModel().getColumn(2).setResizable(false);

        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//Permite que seja selecionado 1 linha por vez
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
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddCarrinho;
    private javax.swing.JButton jButton_ConfirmVenda;
    private javax.swing.JButton jButton_Excluir;
    private javax.swing.JButton jButton_Sair;
    private javax.swing.JComboBox jCombo_Vendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_Carrinho;
    private javax.swing.JTable jTable_Pesquisa;
    private javax.swing.JTextField jText_CodProduto;
    private javax.swing.JTextField jText_Descricao;
    private javax.swing.JTextField jText_Quantidade;
    private javax.swing.JTextField jText_ValorTotal;
    private javax.swing.JTextField jText_ValorUn;
    // End of variables declaration//GEN-END:variables
}
