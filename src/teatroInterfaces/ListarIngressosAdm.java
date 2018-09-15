package teatroInterfaces;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import teatro.Ingresso;
import teatroDados.EspectadorDados;
import teatroDados.IngressoDados;

public class ListarIngressosAdm extends javax.swing.JFrame {

    IngressoDados ingressoDados = new IngressoDados();
    ArrayList<Ingresso> ingressos = new ArrayList<>();

    public ListarIngressosAdm() {
        initComponents();
        ingressoDados.leIngresso();
        ingressos = ingressoDados.retornaDados();
        completa();
        excluirIngresso.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmarPagamento = new javax.swing.JButton();
        excluirIngresso = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

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

        confirmarPagamento.setText("Confirmar Pagamento");
        confirmarPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmarPagamentoMouseClicked(evt);
            }
        });

        excluirIngresso.setText("Excluir Ingresso");
        excluirIngresso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirIngressoMouseClicked(evt);
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
                "ID", "Espetáculo", "Data", "Hora", "Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(1).setMinWidth(250);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabela.getColumnModel().getColumn(1).setMaxWidth(250);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(5);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(5);
            tabela.getColumnModel().getColumn(4).setResizable(false);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(1);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmarPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(excluirIngresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmarPagamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirIngresso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                        .addComponent(fechar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharMouseClicked
        this.dispose();
    }//GEN-LAST:event_fecharMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        deleta();
        completa();
    }//GEN-LAST:event_formWindowGainedFocus

    private void excluirIngressoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirIngressoMouseClicked
        int aux = tabela.getSelectedRow();
        ingressoDados.leIngresso();
        ingressos = ingressoDados.retornaDados();

        if (aux > -1) {
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o ingresso?", "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                ingressoDados.leIngresso();
                ingressoDados.deletaIngresso(ingressos.get(aux).getId());
                JOptionPane.showMessageDialog(null, "Ingresso excluído", "Info", 1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum ingresso selecionado", "Erro", 0);
        }
    }//GEN-LAST:event_excluirIngressoMouseClicked

    private void confirmarPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarPagamentoMouseClicked
        int aux = tabela.getSelectedRow();

        if (aux > -1) {
            ingressoDados.leIngresso();
            ingressos = ingressoDados.retornaDados();
            ingressos.get(aux).setPagamento(true);
            ingressoDados.alteraDados(aux, ingressos.get(aux));
            JOptionPane.showMessageDialog(null, "Pagamento confirmado.", "info", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum ingresso selecionado", "Erro", 0);
        }
    }//GEN-LAST:event_confirmarPagamentoMouseClicked

    public void completa() {
        ingressoDados.leIngresso();
        ingressos = ingressoDados.retornaDados();

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        for (int i = 0; i < ingressos.size(); i++) {
            String pago;
            if (ingressos.get(i).isPagamento()) {
                pago = "Sim";
            } else {
                pago = "Não";
            }
            String data = ingressos.get(i).getDia() + "/" + ingressos.get(i).getMes() + "/" + ingressos.get(i).getAno();
            modelo.addRow(new Object[]{ingressos.get(i).getId(), ingressos.get(i).getNomeEspetaculo(), data, ingressos.get(i).getHorario(), pago});
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
            java.util.logging.Logger.getLogger(ListarIngressosAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarIngressosAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarIngressosAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarIngressosAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarIngressosAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarPagamento;
    private javax.swing.JButton excluirIngresso;
    private javax.swing.JButton fechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
