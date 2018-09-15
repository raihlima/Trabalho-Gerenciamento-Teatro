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
import teatro.Sala;

public class SalaDados implements Serializable{

    ArrayList<Sala> sala = new ArrayList<Sala>();

    public SalaDados() {
    }

    public void gravaSala() {
        try {
            FileOutputStream arq = new FileOutputStream("Sala.ser");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(sala);
            obj.flush();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar o arquivo.", "Erro", 0);
            Logger.getLogger(SalaDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leSala() {
        try {
            FileInputStream arq = new FileInputStream("Sala.ser");
            ObjectInputStream obj = new ObjectInputStream(arq);
            this.sala = (ArrayList<Sala>) obj.readObject();

        } catch (Exception erro) {
            //JOptionPane.showMessageDialog(null, "Não há cadastro de salas.","Info", 1);            
        }
    }
    
    public ArrayList<Sala> retornaDados() {
         leSala();
        return sala;
    }

    public void adicionaDados(Sala m) {
        leSala();
        this.sala.add(m);
        gravaSala();
    }
    
    public void adicionaDados(int x,Sala m) {
        leSala();
        this.sala.add(x,m);
        gravaSala();
    }
    
    public void deletaDados(int m) {
        leSala();
        sala.remove(m);
        gravaSala();
    }
    
    public Sala retornaSala(int i) {
        leSala();
        return sala.get(i);
    }
    
    public boolean verificaIgual(int n) {
        leSala();
        int i;
        for (i = 0; i < sala.size(); i++) {
            if (n==(sala.get(i).getNumero())) {
                return false;
            }
        }
        return true;
    }
}