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
import teatro.Artista;

public class ArtistaDados implements Serializable {

    ArrayList<Artista> artista = new ArrayList<Artista>();

    public ArtistaDados() {
        //
    }

    public void gravaArtista() {
        try {
            FileOutputStream arq = new FileOutputStream("Artista.ser");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(artista);
            obj.flush();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar o arquivo.", "Erro", 0);
            Logger.getLogger(ArtistaDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leArtista() {
        try {
            FileInputStream arq = new FileInputStream("Artista.ser");
            ObjectInputStream obj = new ObjectInputStream(arq);
            this.artista = (ArrayList<Artista>) obj.readObject();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não há cadastro de artistas.", "Info", 1);
        }
    }

    public ArrayList<Artista> retornaDados() {
        leArtista();
        return artista;
    }

    public void adicionaDados(Artista m) {
        leArtista();
        this.artista.add(m);
        gravaArtista();
    }

    public void deletaDados(int m) {
        leArtista();
        artista.remove(m);
        gravaArtista();
    }

    public void salvaDados(Artista a, int m) {
        leArtista();
        artista.add(m, a);
        gravaArtista();
    }

    public Artista retornaArtista(int i) {
        leArtista();
        return artista.get(i);
    }
}
