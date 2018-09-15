package teatroInterfaces;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import teatro.Espetaculo;
import teatroDados.EspetaculoDados;

public class ListarEspetaculo extends javax.swing.JFrame {

    EspetaculoDados eD = new EspetaculoDados();
    ArrayList<Espetaculo> e = new ArrayList<Espetaculo>();

    public ListarEspetaculo() {
        initComponents();
        e = eD.retornaDados();
        lista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addEspetaculo = new javax.swing.JButton();
        verEspetaculo = new javax.swing.JButton();
        addApresentacao = new javax.swing.JButton();
        excluirEspetaculo = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        listarApresentacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Espetáculo");
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

        addEspetaculo.setText("Adicionar Espetáculo");
        addEspetaculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEspetaculoMouseClicked(evt);
            }
        });

        verEspetaculo.setText("Ver Espetáculo");
        verEspetaculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verEspetaculoMouseClicked(evt);
            }
        });

        addApresentacao.setText("Adicionar Apresentação");
        addApresentacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addApresentacaoMouseClicked(evt);
            }
        });

        excluirEspetaculo.setText("Excluir Espetáculo");
        excluirEspetaculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirEspetaculoMouseClicked(evt);
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
                "Nome", "Artista", "Data Início", "Data Fim", "Num Aprest"
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
            tabela.getColumnModel().getColumn(4).setPreferredWidth(3);
        }

        listarApresentacao.setText("Listar Apresentação");
        listarApresentacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarApresentacaoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addEspetaculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verEspetaculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(excluirEspetaculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listarApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addEspetaculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verEspetaculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addApresentacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listarApresentacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirEspetaculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(fechar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addEspetaculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEspetaculoMouseClicked
        AdicionarEspetaculo addE = new AdicionarEspetaculo();
        addE.setVisible(true);
    }//GEN-LAST:event_addEspetaculoMouseClicked

    private void verEspetaculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verEspetaculoMouseClicked
        int aux = tabela.getSelectedRow();
        if (aux > -1) {
            Espetaculo esp = new Espetaculo();
            esp = e.get(aux);
            EditarEspetaculo editE = new EditarEspetaculo(aux, esp);
            editE.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum espetáculo selecionado.", "Info", 1);
        }
    }//GEN-LAST:event_verEspetaculoMouseClicked

    private void addApresentacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addApresentacaoMouseClicked
        AdicionarApresentacao addA = new AdicionarApresentacao(tabela.getSelectedRow(), e.get(tabela.getSelectedRow()));
        addA.setVisible(true);
    }//GEN-LAST:event_addApresentacaoMouseClicked

    private void excluirEspetaculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirEspetaculoMouseClicked
        if (tabela.getSelectedRow() > -1) {
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o espetáculo?", "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                eD.deletaDados(tabela.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Espetáculo excluído com sucesso.", "Espetáculo", 1);
                removeLista();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum espetáculo selecionado.", "Info", 1);
        }
    }//GEN-LAST:event_excluirEspetaculoMouseClicked

    private void fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharMouseClicked
        this.dispose();
    }//GEN-LAST:event_fecharMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        removeLista();
    }//GEN-LAST:event_formWindowGainedFocus

    private void listarApresentacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarApresentacaoMouseClicked
        int aux = tabela.getSelectedRow();
        if (aux > -1) {
            ListarApresentacoes listarApresentacoes = new ListarApresentacoes(aux, e.get(aux));
            listarApresentacoes.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum espetáculo selecionado.", "Info", 1);
        }
    }//GEN-LAST:event_listarApresentacaoMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    public void lista() {
        eD.leEspetaculo();
        e = eD.retornaDados();

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        for (int i = 0; i < e.size(); i++) {
            String a = e.get(i).getDiaIncio() + "/" + e.get(i).getMesInicio() + "/" + e.get(i).getAnoInicio();
            String b = e.get(i).getDiaFim() + "/" + e.get(i).getMesfim() + "/" + e.get(i).getAnoFim();
            int c = e.get(i).retornaTamanho();

            modelo.addRow(new Object[]{e.get(i).getNome(), e.get(i).getArtista(i), a, b, c});
        }
    }

    public void removeLista() {
        eD.leEspetaculo();
        e = eD.retornaDados();

        ((DefaultTableModel) tabela.getModel()).setNumRows(0);

        lista();
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
            java.util.logging.Logger.getLogger(ListarEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarEspetaculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addApresentacao;
    private javax.swing.JButton addEspetaculo;
    private javax.swing.JButton excluirEspetaculo;
    private javax.swing.JButton fechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listarApresentacao;
    private javax.swing.JTable tabela;
    private javax.swing.JButton verEspetaculo;
    // End of variables declaration//GEN-END:variables
}
