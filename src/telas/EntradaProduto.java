/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import DAO.DaoEntrada;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import sqlconexao.ConectaBanco;
import utilitarios.Entrada;
import utilitarios.EntradaEstoque;
import utilitarios.FuncoesTelaEntrada;
import utilitarios.ModeloTabela;

/**
 *
 * @author Weslley.Campos
 */
public class EntradaProduto extends javax.swing.JFrame {

//Declara conexão com banco de dados
    ConectaBanco conecta = new ConectaBanco();
    
    EntradaEstoque ee = new EntradaEstoque();

    //Declaração da variável IDEntrada para capturar e inserir por padrão o ID Entrada
    int idEntrada, codigoVendedor;

    public EntradaProduto() {
        initComponents();
        preencherCombo();
        preencherIdEntrada();
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
        jLabel5 = new javax.swing.JLabel();
        txtIDProduto = new javax.swing.JTextField();
        cmbVendedor = new javax.swing.JComboBox();
        lblVendedor = new javax.swing.JLabel();
        txtIDEntrada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblNotificacao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

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

        jLabel5.setText("Codigo produto");

        txtIDProduto.setEditable(false);

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

        txtIDEntrada.setEditable(false);

        jLabel4.setText("Codigo entrada");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtIDEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblQtd)
                        .addGap(36, 36, 36)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblVendedor)
                        .addGap(46, 46, 46)
                        .addComponent(cmbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataChegada, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdicionarEntrada)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNotificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIDEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQtd)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendedor)
                    .addComponent(cmbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData)
                    .addComponent(txtDataChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnConfirmar)
                                    .addGap(32, 32, 32)
                                    .addComponent(btnCancelar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSair))
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblDescricao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDescricao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBuscar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEntradaActionPerformed

        int idEntrada = Integer.parseInt(txtIDEntrada.getText());
        int idProduto = Integer.parseInt(txtIDProduto.getText());
        String idVendedor = (String) cmbVendedor.getSelectedItem();
        String dataChegada = txtDataChegada.getText();
        int qtdItem = Integer.parseInt(txtQtd.getText());
        String descricaoProduto = txtDescricao.getText();
        
        Entrada e = new Entrada(idEntrada, idProduto, idVendedor, dataChegada, qtdItem, descricaoProduto);
        ee.incluiEstoque(e);
        
        System.out.println(e);
//        if (txtIDProduto.getText().equals("")) {
//            lblNotificacao.setForeground(Color.red);
//            lblNotificacao.setText("Para adicionar no carrinho, por favor selecione um ou mais produtos!");
//        } else if (txtQtd.getText().equals("") || txtDataChegada.getText().equals("")) {
//            lblNotificacao.setForeground(Color.red);
//            txtQtd.setBackground(Color.yellow);
//            txtDataChegada.setBackground(Color.yellow);
//            lblNotificacao.setText("Para adicionar no carrinho, por favor informe os valores nos campos indicados!");
//        } else {
//
//            boolean validar;
//            int idProduto = 0, qtdItem = 0;
//
//            idProduto = Integer.parseInt(txtIDProduto.getText());
//            qtdItem = Integer.parseInt(txtQtd.getText());
//
//            validar = validaQuantidadeMaxima(idProduto, qtdItem);
//            if (validar == false) {
//                //adicionar a lista de entrada
//                //TESTANDO
//
//                DaoEntrada salvar = new DaoEntrada();
//                Entrada ent = new Entrada();
//
//                ent.setIdEntrada(Integer.parseInt(txtIDEntrada.getText()));
//                ent.setIdProduto(Integer.parseInt(txtIDProduto.getText()));
//                ent.setIdVendedor((String) cmbVendedor.getSelectedItem());
//                ent.setDataChegada(txtDataChegada.getText());
//                ent.setQtdItem(Integer.parseInt(txtQtd.getText()));
//                salvar.SalvarEntrada(ent);
//
//                lblNotificacao.setForeground(Color.blue);
//                txtQtd.setBackground(Color.white);
//                txtDataChegada.setBackground(Color.white);
//                lblNotificacao.setText("Produto adicionado na lista de entrada.");
//                preencherTabelaItens("select p.descricao_produto as [NomeProduto],m.data_chegada as [DataChegada],m.qtd as [qtd] "
//                        + "from movimentacao_entrada as m inner join produto as p "
//                        + "on m.ID_PRODUTO = p.ID_PRODUTO where m.ID_ENTRADA =" + txtIDEntrada.getText() + "");
//            } else {
//                lblNotificacao.setForeground(Color.red);
//                lblNotificacao.setText("A quantidade informada irá ultrapassar a máxima desejada para esse produto!");
//            }
//        }
    }//GEN-LAST:event_btnAdicionarEntradaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

//        new PesquisarProdutos().setVisible(true);
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


    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtDataChegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataChegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataChegadaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * Realizar a busca do ultimo ID entrada para que novas entradas não se
     * repitam com entrada anterior... Em desenvolvimento...
     */
    public void preencherIdEntrada() {
        conecta.conexao();
        conecta.executaSQL("select max(id_entrada + 1)[max] from movimentacao_entrada");
        try {
            conecta.rs.first();
            idEntrada = conecta.rs.getInt("max");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar ultimo  IdEntrada.\n" + ex);
        }
        conecta.desconecta();
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

    public void preencherTabelaItens(String SQL) {

        ArrayList dadosItens = new ArrayList();

//        buscarCodigoVendedor((String) cmbVendedor.getSelectedItem());
        //Na String, inserir os nomes das colunas conforme informações que serão apresentadas
        String[] Colunas = new String[]{"Descricao Produto", "Data de Chegada", "Quantidade incluída"};

        //Inicia conexão com banco
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do {
                /*Adiciona no objeto da Tabela, todas as informações que deseja apresentar na tabela de 
                 *Pesquisa dos produtos
                 */
                dadosItens.add(new Object[]{conecta.rs.getString("NomeProduto"), conecta.rs.getString("DataChegada"), conecta.rs.getInt("qtd")});
            } while (conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não existe produtos com o texto digitado.\n" + ex.getMessage());
        }

        //dados.add(new Object[]{txtIDEntrada.getText(), txtIDProduto.getText(), codigoVendedor, txtDataChegada.getText(), txtDescricao.getText(), txtQtd.getText()});

        /*
         *Criar todas as colunas e ordenar sequencia...
         *Conforme adição dos dados acima
         */
        ModeloTabela modelo = new ModeloTabela(dadosItens, Colunas);
        jTableItensEntrada.setModel(modelo);
        jTableItensEntrada.getColumnModel().getColumn(0).setPreferredWidth(250);
        jTableItensEntrada.getColumnModel().getColumn(0).setResizable(false);
        jTableItensEntrada.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTableItensEntrada.getColumnModel().getColumn(1).setResizable(false);
        jTableItensEntrada.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTableItensEntrada.getColumnModel().getColumn(2).setResizable(false);
        jTableItensEntrada.getTableHeader().setReorderingAllowed(false);
        jTableItensEntrada.setAutoResizeMode(jTableItensEntrada.AUTO_RESIZE_OFF);
        jTableItensEntrada.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public boolean validaQuantidadeMaxima(int idProduto, int qtdItem) {

        int qtdAtual = 0, somaQtd = 0, qtdMaxima;
        boolean validar = false;
        conecta.conexao();
        conecta.executaSQL("select * from produto where id_produto =" + idProduto + "");
        try {
            conecta.rs.first();
            qtdAtual = conecta.rs.getInt("QTD_ESTOQUE");
            qtdMaxima = conecta.rs.getInt("QTD_MAXIMO");
            somaQtd = qtdAtual + qtdItem;

            if (somaQtd > qtdMaxima) {
                validar = true;

            } else {

            }

        } catch (SQLException ex) {
            Logger.getLogger(FuncoesTelaEntrada.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return validar;
    }

    public void limparCampos() {

        txtIDProduto.setText(null);
        txtDescricao.setText(null);
        txtQtd.setText(null);
        txtDataChegada.setText(null);

    }

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
    private javax.swing.JLabel jLabel5;
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
