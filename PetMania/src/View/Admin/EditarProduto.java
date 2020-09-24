/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Admin;

import Model.Bean.Produtos;
import Model.DAO.ProdutoDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class EditarProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form ChecarEstoque
     */
    public EditarProduto() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        jTProdutos.setRowSorter(new TableRowSorter(modelo));

        readJTable();

    }

    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();

        for (Produtos p : pdao.read()) {

            modelo.addRow(new Object[]{
                p.getId(),
                p.getProduto(),
                p.getPreco(),
                p.getQtd()
                
            });

        }

    }
    public void readJTableForDesc(String desc) {
        
        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();

        for (Produtos p : pdao.readForDesc(desc)) {

            modelo.addRow(new Object[]{
                p.getId(),
                p.getProduto(),
                p.getPreco(),
                p.getQtd()
            });

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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtBuscaDesc = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtQtd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtProduto = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        btLimpar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutosMouseClicked(evt);
            }
        });
        jTProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTProdutosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTProdutos);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Editar estoque");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pallet.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Digite o nome do produto:");

        txtBuscaDesc.setBackground(new java.awt.Color(240, 240, 240));
        txtBuscaDesc.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
        txtBuscaDesc.setForeground(new java.awt.Color(51, 51, 51));
        txtBuscaDesc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtBuscaDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaDescActionPerformed(evt);
            }
        });

        btBuscar.setBackground(new java.awt.Color(255, 255, 0));
        btBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        txtQtd.setBackground(new java.awt.Color(240, 240, 240));
        txtQtd.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
        txtQtd.setForeground(new java.awt.Color(51, 51, 51));
        txtQtd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Quantidade:");

        txtProduto.setBackground(new java.awt.Color(240, 240, 240));
        txtProduto.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
        txtProduto.setForeground(new java.awt.Color(51, 51, 51));
        txtProduto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });

        txtPreco.setBackground(new java.awt.Color(240, 240, 240));
        txtPreco.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
        txtPreco.setForeground(new java.awt.Color(51, 51, 51));
        txtPreco.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("Produto:");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setText("Preço(R$):");

        btLimpar.setBackground(new java.awt.Color(255, 204, 204));
        btLimpar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(102, 255, 102));
        btEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBuscaDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(80, 80, 80))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 2, Short.MAX_VALUE))))
            .addComponent(jSeparator7)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaDescActionPerformed

    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdActionPerformed

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtProduto.setText("");
        txtQtd.setText("");
        txtPreco.setText("");
        txtBuscaDesc.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        readJTableForDesc(txtBuscaDesc.getText());
    }//GEN-LAST:event_btBuscarActionPerformed

    private void jTProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutosMouseClicked
        if (jTProdutos.getSelectedRow() != -1) {

            txtProduto.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString());
            txtPreco.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 2).toString());
            txtQtd.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 3).toString());
            
        }
    }//GEN-LAST:event_jTProdutosMouseClicked

    private void jTProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdutosKeyReleased
        if (jTProdutos.getSelectedRow() != -1) {

            txtProduto.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString());
            txtPreco.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 2).toString());
            txtQtd.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 3).toString());
            

        }
    }//GEN-LAST:event_jTProdutosKeyReleased

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
            
            if (jTProdutos.getSelectedRow() != -1) {
                if(txtProduto.getText().isEmpty()||txtQtd.getText().isEmpty()||txtPreco.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Selecione todos os campos", "PetMania informa...", JOptionPane.ERROR_MESSAGE);
                }else{
                Produtos p = new Produtos();
                ProdutoDAO dao = new ProdutoDAO();

                p.setProduto(txtProduto.getText());
                p.setPreco(Double.parseDouble(txtPreco.getText()));
                p.setQtd(Integer.parseInt(txtQtd.getText()));
                p.setId((int) jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 0));
                dao.update(p);

                txtProduto.setText("");
                txtQtd.setText("");
                txtPreco.setText("");

                readJTable();
                }
            }
           
        
        
    }//GEN-LAST:event_btEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JTextField txtBuscaDesc;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
