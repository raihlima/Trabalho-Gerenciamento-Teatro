package teatroInterfaces;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import teatro.*;
import teatroDados.*;

public class MenuUser extends javax.swing.JFrame {

    Espectador e;
    int index;

    public MenuUser() {

        initComponents();
    }

    public MenuUser(int i, Espectador e) {
        initComponents();
        this.index = i;
        this.e = e;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sair = new javax.swing.JButton();
        setPerfil = new javax.swing.JButton();
        setSenha = new javax.swing.JButton();
        comprarIngresso = new javax.swing.JButton();
        verIngressos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelDataLog = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        preferencias = new javax.swing.JButton();
        fale = new javax.swing.JButton();
        busca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema do teatro");
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });

        setPerfil.setText("Editar Perfil");
        setPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setPerfilMouseClicked(evt);
            }
        });

        setSenha.setText("Editar Senha");
        setSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setSenhaMouseClicked(evt);
            }
        });

        comprarIngresso.setText("Comprar Ingresso");
        comprarIngresso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarIngressoMouseClicked(evt);
            }
        });

        verIngressos.setText("Visualizar Ingressos");
        verIngressos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verIngressosMouseClicked(evt);
            }
        });

        jLabel1.setText("Logado em:");

        jLabel2.setText("Servidor:");

        jLabelDataLog.setText("jLabel3");

        jLabelData.setText("jLabel3");

        preferencias.setText("Preferências de Espetáculo");
        preferencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                preferenciasMouseClicked(evt);
            }
        });

        fale.setText("Fale Conosco");
        fale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faleMouseClicked(evt);
            }
        });

        busca.setText("Procurar Espetáculos");
        busca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDataLog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelData))
                    .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(preferencias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comprarIngresso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(setPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(setSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(verIngressos, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(busca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setPerfil)
                    .addComponent(setSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprarIngresso)
                    .addComponent(verIngressos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preferencias)
                    .addComponent(busca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(fale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabelDataLog)
                    .addComponent(jLabelData))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        teatroInterfaces.Login login = new teatroInterfaces.Login();
        JOptionPane.showMessageDialog(null, "Desconectado com sucesso!", "Logout", 1);
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_sairMouseClicked

    private void setPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setPerfilMouseClicked
        EditarUsuario setUser = new EditarUsuario(index, e);
        setUser.setVisible(true);
    }//GEN-LAST:event_setPerfilMouseClicked

    private void setSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setSenhaMouseClicked
        teatroInterfaces.EditarSenha editSenha = new teatroInterfaces.EditarSenha(index, e);
        editSenha.setVisible(true);
    }//GEN-LAST:event_setSenhaMouseClicked

    private void comprarIngressoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarIngressoMouseClicked
        teatroInterfaces.ComprarIngresso cI = new teatroInterfaces.ComprarIngresso(index, e);
        cI.setVisible(true);
    }//GEN-LAST:event_comprarIngressoMouseClicked

    private void verIngressosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verIngressosMouseClicked
        ListarIngressosUser listarUser = new ListarIngressosUser(index, e);
        ArrayList<Ingresso> ingr = new ArrayList<>();
        ingr = e.getIngressos();
        listarUser.setVisible(true);
    }//GEN-LAST:event_verIngressosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        //Exibe data do login
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        jLabelDataLog.setText(formato.format(dataSistema));
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        //Exibe data do servidor
        EspectadorDados espectadorDados = new EspectadorDados();
        espectadorDados.leEspectador();
        e = espectadorDados.retornaEspectador(index);
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        jLabelData.setText(formato.format(dataSistema));
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        //Atualiza data do servidor
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        jLabelData.setText(formato.format(dataSistema));
    }//GEN-LAST:event_formWindowLostFocus

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        //Atualiza data do servidor
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        jLabelData.setText(formato.format(dataSistema));
    }//GEN-LAST:event_formMouseMoved

    private void faleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faleMouseClicked
        Suporte su = new Suporte();
        su.setVisible(true);
    }//GEN-LAST:event_faleMouseClicked

    private void preferenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preferenciasMouseClicked
        Preferencia preferencia = new Preferencia(index, e);
        preferencia.setVisible(true);
    }//GEN-LAST:event_preferenciasMouseClicked

    private void buscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscaMouseClicked
        Busca busca = new Busca(index, e);
        busca.setVisible(true);
    }//GEN-LAST:event_buscaMouseClicked

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
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton busca;
    private javax.swing.JButton comprarIngresso;
    private javax.swing.JButton fale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelDataLog;
    private javax.swing.JButton preferencias;
    private javax.swing.JButton sair;
    private javax.swing.JButton setPerfil;
    private javax.swing.JButton setSenha;
    private javax.swing.JButton verIngressos;
    // End of variables declaration//GEN-END:variables
}
