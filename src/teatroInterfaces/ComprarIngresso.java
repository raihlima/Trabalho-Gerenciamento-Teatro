package teatroInterfaces;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import teatro.Apresentacao;
import teatro.Espectador;
import teatro.Espetaculo;
import teatro.Ingresso;
import teatro.Sala;
import teatroDados.EspectadorDados;
import teatroDados.EspetaculoDados;
import teatroDados.IngressoDados;

public class ComprarIngresso extends javax.swing.JFrame {

    Espectador espectador;
    int index;
    EspetaculoDados espetaculoDados = new EspetaculoDados();
    IngressoDados ingressoDados = new IngressoDados();
    ArrayList<Espetaculo> listaEspetaculo = new ArrayList<>();
    ArrayList<Apresentacao> listaApresentacao = new ArrayList<>();
    ArrayList<Ingresso> listaIngressos = new ArrayList<>();
    int totalAssentos;
    int coluna;
    String horaString;
    String especNome;

    // Variaveis globais
    protected ArrayList<Integer> lugaresOcupados = new ArrayList<>();

    public ComprarIngresso() {
        initComponents();
        jPcartao.setVisible(false);
        espetaculoDados.leEspetaculo();
        this.listaEspetaculo = espetaculoDados.retornaDados();
        completaEspetaculo();
    }

    public ComprarIngresso(int index, Espectador espectador) {
        initComponents();
        jPcartao.setVisible(false);
        this.espectador = espectador;
        this.index = index;
        espetaculoDados.leEspetaculo();
        ingressoDados.leIngresso();
        this.listaIngressos = ingressoDados.retornaDados();
        this.listaEspetaculo = espetaculoDados.retornaDados();
        completaEspetaculo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        compra = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        precoTotal = new javax.swing.JTextField();
        formaPagamento = new javax.swing.JComboBox<>();
        jPcartao = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        espetaculo = new javax.swing.JComboBox<>();
        apresentacao = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        assento = new javax.swing.JTextField();
        preco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        data = new javax.swing.JTextField();
        hora = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sala = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comprar ingresso");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        compra.setText("Comprar Ingresso");
        compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Forma de Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        jLabel1.setText("Preço Total:");

        jLabel2.setText("Forma:");

        precoTotal.setEditable(false);

        formaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleto", "Cartão de Crédito", "Dinheiro" }));
        formaPagamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                formaPagamentoItemStateChanged(evt);
            }
        });

        jPcartao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Num Cartão:");

        jLabel10.setText("Vencimento:");

        jLabel11.setText("Operadora:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa", "MasterCard", "Elo" }));

        javax.swing.GroupLayout jPcartaoLayout = new javax.swing.GroupLayout(jPcartao);
        jPcartao.setLayout(jPcartaoLayout);
        jPcartaoLayout.setHorizontalGroup(
            jPcartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcartaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPcartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcartaoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4))
                    .addGroup(jPcartaoLayout.createSequentialGroup()
                        .addGroup(jPcartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(6, 6, 6)
                        .addGroup(jPcartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPcartaoLayout.setVerticalGroup(
            jPcartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcartaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPcartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPcartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPcartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precoTotal)
                    .addComponent(formaPagamento, 0, 138, Short.MAX_VALUE))
                .addGap(68, 68, 68))
            .addComponent(jPcartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(precoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(formaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPcartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escolher Espetáculo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        jLabel4.setText("Espetáculo:");

        jLabel5.setText("Apresentação:");

        jLabel6.setText("Hora:");

        jLabel7.setText("Sala");

        jLabel8.setText("Preço:");

        espetaculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                espetaculoItemStateChanged(evt);
            }
        });

        apresentacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                apresentacaoItemStateChanged(evt);
            }
        });

        jLabel9.setText("Assentos:");

        assento.setEditable(false);

        preco.setEditable(false);

        jLabel12.setText("R$:");

        data.setEditable(false);

        hora.setEditable(false);

        jLabel13.setText("Data:");

        sala.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hora)
                            .addComponent(data)
                            .addComponent(sala)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5))
                                .addGap(20, 20, 20))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assento)
                            .addComponent(preco)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(espetaculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apresentacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(espetaculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(apresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel8))
                .addGap(95, 95, 95))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Mapa Assentos"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(compra)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formaPagamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_formaPagamentoItemStateChanged
        if (formaPagamento.getSelectedIndex() != 1) {
            jPcartao.setVisible(false);
        } else {
            jPcartao.setVisible(true);
        }
    }//GEN-LAST:event_formaPagamentoItemStateChanged

    private void compraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraMouseClicked
        // Enviar esses dados para o ingresso
        compraIngresso();
        LocalDateTime data = LocalDateTime.now();
        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();
        int ano = data.getYear();
        int hora = data.getHour();
        int minuto = data.getMinute();
        int segundo = data.getSecond();

        // Codigo antigo
        JOptionPane.showMessageDialog(null, "Reserva efetuada." + "\nAguardando Pagamento.", "Ingresso", 1);
        this.dispose();
    }//GEN-LAST:event_compraMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
        // Ajustar para o item que retorna!!!!!
    }//GEN-LAST:event_jComboBox4ItemStateChanged

    private void apresentacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_apresentacaoItemStateChanged
        assento.setText("0");
        precoTotal.setText("0.00");

        ingressoDados.leIngresso();
        listaIngressos = ingressoDados.retornaDados();

        lugaresOcupados.clear();
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            completaResto();

            jPanel3.removeAll();

            jPanel3.setVisible(false);
            GridBagLayout gb = new GridBagLayout();
            GridBagConstraints gc = new GridBagConstraints();
            gb.setConstraints(this, gc);
            jPanel3.setLayout(gb);
            int i;
            int j;
            int k = 1;
            int numColuna = coluna;
            int linha = totalAssentos / numColuna;
            int assentosUltimaColuna = (linha % 10);

            if (assentosUltimaColuna != 0) {
                linha += 1;
            }

            for (i = 0; i < linha; i++) {
                for (j = 0; j < numColuna && k <= totalAssentos; j++) {
                    if (buscaAssentoOcupado(i + j)) {

                        JCheckBox box1 = new JCheckBox(new Integer(k).toString());
                        box1.setVisible(true);

                        gc.gridx = j;
                        if (numColuna == j) {
                            gc.gridy = i + 1 + j;
                        } else {
                            gc.gridy = i + 1;
                        }

                        gc.ipadx = 2;
                        gc.ipady = 2;

                        box1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (box1.isSelected()) {
                                    int bandeira = 0;
                                    lugaresOcupados.add(Integer.parseInt(box1.getText()));
                                    alteraPreco();
                                }

                                if (!(box1.isSelected())) {
                                    for (int l = 0; l < lugaresOcupados.size(); l++) {
                                        if (lugaresOcupados.get(l) == (Integer.parseInt(box1.getText()))) {
                                            lugaresOcupados.remove(l);
                                        }
                                    }
                                    alteraPreco();
                                }
                            }
                        });
                        jPanel3.add(box1, gc);
                        k++;
                    }
                }
                jPanel3.setVisible(true);
                jPanel3.revalidate();
                jPanel3.repaint();
            }
        }

    }//GEN-LAST:event_apresentacaoItemStateChanged

    public boolean buscaAssentoOcupado(int numero) {
        for (int i = 0; i < totalAssentos; i++) {
            if (lugaresOcupados.contains(i));
            {
                return true;
            }
        }
        return false;
    }

    private void espetaculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_espetaculoItemStateChanged
        completaApresentacao();
        assento.setText("0");
        precoTotal.setText("0.00");
        lugaresOcupados.clear();
        especNome = listaEspetaculo.get(espetaculo.getSelectedIndex()).getNome();
    }//GEN-LAST:event_espetaculoItemStateChanged

    public void completaEspetaculo() {
        assento.setText("0");
        precoTotal.setText("0.00");
        espetaculoDados.leEspetaculo();
        listaEspetaculo = espetaculoDados.retornaDados();
        for (int i = 0; i < listaEspetaculo.size(); i++) {
            espetaculo.addItem(listaEspetaculo.get(i).getNome());
        }
    }

    public void completaApresentacao() {
        if (espetaculo.getSelectedIndex() > -1) {
            apresentacao.removeAllItems();
            espetaculoDados.leEspetaculo();
            listaEspetaculo = espetaculoDados.retornaDados();
            for (int i = 0; i < listaEspetaculo.get(espetaculo.getSelectedIndex()).retornaTamanho(); i++) {
                apresentacao.addItem("Apresentação " + (i + 1));
            }
            completaResto();
        }
    }

    public void completaResto() {
        ArrayList<Apresentacao> apres = new ArrayList<>();
        Sala sal = new Sala();
        if (espetaculo.getSelectedIndex() > -1) {
            if (apresentacao.getSelectedIndex() > -1) {
                apres = listaEspetaculo.get(espetaculo.getSelectedIndex()).getApresentacao();
                sal = apres.get(apresentacao.getSelectedIndex()).getSala();
                data.setText(Integer.toString(apres.get(apresentacao.getSelectedIndex()).getDia()) + "/" + Integer.toString(apres.get(apresentacao.getSelectedIndex()).getMes()) + "/" + Integer.toString(apres.get(apresentacao.getSelectedIndex()).getAno()));
                hora.setText(Integer.toString(apres.get(apresentacao.getSelectedIndex()).getHora()) + ":" + Integer.toString(apres.get(apresentacao.getSelectedIndex()).getMinuto()));
                preco.setText(Float.toString(listaEspetaculo.get(espetaculo.getSelectedIndex()).getPreco()) + "0");
                sala.setText(Integer.toString(sal.getNumero()));
                this.totalAssentos = sal.getNumAsentos();
                this.coluna = sal.getNumColunas();
            }
        }
    }

    public void alteraPreco() {
        assento.setText(Integer.toString(lugaresOcupados.size()));
        precoTotal.setText(Float.toString(listaEspetaculo.get(espetaculo.getSelectedIndex()).getPreco() * lugaresOcupados.size()) + "0");

    }

    public void compraIngresso() {
        ArrayList<Ingresso> ingressos = new ArrayList<>();
        ingressos = espectador.getIngressos();

        listaApresentacao = listaEspetaculo.get(espetaculo.getSelectedIndex()).getApresentacao();
        for (int i = 0; i < lugaresOcupados.size(); i++) {
            Ingresso ing = new Ingresso();

            ing.setAssento((Integer) lugaresOcupados.get(i));
            ing.setAssento(lugaresOcupados.get(i));
            ing.setAno(listaApresentacao.get(apresentacao.getSelectedIndex()).getAno());
            ing.setDia(listaApresentacao.get(apresentacao.getSelectedIndex()).getDia());
            ing.setMes(listaApresentacao.get(apresentacao.getSelectedIndex()).getMes());
            ing.setHorario(hora.getText());
            ing.setId(ingressoDados.adicionaID());
            //ing.setIdEspec(index);
            ing.setEspectador(espectador);
            ing.setNomeEspetaculo(listaEspetaculo.get(espetaculo.getSelectedIndex()).getNome());
            ing.setEspetaculo(listaEspetaculo.get(espetaculo.getSelectedIndex()));
            ing.setPreco(Float.parseFloat(preco.getText()));

            ingressos.add(ing);
            listaIngressos.add(ing);
            ingressoDados.adicionaDados(ing);

        }

        EspectadorDados espectadorDados = new EspectadorDados();
        espectadorDados.leEspectador();

        espectador.setIngressos(ingressos);
        espectadorDados.alteraDados(index, espectador);

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
            java.util.logging.Logger.getLogger(ComprarIngresso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprarIngresso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprarIngresso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprarIngresso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprarIngresso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> apresentacao;
    private javax.swing.JTextField assento;
    private javax.swing.JButton compra;
    private javax.swing.JTextField data;
    private javax.swing.JComboBox<String> espetaculo;
    private javax.swing.JComboBox<String> formaPagamento;
    private javax.swing.JTextField hora;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPcartao;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField precoTotal;
    private javax.swing.JTextField sala;
    // End of variables declaration//GEN-END:variables
}
