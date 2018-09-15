package teatroInterfaces;

import javax.swing.JOptionPane;
import teatro.Espectador;
import teatro.Mantenedor;
import teatroDados.EspectadorDados;
import teatroDados.MantenedorDados;

public class EditarSenha extends javax.swing.JFrame {
    Espectador espectador = new Espectador();
    Mantenedor mantenedor = new Mantenedor();
    int index;
    int i=-1;
    boolean sa=false;
    String sa1="Senha antiga está errada.\n";
    boolean sn=false;
    String sn1="Digite pelo menos 6 caracteres na senha nova.\n";
    boolean sc=false;
    String sc1="Senha nova diferente da confirmação.";

    public EditarSenha() {
        initComponents();
    }
    
     public EditarSenha(int i,Espectador e) {
        initComponents();
        this.espectador=e;
        this.i=1;
        this.index=i;
    }
     
     public EditarSenha (Mantenedor m){
         initComponents();
         this.mantenedor=m;
         this.i=0;
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salvarSenha = new javax.swing.JButton();
        senhaAntiga = new javax.swing.JPasswordField();
        novaSenha = new javax.swing.JPasswordField();
        novaSenha1 = new javax.swing.JPasswordField();
        textoSenhaAntiga = new javax.swing.JLabel();
        textoSenhaNova = new javax.swing.JLabel();
        textoSenhaCOnf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Senha");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Senha Antiga: ");

        jLabel2.setText("Nova Senha:");

        jLabel3.setText("Confirmar Nova Senha:");

        salvarSenha.setText("Salvar Alterações");
        salvarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarSenhaMouseClicked(evt);
            }
        });

        senhaAntiga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                senhaAntigaKeyReleased(evt);
            }
        });

        novaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                novaSenhaKeyReleased(evt);
            }
        });

        novaSenha1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                novaSenha1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salvarSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(novaSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(senhaAntiga, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(novaSenha1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoSenhaAntiga)
                            .addComponent(textoSenhaNova)
                            .addComponent(textoSenhaCOnf))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(senhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoSenhaAntiga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(novaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoSenhaNova))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(novaSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoSenhaCOnf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarSenha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarSenhaMouseClicked
        if(confere()){
            if(i==0){
                MantenedorDados mD = new MantenedorDados();
                mD.leMantenedor();
                mantenedor.setSenha(novaSenha.getText());
                mD.alteraDados(mantenedor);
            JOptionPane.showMessageDialog(null, "Senha alterada.","Senha",1);
            }
            else if(i==1){
                EspectadorDados eD = new EspectadorDados();
                eD.leEspectador();
                espectador.setSenha(novaSenha.getText());
                eD.alteraDados(index,espectador);
            JOptionPane.showMessageDialog(null, "Senha alterada.","Senha",1);    
            }
       this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, sa1+sn1+sc1,"Erro",0);
        }
    }//GEN-LAST:event_salvarSenhaMouseClicked

    private void senhaAntigaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaAntigaKeyReleased
        String aux,auxC;
        aux = senhaAntiga.getText();  
    }//GEN-LAST:event_senhaAntigaKeyReleased

    private void novaSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_novaSenhaKeyReleased
        String aux,auxC;
        aux = novaSenha.getText();
        if(aux.length()<6){
            textoSenhaNova.setText("A senha deve conter no min 6 caracteres");
        }
        else{
            textoSenhaNova.setText("");
        }
        auxC = novaSenha1.getText();
        if(aux.equals(auxC)){
            textoSenhaCOnf.setText("Senhas iguais.");
        }
        else{
            textoSenhaCOnf.setText("Senhas diferentes.");
        }
    }//GEN-LAST:event_novaSenhaKeyReleased

    private void novaSenha1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_novaSenha1KeyReleased
        String aux,auxC;
        aux = novaSenha.getText();
        auxC = novaSenha1.getText();
        if(aux.equals(auxC)){
            textoSenhaCOnf.setText("Senhas iguais.");
        }
        else{
            textoSenhaCOnf.setText("Senhas diferentes.");
        }
        
    }//GEN-LAST:event_novaSenha1KeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private boolean confere(){
        int aux=0;
        if(i ==0){
            if(mantenedor.getSenha().equals(senhaAntiga.getText())){
                sa=true;
                sa1="";
                aux++;
                
        }else{
               sa=false;
               sa1="Senha antiga está errada.\n";
               aux--;
            }
            if(novaSenha.getText().length()>5){
                sn=true;
                sn1="";
                aux++;
                
        } else {
               sn=false;
               sn1="Digite pelo menos 6 caracteres na senha nova.\n";
               aux--;
            }
            if(novaSenha1.getText().equals(novaSenha.getText())){
                sc=true;
                sc1="";
                aux++;
                
        } else {
            sc=false;
            sc1="Senha nova diferente da confirmação.";
            }
        }
        else if(i==1){
            if(espectador.getSenha().equals(senhaAntiga.getText())){
                sa=true;
                sa1="";
                aux++;
                
        }else{
               sa=false;
               sa1="Senha antiga está errada.\n";
               aux--;
            }
            if(novaSenha.getText().length()>5){
                sn=true;
                sn1="";
                aux++;
                
        } else {
               sn=false;
               sn1="Digite pelo menos 6 caracteres na senha nova.\n";
               aux--;
            }
            if(novaSenha1.getText().equals(novaSenha.getText())){
                sc=true;
                sc1="";
                aux++;
                
        } else {
            sc=false;
            sc1="Senha nova diferente da confirmação.";
            }
        }
        if(aux==3){
            return true;
        }       
        else {
            return false;
        }
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
            java.util.logging.Logger.getLogger(EditarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField novaSenha;
    private javax.swing.JPasswordField novaSenha1;
    private javax.swing.JButton salvarSenha;
    private javax.swing.JPasswordField senhaAntiga;
    private javax.swing.JLabel textoSenhaAntiga;
    private javax.swing.JLabel textoSenhaCOnf;
    private javax.swing.JLabel textoSenhaNova;
    // End of variables declaration//GEN-END:variables
}
