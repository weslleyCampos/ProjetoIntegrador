/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import DAO.EntradaDAO;
import java.awt.Color;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import sqlconexao.ConectaBanco;
import utilitarios.Entrada;
import utilitarios.ModeloTabela;

/**
 *
 * @author Weslley.Campos
 */
public class EntradaProduto extends javax.swing.JFrame {

//Declara conexão com banco de dados
    ConectaBanco conecta = new ConectaBanco();

    //Declarando ArrayList 
    ArrayList<Entrada> entrarEstoque = new ArrayList();

    //Criando obejto EntradaDAO
    EntradaDAO entradaDAO = new EntradaDAO();

    //Declaração da variável IDEntrada para capturar e inserir por padrão o ID Entrada
    int idEntrada, codigoVendedor;

    public EntradaProduto() {
        initComponents();
        preencherCombo();
        idEntrada = entradaDAO.preencherIdEntrada(idEntrada);
        txtIDEntrada.setText(Integer.toString(idEntrada));
        conecta.conexao();
        //Marcará utilizada na data de chegada do produto
        try {
            MaskFormatter form = new MaskFormatter("##/##/####");
            txtDataChegada.setFormatterFactory(new DefaultFormatterFactory(form));
        } catch (ParseException ex) {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisaProduto = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableItensEntrada = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblQtd = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        txtDataChegada = new javax.swing.JFormattedTextField();
        btnAdicionarEntrada = new javax.swing.JButton();
        cmbVendedor = new javax.swing.JComboBox();
        lblVendedor = new javax.swing.JLabel();
        lblNotificacao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtIDEntrada = new javax.swing.JTextField();
        txtIDProduto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entrada de Produtos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 2, 18)); // NOI18N
        jLabel1.setText("Entrada de Estoque dos Produtos");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jTablePesquisaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePesquisaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisaProduto);

        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Inicie a entrada de estoque realizando a busca dos produtos abaixo.");

        jTableItensEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableItensEntrada);

        jLabel3.setText("Itens dos produtos a serem adicionados");

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblQtd.setText("Quantidade");

        lblData.setText("Data");

        txtDataChegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataChegadaActionPerformed(evt);
            }
        });

        btnAdicionarEntrada.setText("Adicionar ao Carrinho");
        btnAdicionarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEntradaActionPerformed(evt);
            }
        });

        cmbVendedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbVendedorFocusLost(evt);
            }
        });
        cmbVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbVendedorMouseClicked(evt);
            }
        });
        cmbVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVendedorActionPerformed(evt);
            }
        });

        lblVendedor.setText("Vendedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNotificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQtd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataChegada, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionarEntrada)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtd)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData)
                    .addComponent(txtDataChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVendedor)
                    .addComponent(cmbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNotificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        lblDescricao.setText("Descrição do Produto");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("ID Entrada");

        txtIDEntrada.setEditable(false);

        txtIDProduto.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConfirmar)
                                .addGap(51, 51, 51)
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addGap(101, 101, 101))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtIDEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnCancelar)
                    .addComponent(btnConfirmar))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEntradaActionPerformed

        //Essa variavel será utilizada para validação de dados
        boolean validar;

        //Verificação de campo DataChegada, considerando a data como vazia mesmo com a formatação ( / / )
        boolean verificarData = true;
        if (!txtDataChegada.getText().equals("  /  /    ")) {
            verificarData = false;
        }

        if (txtIDProduto.getText().trim().equals("")) {
            lblNotificacao.setForeground(Color.red);
            lblNotificacao.setText("Para adicionar no carrinho, por favor selecione um ou mais produtos!");
        } else if (txtQtd.getText().trim().equals("") || verificarData) {
            lblNotificacao.setForeground(Color.red);
            txtQtd.setBackground(Color.yellow);
            txtDataChegada.setBackground(Color.yellow);
            lblNotificacao.setText("Para adicionar no carrinho, por favor informe os valores nos campos indicados!");
        } else {
            lblNotificacao.setText("");

            //Guardando informaçoes dos campos 
            int idEntrada = Integer.parseInt(txtIDEntrada.getText());
            int idProduto = Integer.parseInt(txtIDProduto.getText());
            String idVendedor = (String) cmbVendedor.getSelectedItem();
            String dataChegada = txtDataChegada.getText();
            int qtdItem = Integer.parseInt(txtQtd.getText());
            String descricaoProduto = txtDescricao.getText();
            int somaQtd = entradaDAO.calcularQuantidadeEstoque(idProduto, qtdItem);

            //Declarando classe de entrada de estoque
            Entrada e = new Entrada(idEntrada, idProduto, idVendedor, dataChegada, qtdItem, descricaoProduto, somaQtd);

            //RETIRAR
            System.out.println(e);
            System.out.println(somaQtd);

            validar = entradaDAO.validaQuantidadeMaxima(idProduto, qtdItem);
            if (validar == true) {
                lblNotificacao.setForeground(Color.red);
                lblNotificacao.setText("A quantidade informada irá ultrapassar a máxima desejada para esse produto!");
            }
            entrarEstoque.add(e);
            lblNotificacao.setForeground(Color.blue);
            lblNotificacao.setText("Produto adicionado na lista de entrada!");
//            adicionarCarrinho(entrarEstoque);
        }
    }//GEN-LAST:event_btnAdicionarEntradaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        lblNotificacao.setText("");
        txtQtd.setBackground(Color.white);
        txtDataChegada.setBackground(Color.white);
        preencherTabelaPesquisa("select * from produto where descricao_produto like '%" + txtDescricao.getText() + "%'");

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVendedorActionPerformed

    }//GEN-LAST:event_cmbVendedorActionPerformed

    private void jTablePesquisaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaProdutoMouseClicked

        //Realizar Limpeza
        lblNotificacao.setText("");
        limparCampos();
        //Apresentar informações nos campos quando a linha na tabela de pesquisa for clicada
        //Comando facilita na entrada dos produtos evitando possiveis erros de digitação ou produtos não existentes 
        String idProduto = "" + jTablePesquisaProduto.getValueAt(jTablePesquisaProduto.getSelectedRow(), 0);
        String nomeProduto = "" + jTablePesquisaProduto.getValueAt(jTablePesquisaProduto.getSelectedRow(), 1);
        txtIDProduto.setText(idProduto);
        txtDescricao.setText(nomeProduto);
        txtQtd.setBackground(Color.white);
        txtDataChegada.setBackground(Color.white);
    }//GEN-LAST:event_jTablePesquisaProdutoMouseClicked

    private void cmbVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbVendedorMouseClicked

    }//GEN-LAST:event_cmbVendedorMouseClicked

    private void cmbVendedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbVendedorFocusLost

    }//GEN-LAST:event_cmbVendedorFocusLost

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        entradaDAO.salvarEntrada(entrarEstoque);
        setVisible(false);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtDataChegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataChegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataChegadaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed

    //Função para adicionar todos os produtos no carrinho
    public void adicionarCarrinho(ArrayList dados) {
        Entrada e = new Entrada();
        // Nome das colunas que serão mostradas na tabela
        String[] colunas = new String[]{"Descricao Produto", "Quantidade"};
        // Adiciona no ArrayList um produto novo.
        dados.add(new String[]{txtDescricao.getText(), txtQtd.getText()});
        // Cria o modelo de tabela
        ModeloTabela carrinho = new ModeloTabela(dados, colunas);
        // Chama o método para setar os novos valores na tabela
        setModel(carrinho, jTableItensEntrada);
    }

    public void setModel(ModeloTabela modelo, JTable tabela) {
        tabela.setModel(modelo);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(408);
        tabela.getColumnModel().getColumn(0).setResizable(false);

        tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(1).setResizable(false);

        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    //Preenchimento da ComboBox Vendedores
    public void preencherCombo() {
        conecta.conexao();
        conecta.executaSQL("select * from vendedor order by NOME_VENDEDOR");

        try {
            conecta.rs.first();
            do {
                cmbVendedor.addItem(conecta.rs.getString("nome_vendedor"));
            } while (conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os vendedores!\n" + ex.getMessage());
        }
    }

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
        jTablePesquisaProduto.setModel(modelo);
        jTablePesquisaProduto.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTablePesquisaProduto.getColumnModel().getColumn(0).setResizable(false);
        jTablePesquisaProduto.getColumnModel().getColumn(1).setPreferredWidth(275);
        jTablePesquisaProduto.getColumnModel().getColumn(1).setResizable(false);
        jTablePesquisaProduto.getColumnModel().getColumn(2).setPreferredWidth(115);
        jTablePesquisaProduto.getColumnModel().getColumn(2).setResizable(false);
        jTablePesquisaProduto.getColumnModel().getColumn(3).setPreferredWidth(110);
        jTablePesquisaProduto.getColumnModel().getColumn(3).setResizable(false);
        jTablePesquisaProduto.getTableHeader().setReorderingAllowed(false);
        jTablePesquisaProduto.setAutoResizeMode(jTablePesquisaProduto.AUTO_RESIZE_OFF);
        jTablePesquisaProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /*
     Realizar limpeza dos campos 
     */
    public void limparCampos() {

        txtIDProduto.setText(null);
        txtDescricao.setText(null);
        txtQtd.setText(null);
        txtDataChegada.setText(null);
    }

    /*
     Buscar id do Vendedor para salvar no ArrayList
     */
    public void buscarCodigoVendedor(String nome) {
        conecta.conexao();
        conecta.executaSQL("select * from vendedor where nome_vendedor = '" + nome + "'");
        try {
            conecta.rs.first();
            codigoVendedor = conecta.rs.getInt("id_vendedor");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar codigo do vendedor.\n" + ex);
        }
        conecta.desconecta();
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
            java.util.logging.Logger.getLogger(EntradaProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaProduto().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarEntrada;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox cmbVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableItensEntrada;
    private javax.swing.JTable jTablePesquisaProduto;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNotificacao;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JFormattedTextField txtDataChegada;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIDEntrada;
    private javax.swing.JTextField txtIDProduto;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
