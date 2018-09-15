package teatroInterfaces;

import javax.swing.JOptionPane;
import teatro.Espectador;
import teatroDados.EspectadorDados;

public class CadastroUsuario extends javax.swing.JFrame {

    private boolean confirmar = false;
    private boolean news = false;
    private boolean us;
    private String us1 = "Usuário inválido. \n";
    private boolean se;
    private String se1 = "Senha inválida. \n";
    private boolean cs;
    private String cs1 = "Senhas diferentes.\n";
    private boolean no;
    private String no1 = "Digite um nome.\n";
    private boolean r;
    private String r1 = "Digite um RG.\n";
    private boolean cp;
    private String cp1 = "Digite um CPF válido.\n";
    private boolean dn;
    private String dn1 = "Digite uma data de nascimento.\n";
    private boolean de;
    private String de1 = "Digite uma data de expedição.\n";
    private boolean or;
    private String or1 = "Digite um órgão expedidor\n";
    private boolean te;
    private String te1 = "Digite um telefone.\n";
    private boolean em;
    private String em1 = "Digite um email.\n";
    private boolean en;
    private String en1 = "Digite um endereço.\n";
    private boolean pr;
    private String pr1 = "Digite uma profissão.\n";
    private boolean emp;
    private String emp1 = "Digite uma empresa.\n";
    private boolean ec;
    private String ec1 = "Digite o endereço comercial.\n";

    public CadastroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        dataNasc = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rg = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        orgao = new javax.swing.JTextField();
        dataExp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        profissao = new javax.swing.JTextField();
        empresa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jButtonCriarConta = new javax.swing.JButton();
        endCom = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        textoConfirmarSenha = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JLabel();
        textoSenha = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        confSenha = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Usuário");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuarioKeyReleased(evt);
            }
        });

        jLabel1.setText("Usuário:  ");

        jLabel2.setText("Senha:");

        jLabel3.setText("Nome Completo:");

        jLabel4.setText("Data Nascimento:");

        jLabel6.setText("CPF:");

        jLabel7.setText("RG:");

        jLabel8.setText("Orgão Expedidor:");

        jLabel9.setText("Data Expedição:");

        jLabel10.setText("Telefone:");

        jLabel11.setText("Email:");

        jLabel12.setText("Endereço: ");

        jLabel13.setText("Empresa: ");

        jLabel14.setText("Profissão: ");

        jLabel15.setText("End Comercial: ");

        jButtonCriarConta.setText("Criar nova conta");
        jButtonCriarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCriarContaMouseClicked(evt);
            }
        });

        jLabel16.setText("Confirmar Senha:");

        senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                senhaKeyReleased(evt);
            }
        });

        confSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confSenhaKeyReleased(evt);
            }
        });

        jCheckBox1.setText("Deseja receber novidades por email?");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCriarConta))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)))
                            .addComponent(jLabel11))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jCheckBox1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(endCom)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(profissao, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(endereco)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(20, 20, 20)
                                    .addComponent(nome))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGap(14, 14, 14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(orgao, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dataExp)
                                            .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel16))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                        .addComponent(senha))
                                    .addComponent(confSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoSenha)
                                    .addComponent(textoUsuario)
                                    .addComponent(textoConfirmarSenha))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoUsuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoSenha)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(textoConfirmarSenha)
                    .addComponent(confSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(dataExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(orgao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(profissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(endCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButtonCriarConta)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCriarContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCriarContaMouseClicked
        if (confereCadastro() == true) {
            criarUsuario();
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!", "Cadastro", 1);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, us1 + se1 + cs1 + no1 + r1 + cp1 + dn1 + de1 + or1 + te1 + em1 + en1 + pr1 + emp1 + ec1, "Erro", 0);
        }
    }//GEN-LAST:event_jButtonCriarContaMouseClicked

    private void usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyReleased
        String aux;
        aux = usuario.getText();
        if (aux.length() < 4) {
            textoUsuario.setText("Digite no mínimo 4 caracteres");
        } else if (verificaUser() == true) {
            textoUsuario.setText("Disponível");
        } else {
            textoUsuario.setText("Já existe esse usuário.");
        }

    }//GEN-LAST:event_usuarioKeyReleased

    private boolean verificaUser() {
        EspectadorDados especD=new EspectadorDados();
        especD.leEspectador();
        
        if(especD.verificaUser(usuario.getText())){
            return true;
        }else {
        return false;
        }
    }

    private void senhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaKeyReleased
        String aux, auxC;
        aux = senha.getText();
        if (aux.length() < 6) {
            textoSenha.setText("A senha deve conter no mínimo 6 caracteres");
        } else {
            textoSenha.setText("");
        }
        auxC = confSenha.getText();
        if (aux.equals(auxC)) {
            textoConfirmarSenha.setText("Senhas iguais.");
        } else {
            textoConfirmarSenha.setText("Senhas diferentes.");
        }

    }//GEN-LAST:event_senhaKeyReleased

    private void confSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confSenhaKeyReleased
        String aux, auxC;
        aux = senha.getText();
        auxC = confSenha.getText();
        if (aux.equals(auxC)) {
            textoConfirmarSenha.setText("Senhas iguais.");
        } else {
            textoConfirmarSenha.setText("Senhas diferentes.");
        }

    }//GEN-LAST:event_confSenhaKeyReleased

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        news = !news;
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private boolean confereCadastro() {
        int aux = 0;
        if ((usuario.getText().length() > 3) && (verificaUser() == true)) {
            us = true;
            us1 = "";
            aux++;
        }
        if (senha.getText().length() > 5) {
            se = true;
            se1 = "";
            aux++;
        }
        if (senha.getText().equals(confSenha.getText())) {
            cs = true;
            cs1 = "";
            aux++;
        }
        if (nome.getText().length() > 0) {
            no = true;
            no1 = "";
            aux++;
        }
        if (rg.getText().length() > 0) {
            r = true;
            r1 = "";
            aux++;
        }
        if (cpf.getText().length()>5) {
            cp = true;
            cp1 = "";
            aux++;
        }
        if (dataNasc.getText().length() > 0) {
            dn = true;
            dn1 = "";
            aux++;
        }
        if (dataExp.getText().length() > 0) {
            de = true;
            de1 = "";
            aux++;
        }
        if (orgao.getText().length() > 0) {
            or = true;
            or1 = "";
            aux++;
        }
        if (telefone.getText().length() > 0) {
            te = true;
            te1 = "";
            aux++;
        }
        if (email.getText().length() > 0) {
            em = true;
            em1 = "";
            aux++;
        }
        if (endereco.getText().length() > 0) {
            en = true;
            en1 = "";
            aux++;
        }
        if (profissao.getText().length() > 0) {
            pr = true;
            pr1 = "";
            aux++;
        }
        if (empresa.getText().length() > 0) {
            emp = true;
            emp1 = "";
            aux++;
        }
        if (endCom.getText().length() > 0) {
            ec = true;
            ec1 = "";
            aux++;
        }
        if (aux == 15) {
            return true;
        } else {
            return false;
        }
    }

    private void criarUsuario() {
        Espectador user = new Espectador();
        user.setUsuario(usuario.getText());
        user.setSenha(senha.getText());
        user.setCpf(cpf.getText());
        user.setEndereco(endereco.getText());
        user.setDataEmissao(dataExp.getText());
        user.setDataNascimento(dataNasc.getText());
        user.setEmail(email.getText());
        user.setLocalDeTrabalho(empresa.getText());
        user.setEnderecoComercial(endCom.getText());
        user.setNome(nome.getText());
        user.setOrgaoEmissor(orgao.getText());
        user.setProfissao(profissao.getText());
        user.setRg(Integer.parseInt(rg.getText()));
        user.setTelefone(telefone.getText());
        user.setNewsletter(news);

        teatroDados.EspectadorDados especDados = new teatroDados.EspectadorDados();
        especDados.adicionaDados(user);
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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confSenha;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField dataExp;
    private javax.swing.JTextField dataNasc;
    private javax.swing.JTextField email;
    private javax.swing.JTextField empresa;
    private javax.swing.JTextField endCom;
    private javax.swing.JTextField endereco;
    private javax.swing.JButton jButtonCriarConta;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField orgao;
    private javax.swing.JTextField profissao;
    private javax.swing.JTextField rg;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField telefone;
    private javax.swing.JLabel textoConfirmarSenha;
    private javax.swing.JLabel textoSenha;
    private javax.swing.JLabel textoUsuario;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
