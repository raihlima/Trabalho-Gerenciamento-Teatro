package teatroDados;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import teatro.*;

public class EspectadorDados implements Serializable {

    ArrayList<Espectador> espectador = new ArrayList<Espectador>();
    private int id;

    public EspectadorDados() {

    }

    public void gravaEspectador() {
        try {
            FileOutputStream arq = new FileOutputStream("Espectador.ser");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(espectador);
            obj.flush();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar o arquivo.", "Erro", 0);
            Logger.getLogger(EspectadorDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leEspectador() {
        try {
            FileInputStream arq = new FileInputStream("Espectador.ser");
            ObjectInputStream obj = new ObjectInputStream(arq);
            this.espectador = (ArrayList<Espectador>) obj.readObject();

        } catch (Exception erro) {
            //JOptionPane.showMessageDialog(null, "Não há cadastro de usuários.","Info", 1);            
        }
    }

    public void gravaID() {
        try {
            FileOutputStream arq = new FileOutputStream("ID.ser");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(id);
            obj.flush();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar o arquivo.", "Erro", 0);
            Logger.getLogger(EspectadorDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leID() {
        try {
            FileInputStream arq = new FileInputStream("ID.ser");
            ObjectInputStream obj = new ObjectInputStream(arq);
            this.id = (Integer) obj.readObject();

        } catch (Exception erro) {
            this.id = 1;
            gravaID();
        }
    }

    public ArrayList<Espectador> retornaDados() {
        return espectador;
    }

    public void adicionaDados(Espectador m) {
        leID();
        m.setId(id);
        this.id = this.id + 1;
        gravaID();
        leEspectador();
        this.espectador.add(m);
        gravaEspectador();
    }

    public void deletaDados(int m) {
        leEspectador();
        espectador.remove(m);
        gravaEspectador();
    }

    public boolean verificaUser(String user) {
        leEspectador();
        int i;
        for (i = 0; i < espectador.size(); i++) {
            if (user.equals(espectador.get(i).getUsuario())) {
                // Da falso quando encontra um usuario igual

                return false;
            }
        }

        return true;
    }

    public int verificaLogin(String user, String senha) {
        leEspectador();
        String aux;

       for (int i = 0; i < espectador.size(); i++) {
            if (user.equals(espectador.get(i).getUsuario())) {
                if (senha.equals(espectador.get(i).getSenha())) {
                    return i;
                } else {
                    return -1;
                }
            }
       }
        return -1;
    }
  
    
    public boolean recuperarSenha(String user, String email){
        leEspectador();
        for(int i = 0;i<espectador.size();i++){
            if(espectador.get(i).getUsuario().equals(user)){
                if(espectador.get(i).getEmail().equals(email)){
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public void alteraDados(int i, Espectador e){
        leEspectador();
        espectador.remove(i);
        espectador.add(i, e);
        gravaEspectador();
    }
    
    public Espectador retornaEspectador(int i) {
        return espectador.get(i);
    }
    
    public void excluiIngresso(int idIngresso,int idUser)
    {
        leEspectador();
        for(int i = 0; i<espectador.size();i++){
            if(espectador.get(i).getId()==idUser){
            
                ArrayList <Ingresso> ing = new ArrayList<>();
                ing = espectador.get(i).getIngressos();
                for(int j =0;j<ing.size();j++){
                    if(ing.get(j).getId()==idIngresso){

                        ing.remove(j);
                        espectador.get(i).setIngressos(ing);
                        gravaEspectador();
                    }
                }
            }
            
        }
        
    }
    
    public void geraRelatorio()
    {
        leEspectador();
        JOptionPane.showMessageDialog(null, "Usuários cadastrados: "+ espectador.size(),"Relatório",1);
    }
}
