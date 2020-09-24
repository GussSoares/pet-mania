package View.Login;


import Model.DAO.AdmLogDAO;
import Model.DAO.LoginDAO;
import View.Admin.PrincipalAdm;
import javax.swing.JTextField;
import View.Cliente.CadCliente;
import View.Cliente.PrincipalUser;
import java.awt.Toolkit;
import javaapplication2.JPassWordFieldHint;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jP_Fechar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTF_Nome = new View.Login.JTextFieldHint(new JTextField(),"usericon", "Nome de usuário");
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPF_Senha = new JPassWordFieldHint(new JPasswordField(), "padlock", "Digite sua senha");
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btEntrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCadastro = new javax.swing.JLabel();
        jP_Fechar1 = new javax.swing.JPanel();
        btMinimizar = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LogoPetMania.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Carlito", 2, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Cuidado e atenção para seu amiguinho");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jP_Fechar.setBackground(new java.awt.Color(255, 0, 0));
        jP_Fechar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jP_Fechar.setPreferredSize(new java.awt.Dimension(35, 25));
        jP_Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP_FecharMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");

        javax.swing.GroupLayout jP_FecharLayout = new javax.swing.GroupLayout(jP_Fechar);
        jP_Fechar.setLayout(jP_FecharLayout);
        jP_FecharLayout.setHorizontalGroup(
            jP_FecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_FecharLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jP_FecharLayout.setVerticalGroup(
            jP_FecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");

        jTF_Nome.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
        jTF_Nome.setForeground(new java.awt.Color(51, 51, 51));
        jTF_Nome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Senha:");

        jPF_Senha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPF_Senha.setForeground(new java.awt.Color(51, 51, 51));
        jPF_Senha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Se você não possui uma conta");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        btEntrar.setBackground(new java.awt.Color(204, 255, 204));
        btEntrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(255, 204, 204));
        btLimpar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCadastro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btCadastro.setForeground(new java.awt.Color(0, 102, 204));
        btCadastro.setText("clique aqui!");
        btCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastroMouseClicked(evt);
            }
        });

        jP_Fechar1.setBackground(new java.awt.Color(204, 204, 204));
        jP_Fechar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jP_Fechar1.setPreferredSize(new java.awt.Dimension(35, 25));
        jP_Fechar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP_Fechar1MouseClicked(evt);
            }
        });

        btMinimizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btMinimizar.setText("_");
        btMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jP_Fechar1Layout = new javax.swing.GroupLayout(jP_Fechar1);
        jP_Fechar1.setLayout(jP_Fechar1Layout);
        jP_Fechar1Layout.setHorizontalGroup(
            jP_Fechar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btMinimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );
        jP_Fechar1Layout.setVerticalGroup(
            jP_Fechar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jP_Fechar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jP_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jPF_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(38, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(129, 129, 129))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP_Fechar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPF_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btCadastro))
                .addContainerGap(43, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(665, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
            
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jP_FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_FecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jP_FecharMouseClicked

    private void jP_Fechar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_Fechar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_Fechar1MouseClicked

    private void btMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMinimizarMouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_btMinimizarMouseClicked

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        jTF_Nome.setText("");
        jPF_Senha.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastroMouseClicked
        CadCliente frameMenuA = new CadCliente();
        frameMenuA.setLocationRelativeTo(null);
        frameMenuA.setVisible(true);
        dispose();
    }//GEN-LAST:event_btCadastroMouseClicked

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        //Login do administrador dentro do BD
        AdmLogDAO daoad = new AdmLogDAO();
        if(daoad.checkLogin(jTF_Nome.getText(), new String (jPF_Senha.getPassword()))){
            PrincipalAdm open = new PrincipalAdm();
            open.setVisible(true);
            dispose();
        }
        
        //se os ipnuts estiverem vazios, aparece uma mensagem
        else if(jTF_Nome.getText().isEmpty() || new String (jPF_Senha.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos", "ERRO", JOptionPane.ERROR_MESSAGE);  
        }
        
        //procurando o usuario no BD. se tiver, entra.
        else{
            LoginDAO dao = new LoginDAO();
            
            if(dao.checkLogin(jTF_Nome.getText(), new String (jPF_Senha.getPassword()))){
                new PrincipalUser().setVisible(true);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos!", "ERRO", JOptionPane.ERROR_MESSAGE);
                jTF_Nome.setText("");
                jPF_Senha.setText("");
            }
            
        }
        
        
        
    }//GEN-LAST:event_btEntrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btCadastro;
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel btMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPF_Senha;
    private javax.swing.JPanel jP_Fechar;
    private javax.swing.JPanel jP_Fechar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTF_Nome;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/Pegada.png")));
    }
}
