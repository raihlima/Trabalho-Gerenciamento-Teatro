package teatro;

import java.util.ArrayList;

public class Teatro {
    // Classes com váriaveis globais
    ArrayList<Artista> listaArtista = new ArrayList <>();
    ArrayList<Espetaculo> listaEspetaculo = new ArrayList <>();
    ArrayList<Espectador> listaEspectador = new ArrayList<>();
    ArrayList<Ingresso> listaIngressos = new ArrayList<>();
    Mantenedor admin = new Mantenedor();
        
    // Interfaces globais
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // criando ArrayList de classes
        /*ArrayList<Artista> listaArtista = new ArrayList <>();
        ArrayList<Espetaculo> listaEspetaculo = new ArrayList <>();
        ArrayList<Espectador> listaEspectador = new ArrayList<>();
        */
                
        // criando interfaces
        teatroInterfaces.Login l1 = new teatroInterfaces.Login();
        l1.setVisible(true);
    }
}
