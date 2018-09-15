package teatroInterfaces;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import teatro.Mantenedor;
import teatro.Teatro;
import teatroDados.EspectadorDados;
import teatroDados.IngressoDados;
import teatroInterfaces.*;

public class MenuAdm extends javax.swing.JFrame {

    Mantenedor m=new Mantenedor();
    
    public MenuAdm() {
        initComponents();
    }
    public MenuAdm(Mantenedor m) {
        initComponents();
        this.m=m;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addArtista = new javax.swing.JButton();
        visualizarArtista = new javax.swing.JButton();
        addEspetaculo = new javax.swing.JButton();
        addSala = new javax.swing.JButton();
        visualizarEspetaculo = new javax.swing.JButton();
        visualizarSala = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        confirmarPag = new javax.swing.JButton();
        editSenha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelDataLog = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        relatorioIngresso = new javax.swing.JButton();
        relatorioUsuario = new javax.swing.JButton();
        listarTipos = new javax.swing.JButton();
        RelatorioSalas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contectado como Gerente");
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

        addArtista.setText("Adicionar Artista");
        addArtista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddArtistaMouseClicked(evt);
            }
        });

        visualizarArtista.setText("Visualizar Artistas");
        visualizarArtista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVisualizarArtistaMouseClicked(evt);
            }
        });

        addEspetaculo.setText("Adicionar Espetáculo");
        addEspetaculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEspetaculoMouseClicked(evt);
            }
        });

        addSala.setText("Adicionar Sala");
        addSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSalaMouseClicked(evt);
            }
        });

        visualizarEspetaculo.setText("Visualizar Espetáculo");
        visualizarEspetaculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizarEspetaculoMouseClicked(evt);
            }
        });

        visualizarSala.setText("Visualizar Salas");
        visualizarSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizarSalaMouseClicked(evt);
            }
        });

        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });

        confirmarPag.setText("Listar Ingressos");
        confirmarPag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmarPagMouseClicked(evt);
            }
        });

        editSenha.setText("Editar Senha");
        editSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editSenhaMouseClicked(evt);
            }
        });

        jLabel1.setText("Logado em:");

        jLabelDataLog.setText("jLabel2");

        jLabel2.setText("Servidor:");

        jLabelData.setText("jLabel3");

        relatorioIngresso.setText("Gerar Relatório de Ingressos Vendidos");
        relatorioIngresso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relatorioIngressoMouseClicked(evt);
            }
        });

        relatorioUsuario.setText("Gerar Relatório de Usuários Cadastrados");
        relatorioUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relatorioUsuarioMouseClicked(evt);
            }
        });

        listarTipos.setText("Lista Tipos");
        listarTipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarTiposMouseClicked(evt);
            }
        });

        RelatorioSalas.setText("Gerar Relatório de Salas");
        RelatorioSalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RelatorioSalasMouseClicked(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(relatorioIngresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addSala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addArtista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addEspetaculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listarTipos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDataLog)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelData))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(visualizarEspetaculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(visualizarArtista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(visualizarSala, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(confirmarPag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(relatorioUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RelatorioSalas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addArtista)
                    .addComponent(visualizarArtista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEspetaculo)
                    .addComponent(visualizarEspetaculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(visualizarSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editSenha)
                    .addComponent(confirmarPag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relatorioIngresso)
                    .addComponent(relatorioUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listarTipos)
                    .addComponent(RelatorioSalas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelData)
                    .addComponent(jLabel1)
                    .addComponent(jLabelDataLog)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddArtistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddArtistaMouseClicked
        teatroInterfaces.AdicionarArtista addArtista = new teatroInterfaces.AdicionarArtista();
        addArtista.setVisible(true);
    }//GEN-LAST:event_jButtonAddArtistaMouseClicked

    private void jButtonVisualizarArtistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVisualizarArtistaMouseClicked
        teatroInterfaces.ListarArtistas listaArtista = new teatroInterfaces.ListarArtistas();
        listaArtista.setVisible(true);
    }//GEN-LAST:event_jButtonVisualizarArtistaMouseClicked

    private void addEspetaculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEspetaculoMouseClicked
        teatroInterfaces.AdicionarEspetaculo adicionarEspetaculo = new teatroInterfaces.AdicionarEspetaculo();
        adicionarEspetaculo.setVisible(true);
    }//GEN-LAST:event_addEspetaculoMouseClicked

    private void visualizarEspetaculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizarEspetaculoMouseClicked
        teatroInterfaces.ListarEspetaculo listaEspetaculo = new teatroInterfaces.ListarEspetaculo();
        listaEspetaculo.setVisible(true);
    }//GEN-LAST:event_visualizarEspetaculoMouseClicked

    private void addSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSalaMouseClicked
        teatroInterfaces.AdicionarSala addSala = new teatroInterfaces.AdicionarSala();
        addSala.setVisible(true);
    }//GEN-LAST:event_addSalaMouseClicked

    private void visualizarSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizarSalaMouseClicked
        teatroInterfaces.ListarSalas listaSala = new teatroInterfaces.ListarSalas();
        listaSala.setVisible(true);
    }//GEN-LAST:event_visualizarSalaMouseClicked

    private void editSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSenhaMouseClicked
        teatroInterfaces.EditarSenha editSenha = new teatroInterfaces.EditarSenha(m);
        editSenha.setVisible(true);
    }//GEN-LAST:event_editSenhaMouseClicked

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        teatroInterfaces.Login login = new teatroInterfaces.Login();
        JOptionPane.showMessageDialog(null, "Desconectado com sucesso!","Logout",1);
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_sairMouseClicked

    private void confirmarPagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarPagMouseClicked
        ListarIngressosAdm listaAdm = new ListarIngressosAdm();
        listaAdm.setVisible(true);
    }//GEN-LAST:event_confirmarPagMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        //Exibe data do login
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        jLabelDataLog.setText(formato.format(dataSistema));
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        //Exibe data do servidor
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

    private void relatorioIngressoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorioIngressoMouseClicked
        IngressoDados ingressoDados=new IngressoDados();
        ingressoDados.leIngresso();
        String ingressoTotal = "R$ "+ Float.toString(ingressoDados.relatorioPrecoVendas())+"0"+"\n";
        String ingressoVendido =Integer.toString(ingressoDados.relatorioIngressosVendidos())+"\n";
        JOptionPane.showMessageDialog(null,"Ingressos comprados: "+ingressoVendido + "Valor das vendas:"+ingressoTotal,"Relatório",1 );
    }//GEN-LAST:event_relatorioIngressoMouseClicked

    private void relatorioUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorioUsuarioMouseClicked
        EspectadorDados eD = new EspectadorDados();
        eD.geraRelatorio();
    }//GEN-LAST:event_relatorioUsuarioMouseClicked

    private void listarTiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarTiposMouseClicked
        ListarTipo l1 = new ListarTipo();
        l1.setVisible(true);
    }//GEN-LAST:event_listarTiposMouseClicked

    private void RelatorioSalasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RelatorioSalasMouseClicked
        RelatorioSala rSala = new RelatorioSala();
        rSala.setVisible(true);
    }//GEN-LAST:event_RelatorioSalasMouseClicked

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
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RelatorioSalas;
    private javax.swing.JButton addArtista;
    private javax.swing.JButton addEspetaculo;
    private javax.swing.JButton addSala;
    private javax.swing.JButton confirmarPag;
    private javax.swing.JButton editSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelDataLog;
    private javax.swing.JButton listarTipos;
    private javax.swing.JButton relatorioIngresso;
    private javax.swing.JButton relatorioUsuario;
    private javax.swing.JButton sair;
    private javax.swing.JButton visualizarArtista;
    private javax.swing.JButton visualizarEspetaculo;
    private javax.swing.JButton visualizarSala;
    // End of variables declaration//GEN-END:variables
}
