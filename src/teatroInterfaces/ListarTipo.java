package teatroInterfaces;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import teatroDados.EspectadorDados;
import teatroDados.EspetaculoDados;

public class ListarTipo extends javax.swing.JFrame {
    
    EspetaculoDados eD = new EspetaculoDados();
    ArrayList <String> tipoLista = new ArrayList<>();

    public ListarTipo() {
        initComponents();
        eD.leTipo();
        tipoLista=eD.retornaTipo();
        completaLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        fechar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        adicionaTipo = new javax.swing.JButton();
        textoAdiciona = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        editarTipo = new javax.swing.JButton();
        textoEditar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        excluir = new javax.swing.JButton();
        textoExcluir = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Tipo de Espetáculos");
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 12, 205, 334));

        fechar.setText("Fechar");
        fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharMouseClicked(evt);
            }
        });
        getContentPane().add(fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 321, 178, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar"));

        adicionaTipo.setText("Adicionar Tipo");
        adicionaTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionaTipoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adicionaTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
            .addComponent(textoAdiciona)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoAdiciona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adicionaTipo))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar"));

        editarTipo.setText("Editar Tipo");
        editarTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarTipoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editarTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textoEditar)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarTipo)
                .addGap(0, 0, 0))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 102, 178, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Excluir"));
        jPanel3.setToolTipText("");

        excluir.setText("Excluir Tipo");
        excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirMouseClicked(evt);
            }
        });

        textoExcluir.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoExcluir)
            .addComponent(excluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(textoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(excluir)
                .addGap(36, 36, 36))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 180, 178, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharMouseClicked
         this.dispose();
    }//GEN-LAST:event_fecharMouseClicked

    private void excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirMouseClicked

        int aux = lista.getSelectedIndex();
        
        if(aux>-1){
            if(JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o tipo de espetáculo?","Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                eD.leTipo();
                eD.deletaTipo(aux);
                 tipoLista=eD.retornaTipo();
                 JOptionPane.showMessageDialog(null, "Tipo de espetáculo excluído","Info",0);
                 textoEditar.setText("");
            textoExcluir.setText("");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum tipo de espetáculo selecionado.","Erro",0);
        }
    }//GEN-LAST:event_excluirMouseClicked

    private void adicionaTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionaTipoMouseClicked
        if(textoAdiciona.getText().length()>0){
            eD.leEspetaculo();
            eD.leTipo();
            tipoLista=eD.retornaTipo();
            eD.adicionaTipo(textoAdiciona.getText());
            eD.leTipo();
            tipoLista=eD.retornaTipo();
            JOptionPane.showMessageDialog(null, "Tipo de espetáculo adicionado.","Info",1);
            textoAdiciona.setText("");
            
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum texto digitado.","Erro",0);
        }
    }//GEN-LAST:event_adicionaTipoMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        completaLista();
    }//GEN-LAST:event_formWindowGainedFocus

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        if(lista.getSelectedIndex()>-1){
            textoEditar.setText(lista.getSelectedValue());
            textoExcluir.setText(lista.getSelectedValue());
        }
    }//GEN-LAST:event_listaValueChanged

    private void editarTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarTipoMouseClicked
        int aux = lista.getSelectedIndex();
        if(aux>-1){
            eD.leTipo();
            eD.alteraTipo(aux, textoEditar.getText());
            JOptionPane.showMessageDialog(null, "Tipo de espetáculo alterado.","Info",1);
            textoEditar.setText("");
            textoExcluir.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum tipo de espetáculo selecionado.","Erro",0);
        }
        
    }//GEN-LAST:event_editarTipoMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    
    public void completaLista(){
        eD.leTipo();
        tipoLista=eD.retornaTipo();
        String[] strings = new String[tipoLista.size()];
        for(int i=0;i<tipoLista.size();i++){
            strings[i]=tipoLista.get(i);
        }
        lista.setListData(strings);
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
            java.util.logging.Logger.getLogger(ListarTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarTipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionaTipo;
    private javax.swing.JButton editarTipo;
    private javax.swing.JButton excluir;
    private javax.swing.JButton fechar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JTextField textoAdiciona;
    private javax.swing.JTextField textoEditar;
    private javax.swing.JTextField textoExcluir;
    // End of variables declaration//GEN-END:variables
}
