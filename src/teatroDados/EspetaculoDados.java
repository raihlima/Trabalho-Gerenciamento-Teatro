package teatroDados;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import teatro.Apresentacao;
import teatro.Espetaculo;

public class EspetaculoDados implements Serializable {

    ArrayList <Espetaculo> espetaculo = new ArrayList<Espetaculo>();
    ArrayList <String> tipo = new ArrayList<>();

    public EspetaculoDados() {
    }
    
    public void gravaEspetaculo() {
        try {
            FileOutputStream arq = new FileOutputStream("Espetaculo.ser");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(espetaculo);
            obj.flush();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar o arquivo.", "Erro", 0);
            Logger.getLogger(EspetaculoDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leEspetaculo() {
        try {
            FileInputStream arq = new FileInputStream("Espetaculo.ser");
            ObjectInputStream obj = new ObjectInputStream(arq);
            this.espetaculo = (ArrayList<Espetaculo>) obj.readObject();

        } catch (Exception erro) {
            //JOptionPane.showMessageDialog(null, "Não há cadastro de espetaculos.","Info", 1);            
        }
    }
    
    public ArrayList<Espetaculo> retornaDados() {
         leEspetaculo();
        return espetaculo;
    }

    public void adicionaDados(Espetaculo m) {
        leEspetaculo();
        this.espetaculo.add(m);
        gravaEspetaculo();
    }
     public void adicionaDados(int i,Espetaculo m) {
        leEspetaculo();
        this.espetaculo.add(i,m);
        gravaEspetaculo();
    }
     
     public void adicionaApresentacao(int i,Apresentacao ap){
         leEspetaculo();
         this.espetaculo.get(i).addApresentacao(ap);
         gravaEspetaculo();
     }
     public void removeApresentacao(int i, int a){
         leEspetaculo();
         this.espetaculo.get(i).removeApresentacao(a);
         gravaEspetaculo();
     }
     
    public void deletaDados(int m) {
        leEspetaculo();
        espetaculo.remove(m);
        gravaEspetaculo();
    }
    
    public Espetaculo retornaEspetaculo(int i) {
          leEspetaculo();
        return espetaculo.get(i);
    }
    
    public void gravaTipo() {
        try {
            FileOutputStream arq = new FileOutputStream("Tipo.ser");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(tipo);
            obj.flush();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar o arquivo.", "Erro", 0);
        }
    }

    public void leTipo() {
        try {
            FileInputStream arq = new FileInputStream("Tipo.ser");
            ObjectInputStream obj = new ObjectInputStream(arq);
            this.tipo = (ArrayList<String>) obj.readObject();

        } catch (Exception erro) {
            //JOptionPane.showMessageDialog(null, "Não há cadastro de tipos.","Info", 1);            
        }
    }
    
    public ArrayList<String> retornaTipo() {
         leTipo();
        return tipo;
    }

    public void adicionaTipo(String m) {
        leTipo();
        this.tipo.add(m);
        gravaTipo();
    }
     public void alteraTipo(int i,String m) {
        leTipo();
        deletaTipo(i);
        this.tipo.add(i,m);
        gravaTipo();
    }
     
     
    public void deletaTipo(int m) {
        leTipo();
        tipo.remove(m);
        gravaTipo();
    }   
}