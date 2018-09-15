package teatroInterfaces;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import teatro.Espectador;
import teatroDados.EspectadorDados;

public class Preferencia extends javax.swing.JFrame {

    Espectador espectador = new Espectador();
    int index;

    public Preferencia() {
        initComponents();
    }

    public Preferencia(int i, Espectador e) {
        initComponents();
        this.index = i;
        this.espectador = e;
        preencheDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        p1 = new javax.swing.JCheckBox();
        p2 = new javax.swing.JCheckBox();
        p3 = new javax.swing.JCheckBox();
        p4 = new javax.swing.JCheckBox();
        p5 = new javax.swing.JCheckBox();
        p6 = new javax.swing.JCheckBox();
        outro = new javax.swing.JTextField();
        news = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Preferências");

        jLabel1.setText("Preferências");

        p1.setText("Peça Teatral");

        p2.setText("Peça Musical");

        p3.setText("Concerto");

        p4.setText("Show");

        p5.setText("Cinema");

        p6.setText("Outro");

        news.setText("Receber novidades por email?");

        jButton1.setText("Salvar Preferências");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(p5)
                            .addComponent(p4)
                            .addComponent(p3)
                            .addComponent(p2)
                            .addComponent(jLabel1)
                            .addComponent(p1))
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(news, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p6)
                    .addComponent(outro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(news)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        altera();
        EspectadorDados eD = new EspectadorDados();
        eD.leEspectador();
        eD.alteraDados(index, espectador);
        JOptionPane.showMessageDialog(null, "Preferencias salvas.", "Info", 1);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    public void preencheDados() {
        if (espectador.isNewsletter()) {
            news.setSelected(true);
        } else {
            news.setSelected(false);
        }
        for (int i = 0; i < espectador.getInteresses().size(); i++) {
            if (p1.getText().equals(espectador.getInteresses().get(i))) {
                p1.setSelected(true);

            }

            if (p2.getText().equals(espectador.getInteresses().get(i))) {
                p2.setSelected(true);
            }
            if (p3.getText().equals(espectador.getInteresses().get(i))) {
                p3.setSelected(true);
            }
            if (p3.getText().equals(espectador.getInteresses().get(i))) {
                p3.setSelected(true);
            }
            if (p4.getText().equals(espectador.getInteresses().get(i))) {
                p4.setSelected(true);
            }
            if (p5.getText().equals(espectador.getInteresses().get(i))) {
                p5.setSelected(true);
            }
            if (p6.getText().equals(espectador.getInteresses().get(i))) {
                p6.setSelected(true);
                outro.setText(espectador.getInteresses().get(i + 1));
            }
        }

    }

    public void altera() {
        ArrayList<String> inter = new ArrayList<String>();
        if (p1.isSelected()) {
            inter.add(p1.getText());
        }
        if (p2.isSelected()) {
            inter.add(p2.getText());
        }
        if (p3.isSelected()) {
            inter.add(p3.getText());
        }
        if (p4.isSelected()) {
            inter.add(p4.getText());
        }
        if (p5.isSelected()) {
            inter.add(p5.getText());
        }
        if (p6.isSelected() && outro.getText().length() > 0) {
            inter.add(p6.getText());
            inter.add(outro.getText());
        }
        if (news.isSelected()) {
            espectador.setNewsletter(true);
        }
        espectador.setInteresses(inter);
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
            java.util.logging.Logger.getLogger(Preferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Preferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Preferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Preferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preferencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox news;
    private javax.swing.JTextField outro;
    private javax.swing.JCheckBox p1;
    private javax.swing.JCheckBox p2;
    private javax.swing.JCheckBox p3;
    private javax.swing.JCheckBox p4;
    private javax.swing.JCheckBox p5;
    private javax.swing.JCheckBox p6;
    // End of variables declaration//GEN-END:variables
}
