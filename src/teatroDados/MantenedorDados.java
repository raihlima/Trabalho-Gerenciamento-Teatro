package teatroDados;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import teatro.*;

public class MantenedorDados implements Serializable {

    Mantenedor admin = new Mantenedor();

    public MantenedorDados() {

    }

    public void gravaMantenedor() {
        try {
            FileOutputStream arq = new FileOutputStream("Mantenedor.ser");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(admin);
            obj.flush();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar o arquivo.", "Erro", 0);
            Logger.getLogger(MantenedorDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leMantenedor() {
        try {
            FileInputStream arq = new FileInputStream("Mantenedor.ser");
            ObjectInputStream obj = new ObjectInputStream(arq);
            this.admin = (Mantenedor) obj.readObject();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Criando administrador", "Info", 1);
        }
    }

    public Mantenedor retornaMantenedor() {
        leMantenedor();
        return admin;
    }

    public void alteraDados(Mantenedor m) {
        leMantenedor();
        this.admin = m;
        gravaMantenedor();
    }
}
