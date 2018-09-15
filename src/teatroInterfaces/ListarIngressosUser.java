package teatroInterfaces;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import teatro.Espectador;
import teatro.Ingresso;
import teatroDados.EspectadorDados;
import teatroDados.IngressoDados;

public class ListarIngressosUser extends javax.swing.JFrame {

    Espectador espectador = new Espectador();
    ArrayList<Ingresso> listaIngressos = new ArrayList<>();
    int index;

    public ListarIngressosUser() {
        initComponents();
    }

    public ListarIngressosUser(int i, Espectador e) {
        initComponents();
        this.espectador = e;
        this.listaIngressos = e.getIngressos();
        this.index = i;
        completa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reservarIngresso = new javax.swing.JButton();
        cancelarIngresso = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        verIngresso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingressos");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        reservarIngresso.setText("Reservar Novo Ingresso");
        reservarIngresso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservarIngressoMouseClicked(evt);
            }
        });

        cancelarIngresso.setText("Cancelar Ingresso");
        cancelarIngresso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarIngressoMouseClicked(evt);
            }
        });

        fechar.setText("Fechar");
        fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharMouseClicked(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Espetáculo", "Data", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
        }

        verIngresso.setText("Ver Ingresso");
        verIngresso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verIngressoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reservarIngresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelarIngresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verIngresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reservarIngresso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verIngresso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarIngresso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reservarIngressoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservarIngressoMouseClicked
        ComprarIngresso compraI = new ComprarIngresso(index, espectador);
        compraI.setVisible(true);
    }//GEN-LAST:event_reservarIngressoMouseClicked

    private void fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharMouseClicked
        this.dispose();
    }//GEN-LAST:event_fecharMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void cancelarIngressoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarIngressoMouseClicked
        int aux = tabela.getSelectedRow();

        if (aux > -1) {
            IngressoDados ingressoDados = new IngressoDados();
            ingressoDados.leIngresso();
            ingressoDados.deletaIngresso(listaIngressos.get(aux).getId());
            listaIngressos.remove(aux);
            espectador.setIngressos(listaIngressos);
            EspectadorDados ed = new EspectadorDados();
            ed.leEspectador();
            ed.alteraDados(index, espectador);

            JOptionPane.showMessageDialog(null, "Ingresso cancelado", "Info", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum ingresso selecionado", "Erro", 0);
        }
    }//GEN-LAST:event_cancelarIngressoMouseClicked

    private void verIngressoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verIngressoMouseClicked
        ArrayList<Ingresso> ingr = new ArrayList<>();
        ingr = espectador.getIngressos();
        int aux = tabela.getSelectedRow();

        if (aux > -1) {
            JOptionPane.showMessageDialog(null, "Espetáculo: " + ingr.get(aux).getNomeEspetaculo() + "\n" + "Data: " + ingr.get(aux).getDia() + "/" + ingr.get(aux).getMes() + "/" + ingr.get(aux).getAno() + "\n" + "Hora: " + ingr.get(aux).getHorario() + "\n" + "Assento: " + ingr.get(aux).getAssento(), "Ingresso", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum ingresso selecionado", "Erro", 0);
        }
    }//GEN-LAST:event_verIngressoMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        deleta();
        completa();
    }//GEN-LAST:event_formWindowGainedFocus

    public void completa() {
        EspectadorDados espectadorDados = new EspectadorDados();
        espectadorDados.leEspectador();
        espectador = espectadorDados.retornaEspectador(index);
        listaIngressos = espectador.getIngressos();

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        for (int i = 0; i < listaIngressos.size(); i++) {
            String data = listaIngressos.get(i).getDia() + "/" + listaIngressos.get(i).getMes() + "/" + listaIngressos.get(i).getAno();
            modelo.addRow(new Object[]{listaIngressos.get(i).getNomeEspetaculo(), data, listaIngressos.get(i).getHorario()});
        }
    }

    public void deleta() {
        ((DefaultTableModel) tabela.getModel()).setNumRows(0);
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
            java.util.logging.Logger.getLogger(ListarIngressosUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarIngressosUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarIngressosUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarIngressosUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarIngressosUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarIngresso;
    private javax.swing.JButton fechar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reservarIngresso;
    private javax.swing.JTable tabela;
    private javax.swing.JButton verIngresso;
    // End of variables declaration//GEN-END:variables
}
