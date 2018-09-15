package teatroInterfaces;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import teatro.Apresentacao;
import teatro.Sala;
import teatroDados.EspetaculoDados;
import teatroDados.SalaDados;

public class EditarApresentacao extends javax.swing.JFrame {
    
    SalaDados sD = new SalaDados();
    ArrayList<Sala> salaLista = new ArrayList<Sala>();
    Apresentacao apresentacao = new Apresentacao();
    int indexE;
    int indexA;
    
    boolean di = false;
    String d1 = "Digite o dia.\n";
    boolean me = false;
    String me1 = "Digite o mês.\n";
    boolean an = false;
    String an1 = "Digite o ano.\n";
    boolean ho = false;
    String ho1 = "Digite a hora.\n";
    boolean mi = false;
    String mi1 = "Digite o minuto.\n";
    boolean sa = false;
    String sa1 = "Nenhuma sala selecionada.\n";

    public EditarApresentacao() {
        initComponents();
    }
    
    public EditarApresentacao(int a, int b, Apresentacao ap,String nome){
        initComponents();
        this.indexA=a;
        this.indexE=b;
        this.apresentacao=ap;
        lista();
        preenche();
        nomeEsp.setText("Espetáculo:" +nome);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dia = new javax.swing.JTextField();
        sala = new javax.swing.JComboBox<>();
        Salvar = new javax.swing.JButton();
        mes = new javax.swing.JTextField();
        ano = new javax.swing.JTextField();
        hora = new javax.swing.JTextField();
        minuto = new javax.swing.JTextField();
        excluir = new javax.swing.JButton();
        nomeEsp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Apresentação");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Data:");

        jLabel2.setText("Horário:");

        jLabel3.setText("Sala:");

        dia.setText("11");

        Salvar.setText("Salvar");
        Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalvarMouseClicked(evt);
            }
        });

        mes.setText("11");

        ano.setText("1111");

        hora.setText("11");

        minuto.setText("11");

        excluir.setText("Excluir");
        excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirMouseClicked(evt);
            }
        });

        nomeEsp.setText("Espetáculo AAAAAAAAAAAAAAAAAAAA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sala, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minuto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nomeEsp))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeEsp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar)
                    .addComponent(excluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirMouseClicked
        if(JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a sala?","Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            
            JOptionPane.showMessageDialog(null, "Apresentação excluída com sucesso!","Apresentação",1);
            this.dispose();
       this.dispose();
        }
    }//GEN-LAST:event_excluirMouseClicked

    private void SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalvarMouseClicked
        if(confere()){
             Apresentacao ap = new Apresentacao();
            
            ap.setDia(Integer.parseInt(dia.getText()));
            ap.setMes(Integer.parseInt(mes.getText()));
            ap.setAno(Integer.parseInt(ano.getText()));
            ap.setHora(Integer.parseInt(hora.getText()));
            ap.setMinuto(Integer.parseInt(minuto.getText()));
            ap.setSala(salaLista.get(sala.getSelectedIndex()));
            
            EspetaculoDados eD = new EspetaculoDados();
            eD.leEspetaculo();
            eD.removeApresentacao(indexE, indexA);
            eD.adicionaApresentacao(indexA, ap);
            
            
        JOptionPane.showMessageDialog(null, "Modificações salvas.","Apresentação",1);
       this.dispose();}
        else {
            
        }
    }//GEN-LAST:event_SalvarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void preenche(){
        dia.setText(Integer.toString(apresentacao.getDia()));
        mes.setText(Integer.toString(apresentacao.getMes()));
        ano.setText(Integer.toString(apresentacao.getAno()));
        hora.setText(Integer.toString(apresentacao.getHora()));
        minuto.setText(Integer.toString(apresentacao.getMinuto()));
        
        
    }
    
    public void lista() {
        
        sD.leSala();
        salaLista = sD.retornaDados();

        for (int i = 0; i < salaLista.size(); i++) {
            sala.addItem("Sala " + Integer.toString(salaLista.get(i).getNumero()));
            if(apresentacao.getSala().getNumero()==salaLista.get(i).getNumero()){
                sala.setSelectedIndex(i);
            }
        }
    }
    
    public boolean confere() {
        int aux = 0;
        if (dia.getText().length() > 0) {
            di = true;
            d1 = "";
            aux++;
        } else {
            di = false;
            d1 = "Digite o dia.\n";
            aux--;
        }
        if (mes.getText().length() > 0) {
            me = true;
            me1 = "";
            aux++;
        } else {
            me = false;
            me1 = "Digite o mês.\n";
            aux--;
        }
        if (ano.getText().length() > 0) {
            an = true;
            an1 = "";
            aux++;
        } else {
            an = false;
            an1 = "Digite o ano.\n";
            aux--;
        }
        if (hora.getText().length() > 0) {
            ho = true;
            ho1 = "";
            aux++;
        } else {
            ho = false;
            ho1 = "Digite a hora.\n";
            aux--;
        }
        if (minuto.getText().length() > 0) {
            mi = true;
            mi1 = "";
            aux++;
        } else {
            mi = false;
            mi1 = "Digite o minuto.\n";
        }
        if (sala.getSelectedIndex() > -1) {
            sa = true;
            sa1 = "";
            aux++;
        } else {
            sa = false;
            sa1 = "Nenhuma sala selecionada.\n";
            aux--;
        }
        if (aux == 6) {
            return true;
        } else {
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
            java.util.logging.Logger.getLogger(EditarApresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarApresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarApresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarApresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarApresentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salvar;
    private javax.swing.JTextField ano;
    private javax.swing.JTextField dia;
    private javax.swing.JButton excluir;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField minuto;
    private javax.swing.JLabel nomeEsp;
    private javax.swing.JComboBox<String> sala;
    // End of variables declaration//GEN-END:variables
}
