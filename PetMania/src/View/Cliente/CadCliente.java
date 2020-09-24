package View.Cliente;


import Model.Bean.Usuarios;
import Model.DAO.UsuarioDAO;
import View.Login.Login;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadCliente extends javax.swing.JFrame {

    public CadCliente() {
        initComponents();
        setIcon();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sobrenome = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        data_nasc = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        funcao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nucleo = new javax.swing.JTextField();
        cpf = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btFechar = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btMinimizar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new View.Cliente.JTextFieldHint(new JTextField(),"usericon", "Insira seu email");
        jLabel14 = new javax.swing.JLabel();
        formatedTell = new javax.swing.JFormattedTextField();
        txtEnd = new View.Cliente.JTextFieldHint(new JTextField(),"usericon", "Nome da rua-endereço-bairro");
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        formatedCPF = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        txtconfsenha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        bt_voltar = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Nome:");

        nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nome.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Sobrenome:");

        sobrenome.setPreferredSize(new java.awt.Dimension(100, 25));

        email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        email.setPreferredSize(new java.awt.Dimension(100, 25));

        try {
            data_nasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data_nasc.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Data de Nascimento:");

        funcao.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Função:");

        nucleo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nucleo.setPreferredSize(new java.awt.Dimension(100, 25));
        nucleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nucleoActionPerformed(evt);
            }
        });

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("CPF:");

        jLabel12.setText("jLabel12");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(234, 0, 0));

        btFechar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btFechar.setText("X");
        btFechar.setPreferredSize(new java.awt.Dimension(35, 25));
        btFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFecharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        btMinimizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btMinimizar.setText("_");
        btMinimizar.setPreferredSize(new java.awt.Dimension(35, 25));
        btMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.setPreferredSize(new java.awt.Dimension(264, 33));

        jLabel2.setFont(new java.awt.Font("Carlito", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Cuidado e atenção para seu amiguinho");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LogoPetMania.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNome.setPreferredSize(new java.awt.Dimension(100, 27));

        txtEmail.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtEmail.setPreferredSize(new java.awt.Dimension(100, 27));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Confirmar senha:");

        formatedTell.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        try {
            formatedTell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" (##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formatedTell.setPreferredSize(new java.awt.Dimension(100, 27));

        txtEnd.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
        txtEnd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtEnd.setPreferredSize(new java.awt.Dimension(100, 27));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Telefone:");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Endereço:");

        formatedCPF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        try {
            formatedCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formatedCPF.setPreferredSize(new java.awt.Dimension(100, 27));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("CPF:");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Senha:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Email:");

        btCadastrar.setBackground(new java.awt.Color(204, 255, 204));
        btCadastrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
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

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Cadastro");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/AddUser.png"))); // NOI18N

        txtsenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtconfsenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        bt_voltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(102, 102, 102));
        bt_voltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_voltar.setText("<== Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel13)
                                                .addComponent(formatedCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                                .addComponent(jLabel17)
                                                .addComponent(jLabel15)
                                                .addComponent(jSeparator9, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                                .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                                .addComponent(txtsenha))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(formatedTell, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                            .addComponent(jSeparator5)
                                                            .addComponent(jLabel16))
                                                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel14))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(txtconfsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jSeparator6))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6)
                                    .addComponent(jSeparator7)
                                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel18))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtsenha, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(txtconfsenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(formatedTell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formatedCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nucleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nucleoActionPerformed
        
    }//GEN-LAST:event_nucleoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Usuarios novo = new Usuarios();
        UsuarioDAO u = new UsuarioDAO();
              
        String Nome = txtNome.getText();
        String Email = txtEmail.getText();
        String Senha = new String(txtsenha.getPassword());
        String ConfSenha = new String(txtconfsenha.getPassword());
        String CPF = formatedCPF.getText();
        String Telefone = formatedTell.getText();
        String End = txtEnd.getText();
        
        
        if((Nome.equals(""))||(Email.equals(""))||(Senha.equals(""))||(ConfSenha.equals(""))||(CPF.equals(""))||(Telefone.equals(""))||(End.equals(""))){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.", "Erro",JOptionPane.ERROR_MESSAGE);
        }
        else if (new String(txtsenha.getPassword()).equals(new String(txtconfsenha.getPassword()))){
            if(0<-1){}/*Isso não é NADA*/
            else{
            novo.setNome(Nome);
            novo.setEmail(Email);
            novo.setSenha(Senha);
            novo.setCpf(CPF);
            novo.setTelefone(Telefone);
            novo.setEndereco(End);
            
            u.create(novo);
   
           JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso " + Nome, "Bem-vindo(a) ao PetMania",JOptionPane.INFORMATION_MESSAGE);
           
           PrincipalUser aberto = new PrincipalUser();
           aberto.setVisible(true);
           dispose();
           
           
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Senhas diferentes.", "Preencha novamente",JOptionPane.ERROR_MESSAGE);
        }
        
        

        
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btFecharMouseClicked

    private void btMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMinimizarMouseClicked
        this.setState(CadCliente.ICONIFIED);
    }//GEN-LAST:event_btMinimizarMouseClicked

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtNome.setText("");
        txtEmail.setText("");
        txtsenha.setText("");
        txtconfsenha.setText("");
        formatedCPF.setText("");
        formatedTell.setText("");
        txtEnd.setText("");
        
    }//GEN-LAST:event_btLimparActionPerformed

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        Login volta = new Login();
        volta.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_voltarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JLabel btFechar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel btMinimizar;
    private javax.swing.JLabel bt_voltar;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JFormattedTextField data_nasc;
    private javax.swing.JTextField email;
    private javax.swing.JFormattedTextField formatedCPF;
    private javax.swing.JFormattedTextField formatedTell;
    private javax.swing.JTextField funcao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nucleo;
    private javax.swing.JTextField sobrenome;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtconfsenha;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
                setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/Pegada.png"))); 

    }
}
