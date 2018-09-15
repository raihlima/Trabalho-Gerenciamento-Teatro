package teatroInterfaces;

import javax.swing.JOptionPane;
import teatro.Sala;
import teatroDados.SalaDados;

public class AdicionarSala extends javax.swing.JFrame {

    private boolean nu = false;
    private String nu1 = "Número Inválido.\n";
    private boolean as = false;
    private String as1 = "Número de assentos inválido.\n";
    private boolean de = false;
    private String de1 = "Descrição vazia.\n";
    private boolean nc = false;
    private String nc1 = "Número de colunas inválido.\n";

    public AdicionarSala() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        adicionarSala = new javax.swing.JButton();
        numero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        assentos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numColunas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Sala");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Número da Sala: ");

        adicionarSala.setText("Adicionar Sala");
        adicionarSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarSalaMouseClicked(evt);
            }
        });

        jLabel2.setText("Descrição: ");

        jLabel3.setText("Num Assentos:");

        jLabel4.setText("Num Colunas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adicionarSala, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numColunas)
                            .addComponent(numero)
                            .addComponent(assentos)
                            .addComponent(descricao))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(assentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(numColunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adicionarSala)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarSalaMouseClicked
        if (verificaSala()) {
            Sala s = new Sala();

            s.setDescricao(descricao.getText());
            s.setNumAsentos(Integer.parseInt(assentos.getText()));
            s.setNumero(Integer.parseInt(numero.getText()));
            s.setNumColunas(Integer.parseInt(numColunas.getText()));
            
            teatroDados.SalaDados salaDados = new teatroDados.SalaDados();
            salaDados.adicionaDados(s);
            
            JOptionPane.showMessageDialog(null, "Cadastro de Sala feito com sucesso!", "Sala", 1);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, nu1+de1+as1+nc1, "Erro", 0);
        }
    }//GEN-LAST:event_adicionarSalaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private boolean verificaSala() {
        int aux = 0;
        
        if (numero.getText().length() > 0) {
            nu = true;
            aux++;
            nu1 = "";
            if (verificaNum()==false){
            nu=false;
            nu1="Número já existe.\n";
            }
        } else {
            nu = false;
            nu1 = "Número Inválido.\n";
            aux--;
        }
        if (descricao.getText().length() > 0) {
            de = true;
            aux++;
            de1 = "";
        } else {
            de = false;
            de1 = "Descrição vazia.\n";
            aux--;
        }
                
        if (assentos.getText().length()> 0) {
            int n = Integer.parseInt(assentos.getText());
            if(n>0){
            as = true;
            aux ++;
            as1 = "";
            }
        } else {
            as = false;
            as1 = "Número de assentos inválido.\n";
            aux--;
        }
        if (numColunas.getText().length() > 0) {
            if(Integer.parseInt(numColunas.getText()) > 0){
            nc = true;
            aux++;
            nc1 = "";
        }
        } else {
            nc = false;
            nc1 = "Número de colunas inválido.\n";
            aux--;
        }
        
        if (aux == 4) {
            return true;
        } else {
            return false;
     }
    }

    private boolean verificaNum() {
        int n=Integer.parseInt(numero.getText());
        SalaDados sala = new SalaDados();
        sala.leSala();
        return sala.verificaIgual(n);
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
            java.util.logging.Logger.getLogger(AdicionarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarSala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarSala;
    private javax.swing.JTextField assentos;
    private javax.swing.JTextField descricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField numColunas;
    private javax.swing.JTextField numero;
    // End of variables declaration//GEN-END:variables
}
