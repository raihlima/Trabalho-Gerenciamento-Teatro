package teatroInterfaces;

import javax.swing.JOptionPane;
import teatro.Artista;

public class AdicionarArtista extends javax.swing.JFrame {

    private boolean confirmar = false;
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

    public AdicionarArtista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        dataNasc = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dataExp = new javax.swing.JTextField();
        orgao = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        adicionarArtista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Artista");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Endereço:");

        jLabel3.setText("Data Nasc:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("CPF:");

        jLabel6.setText("Data Expedição:");

        jLabel7.setText("Órgão Expedidor:");

        jLabel8.setText("RG:");

        jLabel9.setText("Email:");

        adicionarArtista.setText("Adicionar Artista");
        adicionarArtista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarArtistaMouseClicked(evt);
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
                        .addComponent(adicionarArtista))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dataNasc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(rg, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cpf, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(8, 8, 8)
                                        .addComponent(orgao, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                            .addComponent(dataExp)))))
                            .addComponent(nome)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email)
                            .addComponent(endereco))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(dataExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(orgao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(adicionarArtista)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarArtistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarArtistaMouseClicked
        if (confereCadastro() == true) {
            criarArtista();
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!", "Cadastro", 1);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, no1 + r1 + cp1 + dn1 + de1 + or1 + te1 + em1 + en1, "Erro", 0);
        }
    }//GEN-LAST:event_adicionarArtistaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened
    // Funcoes para verficar se é válido
    private boolean confereCadastro() {
        int aux = 0;

        if (nome.getText().length() > 0) {
            no = true;
            no1 = "";
            aux++;
        } else {
            no = false;
            no1 = "Digite um nome.\n";
            aux--;

        }
        if (rg.getText().length() > 0) {
            r = true;
            r1 = "";
            aux++;
        } else {
            r = false;
            r1 = "Digite um RG.\n";
            aux--;

        }
        if (cpf.getText().length() > 5) {
            cp = true;
            cp1 = "";
            aux++;
        } else {
            cp = false;
            cp1 = "Digite um CPF válido.\n";
            aux--;
        }
        if (dataNasc.getText().length() > 0) {
            dn = true;
            dn1 = "";
            aux++;
        } else {
            dn = false;
            dn1 = "Digite uma data de nascimento.\n";
            aux--;

        }
        if (dataExp.getText().length() > 0) {
            de = true;
            de1 = "";
            aux++;
        } else {
            de = false;
            de1 = "Digite uma data de expedição.\n";
            aux--;

        }
        if (orgao.getText().length() > 0) {
            or = true;
            or1 = "";
            aux++;
        } else {
            or = false;
            or1 = "Digite um órgão expedidor\n";
            aux--;

        }
        if (telefone.getText().length() > 0) {
            te = true;
            te1 = "";
            aux++;
        } else {
            te = false;
            te1 = "Digite um telefone.\n";
            aux--;

        }
        if (email.getText().length() > 0) {
            em = true;
            em1 = "";
            aux++;
        } else {
            em = false;
            em1 = "Digite um email.\n";
            aux--;

        }
        if (endereco.getText().length() > 0) {
            en = true;
            en1 = "";
            aux++;
        } else {
            en = false;
            en1 = "Digite um endereço.\n";
            aux--;
        }
        if (aux == 9) {
            return true;
        } else {
            return false;
        }
    }

    private boolean confereCpf() {
        String aux = cpf.getText();
        if (aux.length() == 11) {
            return true;
        } else {
            return false;
        }
    }

    private void criarArtista() {
        Artista artista = new Artista();
        artista.setCpf(cpf.getText());
        artista.setEndereco(endereco.getText());
        artista.setDataEmissao(dataExp.getText());
        artista.setDataNascimento(dataNasc.getText());
        artista.setEmail(email.getText());
        artista.setNome(nome.getText());
        artista.setOrgaoEmissor(orgao.getText());
        artista.setRg(Integer.parseInt(rg.getText()));
        artista.setTelefone(telefone.getText());

        teatroDados.ArtistaDados artDados = new teatroDados.ArtistaDados();
        artDados.adicionaDados(artista);
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
            java.util.logging.Logger.getLogger(AdicionarArtista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarArtista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarArtista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarArtista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarArtista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarArtista;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField dataExp;
    private javax.swing.JTextField dataNasc;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereco;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField rg;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}
