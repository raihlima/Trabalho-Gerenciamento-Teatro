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
import teatro.Espectador;
import teatro.Ingresso;

public class IngressoDados implements Serializable{
    
    ArrayList<Ingresso> ingresso = new ArrayList<Ingresso>();
    private int idIngresso;

    public IngressoDados() {

    }

    public void gravaIngresso() {
        try {
            FileOutputStream arq = new FileOutputStream("Ingresso.ser");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(ingresso);
            obj.flush();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar o arquivo.", "Erro", 0);
            Logger.getLogger(IngressoDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leIngresso() {
        try {
            FileInputStream arq = new FileInputStream("Ingresso.ser");
            ObjectInputStream obj = new ObjectInputStream(arq);
            this.ingresso = (ArrayList<Ingresso>) obj.readObject();

        } catch (Exception erro) {
            //JOptionPane.showMessageDialog(null, "Não há cadastro de usuários.","Info", 1);            
        }
    }

    public void gravaID() {
        try {
            FileOutputStream arq = new FileOutputStream("IdIngresso.ser");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(idIngresso);
            obj.flush();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar o arquivo.", "Erro", 0);
            Logger.getLogger(IngressoDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leID() {
        try {
            FileInputStream arq = new FileInputStream("IdIngresso.ser");
            ObjectInputStream obj = new ObjectInputStream(arq);
            this.idIngresso = (Integer) obj.readObject();

        } catch (Exception erro) {
            this.idIngresso = 1;
            gravaID();
        }
    }

    public ArrayList<Ingresso> retornaDados() {
        leIngresso();
        return ingresso;
    }

    public void adicionaDados(Ingresso m) {
     
        leIngresso();
        this.ingresso.add(m);
        gravaIngresso();
    }
    
    public int adicionaID(){
        int aux;
        leID();
        aux=idIngresso;
        this.idIngresso = this.idIngresso + 1;
        gravaID();
        return aux;
    }
    
    public void alteraDados(int index,Ingresso m) {
       
        leIngresso();
        this.ingresso.remove(index);
        this.ingresso.add(index,m);
        gravaIngresso();
    }

    public void deletaDados(Ingresso m) {
        leIngresso();
        ingresso.remove(m);
        gravaIngresso();
    }
    
    public int relatorioIngressosVendidos(){
        int ing=0;
        for(int i=0;i<ingresso.size();i++){
           if(ingresso.get(i).isPagamento()){
           ing++;
           }
        }
        return ing;
    }
    
    public float relatorioPrecoVendas(){
        leIngresso();
        float total=0;
        for(int i=0;i<ingresso.size();i++){
           if(ingresso.get(i).isPagamento()){
           total+=ingresso.get(i).getPreco();
           }
        }
        return total;
    }
    
    public void deletaIngresso(int id){
        leIngresso();
        for(int i=0;i<ingresso.size();i++){
            if(id==ingresso.get(i).getId()){
                ingresso.remove(i);
            }
        }
        gravaIngresso();
    }
}
