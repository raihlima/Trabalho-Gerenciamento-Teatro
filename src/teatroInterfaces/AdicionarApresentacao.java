package teatroInterfaces;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import teatro.Apresentacao;
import teatro.Espetaculo;
import teatro.Sala;
import teatroDados.EspetaculoDados;
import teatroDados.SalaDados;

public class AdicionarApresentacao extends javax.swing.JFrame {
    //Apresentacao apresentacao = new Apresentacao();
    SalaDados sD = new SalaDados();
    ArrayList<Sala> salaLista = new ArrayList<Sala>();
    private int index;
    private Espetaculo espetaculo;
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

    public AdicionarApresentacao() {
        initComponents();
    }

    AdicionarApresentacao(int index, Espetaculo e) {
        initComponents();
        sD.leSala();
        this.index = index;
        this.espetaculo = e;
        lista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dia = new javax.swing.JTextField();
        sala = new javax.swing.JComboBox<>();
        addApresentacao = new javax.swing.JButton();
        mes = new javax.swing.JTextField();
        ano = new javax.swing.JTextField();
        hora = new javax.swing.JTextField();
        minuto = new javax.swing.JTextField();
        espNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Apresentação");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Data:");

        jLabel2.setText("Horário:");

        jLabel3.setText("Sala:");

        addApresentacao.setText("Adicionar Apresentação");
        addApresentacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addApresentacaoMouseClicked(evt);
            }
        });

        espNome.setText("Espetáculo AAAAAAAAAAAAAAAAAAA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minuto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addApresentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sala, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(espNome))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(espNome)
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
                .addComponent(addApresentacao)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addApresentacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addApresentacaoMouseClicked
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
            eD.adicionaApresentacao(index, ap);
            JOptionPane.showMessageDialog(null, "Apresentação adicionada.","Info",1);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, d1+me1+an1+ho1+mi1+sa1,"Erro",0);
        }
    }//GEN-LAST:event_addApresentacaoMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

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

    public void lista() {
        espNome.setText("Espetáculo: " + espetaculo.getNome());
        sD.leSala();
        salaLista = sD.retornaDados();

        for (int i = 0; i < salaLista.size(); i++) {
            sala.addItem("Sala " + Integer.toString(salaLista.get(i).getNumero()));
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
            java.util.logging.Logger.getLogger(AdicionarApresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarApresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarApresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarApresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarApresentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addApresentacao;
    private javax.swing.JTextField ano;
    private javax.swing.JTextField dia;
    private javax.swing.JLabel espNome;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField minuto;
    private javax.swing.JComboBox<String> sala;
    // End of variables declaration//GEN-END:variables
}
