package teatroInterfaces;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import teatro.Artista;
import teatro.Espetaculo;
import teatroDados.ArtistaDados;
import teatroDados.EspetaculoDados;

public class EditarEspetaculo extends javax.swing.JFrame {

    private boolean af = false;
    private String af1 = "Preencha o ano final.\n";
    private boolean ai = false;
    private String ai1 = "Preencha o ano de inívio.\n";
    private boolean ar = false;
    private String ar1 = "Digite um artista.\n";
    private boolean de = false;
    private String de1 = "Digite uma descrição.\n";
    private boolean di = false;
    private String di1 = "Digite o dia de início.\n";
    private boolean df = false;
    private String df1 = "Digite o último dia.\n";
    private boolean no = false;
    private String no1 = "Digite um nome para o espetáculo.\n";
    private boolean pr = false;
    private String pr1 = "Digite um preço.\n";
    private boolean mi = false;
    private String mi1 = "Digite o mês de inicio.\n";
    private boolean mf = false;
    private String mf1 = "Digite o mês final.\n";
    private boolean du = false;
    private String du1 = "Digite a duração da apresentação.\n";

    EspetaculoDados eD = new EspetaculoDados();
    ArtistaDados aD = new ArtistaDados();
    ArrayList<Artista> lista = new ArrayList<Artista>();
    ArrayList<String> tipoLista=new ArrayList<>();

    Espetaculo e = new Espetaculo();
    private int index;

    public EditarEspetaculo() {
        initComponents();
        listaVar();
    }

    public EditarEspetaculo(int index, Espetaculo e) {
        initComponents();
        eD.leEspetaculo();
        aD.leArtista();
        this.index = index;
        this.e = e;
        listaVar();
        listaTipo();
        eD.leTipo();
        tipoLista=eD.retornaTipo();
    }

    private void listaTipo(){
        
        eD.leTipo();
        tipoLista= eD.retornaTipo();
        for(int i=0;i<tipoLista.size();i++){
            tipo.addItem(tipoLista.get(i));
            if(tipoLista.get(i).equals(e.getTipo())){
                tipo.setSelectedIndex(i);
            }
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        classificacao = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        salvarEspetaculo = new javax.swing.JButton();
        mesInicio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        anoInicio = new javax.swing.JTextField();
        diaInicio = new javax.swing.JTextField();
        mesFIm = new javax.swing.JTextField();
        anoFIm = new javax.swing.JTextField();
        diaFIm = new javax.swing.JTextField();
        preco = new javax.swing.JTextField();
        artista = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        listaApresentacao = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        duracao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Espetáculo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nome: ");

        jLabel2.setText("Tipo:");

        jLabel3.setText("Classificação:");

        classificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livre", "10", "12", "14", "16", "18" }));

        jLabel4.setText("Descrição:");

        jLabel5.setText("Artista:");

        jLabel6.setText("Data inicio:");

        jLabel7.setText("Data fim:");

        salvarEspetaculo.setText("Salvar Alterações");
        salvarEspetaculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarEspetaculoMouseClicked(evt);
            }
        });

        jLabel8.setText("Preço:");

        jButton1.setText("Excluir Espetáculo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        listaApresentacao.setText("Listar Apresentações");
        listaApresentacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaApresentacaoMouseClicked(evt);
            }
        });

        jLabel9.setText("Duração:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classificacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(descricao))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(diaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(anoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(diaFIm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mesFIm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(anoFIm, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(duracao))))
                            .addComponent(artista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(listaApresentacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salvarEspetaculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(artista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(anoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(anoFIm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesFIm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaFIm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(duracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaApresentacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(salvarEspetaculo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarEspetaculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarEspetaculoMouseClicked
        if (confereCadastro()) {
            criaEspetaculo();
            JOptionPane.showMessageDialog(null, "Cadastro de Espetáculo feito com sucesso!", "Espetáculo", 1);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, no1 + de1 + ar1 + di1 + mi1 + ai1 + df1 + mf1 + af1 + pr1 + du1, "Erro", 0);
        }
    }//GEN-LAST:event_salvarEspetaculoMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o espetáculo?", "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            eD.deletaDados(index);
            JOptionPane.showMessageDialog(null, "Espetáculo excluído com sucesso.", "Espetáculo", 1);

            this.dispose();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void listaApresentacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaApresentacaoMouseClicked
        ListarApresentacoes listarApresentacoes = new ListarApresentacoes (index,e);
        listarApresentacoes.setVisible(true);
    }//GEN-LAST:event_listaApresentacaoMouseClicked

    private void criaEspetaculo() {
       
        e.setNome(nome.getText());
        e.setTipo(tipo.getSelectedItem().toString());
        e.setFaixaEtaria(classificacao.getSelectedItem().toString());
        e.setDescricao(descricao.getText());
        e.addArtista((Artista)artista.getSelectedItem());
        //e.setArtista(artista.getSelectedItem().toString());
        e.setDiaIncio(Integer.parseInt(diaInicio.getText()));
        e.setMesInicio(Integer.parseInt(mesInicio.getText()));
        e.setAnoInicio(Integer.parseInt(anoInicio.getText()));
        e.setDiaFim(Integer.parseInt(diaFIm.getText()));
        e.setMesfim(Integer.parseInt(mesFIm.getText()));
        e.setAnoFim(Integer.parseInt(anoFIm.getText()));
        e.setPreco(Float.parseFloat(preco.getText()));

        EspetaculoDados especD = new EspetaculoDados();
        especD.deletaDados(index);
        especD.adicionaDados(index, e);
    }

    private boolean confereCadastro() {
        int aux = 0;
        if (anoFIm.getText().length() > 0) {
            af = true;
            af1 = "Preencha o ano final.\n";
            aux++;
        } else {
            af = false;
            af1 = "Preencha o ano final.\n";
            aux--;
        }
        if (anoInicio.getText().length() > 0) {
            ai = true;
            ai1 = "";
            aux++;
        } else {
            ai = false;
            ai1 = "Preencha o ano de inívio.\n";
            aux--;
        }

        if (artista.getSelectedIndex() > -1) {
            ar = true;
            ar1 = "";
            aux++;
        } else {
            ar = false;
            ar1 = "Digite um artista.\n";
            aux--;
        }
        if (descricao.getText().length() > 0) {
            ar = true;
            ar1 = "";
            aux++;
        } else {
            de = false;
            de1 = "Digite uma descrição.\n";
            aux--;
        }
        if (diaInicio.getText().length() > 0) {
            di = true;
            di1 = "";
            aux++;
        } else {
            di = false;
            di1 = "Digite o dia de início.\n";
            aux--;
        }
        if (diaFIm.getText().length() > 0) {
            df = true;
            df1 = "";
            aux++;
        } else {
            df = false;
            df1 = "Digite o último dia.\n";
            aux--;
        }
        if (nome.getText().length() > 0) {
            no = true;
            no1 = "";
            aux++;
        } else {
            no = false;
            no1 = "Digite um nome para o espetáculo.\n";
            aux--;
        }
        if (preco.getText().length() > 0) {
            pr = true;
            pr1 = "";
            aux++;
        } else {
            pr = false;
            pr1 = "Digite um preço.\n";
            aux--;
        }
        if (mesInicio.getText().length() > 0) {
            mi = true;
            mi1 = "";
            aux++;
        } else {
            mi = false;
            mi1 = "Digite o mês de inicio.\n";
            aux--;
        }
        if (mesFIm.getText().length() > 0) {
            mf = true;
            mf1 = "";
            aux++;
        } else {
            mf = false;
            mf1 = "Digite o mês final.\n";
            aux--;
        }
        if (duracao.getText().length() > 0) {
            du = true;
            du1 = "";
            aux++;
        } else {
            du = false;
            du1 = "Digite a duração do espetáculo.\n";
            aux--;
        }
        if (aux == 11) {
            return true;
        } else {
            return false;
        }
    }

    private void listaVar() {

        aD.leArtista();
        lista = aD.retornaDados();
        int aux = -1;
        for (int i = 0; i < lista.size(); i++) {
            artista.addItem(lista.get(i).getNome());
            String art = (lista.get(i).getNome());
            //String art1 = e.getArtista();
            String art1 = e.getArtistaNome(i);
            if (art1.equals(artista.getItemAt(i))) {
                aux = i;
                artista.setSelectedItem(art1);
            }
        }

        nome.setText(e.getNome());
        descricao.setText(e.getDescricao());
        diaInicio.setText(Integer.toString(e.getDiaIncio()));
        mesInicio.setText(Integer.toString(e.getMesInicio()));
        anoInicio.setText(Integer.toString(e.getAnoInicio()));
        diaFIm.setText(Integer.toString(e.getDiaFim()));
        mesFIm.setText(Integer.toString(e.getMesfim()));
        anoFIm.setText(Integer.toString(e.getAnoFim()));
        preco.setText(Float.toString(e.getPreco()));
        duracao.setText(Integer.toString(e.getDuracao()));
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
            java.util.logging.Logger.getLogger(EditarEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEspetaculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoFIm;
    private javax.swing.JTextField anoInicio;
    private javax.swing.JComboBox<String> artista;
    private javax.swing.JComboBox<String> classificacao;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField diaFIm;
    private javax.swing.JTextField diaInicio;
    private javax.swing.JTextField duracao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton listaApresentacao;
    private javax.swing.JTextField mesFIm;
    private javax.swing.JTextField mesInicio;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField preco;
    private javax.swing.JButton salvarEspetaculo;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}