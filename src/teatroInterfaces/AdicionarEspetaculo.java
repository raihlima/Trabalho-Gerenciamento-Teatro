package teatroInterfaces;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import teatro.Artista;
import teatro.Espetaculo;
import teatroDados.ArtistaDados;
import teatroDados.EspetaculoDados;

public class AdicionarEspetaculo extends javax.swing.JFrame {

    private boolean af=false;
    private String af1="Preencha o ano final.\n";
    private boolean ai=false;
    private String ai1 = "Preencha o ano de inívio.\n";
    private boolean ar = false;
    private String ar1 = "Digite um artista.\n";
    private boolean de=false;
    private String de1="Digite uma descrição.\n";
    private boolean di=false;
    private String di1="Digite o dia de início.\n";
    private boolean df = false;
    private String df1="Digite o último dia.\n";
    private boolean no=false;
    private String no1="Digite um nome para o espetáculo.\n";
    private boolean pr=false;
    private String pr1="Digite um preço.\n";
    private boolean mi=false;
    private String mi1="Digite o mês de inicio.\n";
    private boolean mf=false;
    private String mf1="Digite o mês final.\n";
    private boolean du=false;
    private String du1="Digite a duração da apresentação.\n";
    
    ArtistaDados aD = new ArtistaDados();
    ArrayList<Artista>lista=new ArrayList<>();
    ArrayList<String> tipoLista = new ArrayList<>();

    public AdicionarEspetaculo() {
        initComponents();
        listaArtistas();
        listaTipo();
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
        criarEspetaculo = new javax.swing.JButton();
        mesInicio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        anoInicio = new javax.swing.JTextField();
        diaInicio = new javax.swing.JTextField();
        mesFIm = new javax.swing.JTextField();
        anoFIm = new javax.swing.JTextField();
        diaFIm = new javax.swing.JTextField();
        preco = new javax.swing.JTextField();
        artista = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        duracao = new javax.swing.JTextField();
        artista1 = new javax.swing.JComboBox<>();
        artista2 = new javax.swing.JComboBox<>();

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

        jLabel5.setText("Artistas:");

        jLabel6.setText("Data inicio:");

        jLabel7.setText("Data fim:");

        criarEspetaculo.setText("Criar Espetáculo");
        criarEspetaculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                criarEspetaculoMouseClicked(evt);
            }
        });

        jLabel8.setText("Preço:");

        artista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                artistaItemStateChanged(evt);
            }
        });
        artista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                artistaMousePressed(evt);
            }
        });

        jLabel9.setText("Duração:");

        artista1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                artista1ItemStateChanged(evt);
            }
        });
        artista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                artista1MousePressed(evt);
            }
        });

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
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(classificacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(descricao)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(criarEspetaculo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(15, 15, 15)
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
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(duracao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(diaFIm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mesFIm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anoFIm, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(artista, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(artista1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(artista2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(artista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artista1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artista2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(criarEspetaculo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criarEspetaculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarEspetaculoMouseClicked
        if(confereCadastro()){
            criaEspetaculo();
       JOptionPane.showMessageDialog(null, "Cadastro de Espetáculo feito com sucesso!","Espetáculo",1);
       this.dispose();   }
        else{
            JOptionPane.showMessageDialog(null, no1+de1+ar1+di1+mi1+ai1+df1+mf1+af1+pr1+du1,"Erro",0);
        }
    }//GEN-LAST:event_criarEspetaculoMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        artista1.setVisible(false);
        artista2.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void artistaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_artistaItemStateChanged
        artista1.setVisible(true);
    }//GEN-LAST:event_artistaItemStateChanged

    private void artista1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_artista1ItemStateChanged
        artista2.setVisible(true);
    }//GEN-LAST:event_artista1ItemStateChanged

    private void artistaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artistaMousePressed
        artista1.setVisible(true);
    }//GEN-LAST:event_artistaMousePressed

    private void artista1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artista1MousePressed
        artista2.setVisible(true);
    }//GEN-LAST:event_artista1MousePressed
    
    private void criaEspetaculo(){
        Espetaculo e = new Espetaculo();
        //Artista a1 = new Artista();
        e.setNome(nome.getText());
        e.setTipo(tipo.getSelectedItem().toString());
        e.setFaixaEtaria(classificacao.getSelectedItem().toString());
        e.setDescricao(descricao.getText());
        for(int i = 0; i < lista.size(); i++)
        {
            e.addArtista(lista.get(i));
        }
        //e.setArtista(artista.getSelectedItem().toString());
        e.setDiaIncio(Integer.parseInt(diaInicio.getText()));
        e.setMesInicio(Integer.parseInt(mesInicio.getText()));
        e.setAnoInicio(Integer.parseInt(anoInicio.getText()));
        e.setDiaFim(Integer.parseInt(diaFIm.getText()));
        e.setMesfim(Integer.parseInt(mesFIm.getText()));
        e.setAnoFim(Integer.parseInt(anoFIm.getText()));
        e.setPreco(Float.parseFloat(preco.getText()));
        e.setDuracao(Integer.parseInt(duracao.getText()));
        
        EspetaculoDados especD= new EspetaculoDados();
        especD.adicionaDados(e);
    }
    private boolean confereCadastro(){
      int aux = 0;
      if(anoFIm.getText().length()>0){
      af=true;    
      af1="Preencha o ano final.\n";
      aux++;
      } else {
          af=false;
          af1="Prrencha o ano final.\n";
          aux--;
      } 
      if(anoInicio.getText().length()>0){
          ai=true;
          ai1="";
          aux++;
      }   else {
      ai=false;
      ai1 = "Preencha o ano de inívio.\n";
      aux--;
              }
      
      if(artista.getSelectedIndex()>-1){
          ar=true;
          ar1="";
          aux++;
      }
      else {
              ar = false;
      ar1 = "Digite um artista.\n";
      aux--;
              }
      if(descricao.getText().length()>0){
          ar=true;
          ar1="";
          aux++;
      }
      else {        
          de=false;
            de1="Digite uma descrição.\n";
              aux--;
              }
      if(diaInicio.getText().length()>0){
          di=true;
          di1="";
          aux++;
      }
      else {
      di=false;
      di1="Digite o dia de início.\n";
      aux--;
              }
      if(diaFIm.getText().length()>0){
          df=true;
          df1="";
          aux++;
      }
      else {        
      df = false;
      df1="Digite o último dia.\n";
      aux--;
              }
      if(nome.getText().length()>0){
          no=true;
          no1="";
          aux++;
      }
      else {        
      no=false;
      no1="Digite um nome para o espetáculo.\n";
      aux--;
              }
      if(preco.getText().length()>0){
          pr=true;
          pr1="";
          aux++;
      }
      else {        
      pr=false;
      pr1="Digite um preço.\n";
      aux--;
              }
      if(mesInicio.getText().length()>0){
          mi=true;
          mi1="";
          aux++;
      }
      else {
              mi=false;
              mi1="Digite o mês de inicio.\n";
              aux--;
              }
      if(mesFIm.getText().length()>0){
          mf=true;
          mf1="";
          aux++;
      }
      else {
              mf=false;
              mf1="Digite o mês final.\n";
              aux--;
              }
      if(duracao.getText().length()>0){
          du=true;
          du1="";
          aux++;
      }
      else{
          du=false;
          du1="Digite a duração do espetáculo.\n";
          aux--;
      }
      if(aux==11){
          return true;
      }
      else {
        return false;
    }}
   
    private void listaArtistas(){
        aD.leArtista();
        lista=aD.retornaDados();
        for (int i = 0;i<lista.size();i++){
            // Completa as listas de artistas
            artista.addItem(lista.get(i).getNome());
            artista1.addItem(lista.get(i).getNome());
            artista2.addItem(lista.get(i).getNome());
    }   
    }
    
    private void listaTipo(){
        EspetaculoDados eD = new EspetaculoDados();
        eD.leTipo();
        tipoLista= eD.retornaTipo();
        for(int i=0;i<tipoLista.size();i++){
            tipo.addItem(tipoLista.get(i));
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
            java.util.logging.Logger.getLogger(AdicionarEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarEspetaculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoFIm;
    private javax.swing.JTextField anoInicio;
    private javax.swing.JComboBox<String> artista;
    private javax.swing.JComboBox<String> artista1;
    private javax.swing.JComboBox<String> artista2;
    private javax.swing.JComboBox<String> classificacao;
    private javax.swing.JButton criarEspetaculo;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField diaFIm;
    private javax.swing.JTextField diaInicio;
    private javax.swing.JTextField duracao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mesFIm;
    private javax.swing.JTextField mesInicio;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField preco;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
