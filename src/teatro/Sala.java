package teatro;

import java.io.Serializable;

public class Sala implements Serializable
{
    private int numero;
    private String descricao;
    private int numAsentos;
    private int numColunas;
    public int []mapa_linha;

    public Sala(int numero, String descricao, int numAsentos, int numColunas) {
        this.numero = numero;
        this.descricao = descricao;
        this.numAsentos = numAsentos;
        this.mapa_linha= new int [numAsentos];
        this.numColunas = numColunas;
        
    }

    public Sala() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumAsentos() {
        return numAsentos;
    }

    public void setNumAsentos(int numAsentos) {
        this.numAsentos = numAsentos;
    }

    public int getNumColunas() {
        return numColunas;
    }

    public void setNumColunas(int numColunas) {
        this.numColunas = numColunas;
    }
    
}
