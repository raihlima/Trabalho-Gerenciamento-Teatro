package teatro;

import java.io.Serializable;
import java.util.ArrayList;

public class Espetaculo implements Serializable
{
    private String tipo;
    private String nome;
    private String descricao;
    private String faixaEtaria;
    //private String artista;
    private ArrayList <Artista> artistas;
    private int duracao;
    private int diaIncio;
    private int mesInicio;
    private int anoInicio;
    private int diaFim;
    private int mesfim;
    private int anoFim;
    private float preco;
    ArrayList <Apresentacao> apresentacao;

    public Espetaculo(String tipo, String nome, String descricao, String faixaEtaria, String artista, int duracao, int diaIncio, int mesInicio, int anoInicio, int diaFim, int mesfim, int anoFim, float preco) {
        this.tipo = tipo;
        this.nome = nome;
        this.descricao = descricao;
        this.faixaEtaria = faixaEtaria;
        //this.artista = artista;
        this.duracao = duracao;
        this.diaIncio = diaIncio;
        this.mesInicio = mesInicio;
        this.anoInicio = anoInicio;
        this.diaFim = diaFim;
        this.mesfim = mesfim;
        this.anoFim = anoFim;
        this.preco = preco;
    }

    public Espetaculo() {
    apresentacao=new ArrayList<>();
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    /*public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }*/

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDiaIncio() {
        return diaIncio;
    }

    public void setDiaIncio(int diaIncio) {
        this.diaIncio = diaIncio;
    }

    public int getMesInicio() {
        return mesInicio;
    }

    public void setMesInicio(int mesInicio) {
        this.mesInicio = mesInicio;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public int getDiaFim() {
        return diaFim;
    }

    public void setDiaFim(int diaFim) {
        this.diaFim = diaFim;
    }

    public int getMesfim() {
        return mesfim;
    }

    public void setMesfim(int mesfim) {
        this.mesfim = mesfim;
    }

    public int getAnoFim() {
        return anoFim;
    }

    public void setAnoFim(int anoFim) {
        this.anoFim = anoFim;
    }

    public ArrayList<Apresentacao> getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(ArrayList<Apresentacao> apresentacao) {
        this.apresentacao = apresentacao;
    }
    
    public void addArtista(Artista a)
    {
        this.artistas.add(a);
    }

    public String getArtistaNome(int index)
    {
        return this.artistas.get(index).toString();
    }
    
    public Artista getArtista(int index)
    {
        return (Artista)this.artistas.get(index);
    }
    
    public void removeArtista(int i)
    {
        this.artistas.remove(i);
    }
    
    public void addApresentacao (Apresentacao a){
        this.apresentacao.add(a);
    }
    
    public void addApresentacao (int i,Apresentacao a){
        this.apresentacao.add(i,a);
    }
    
    public void removeApresentacao (int i){
        this.apresentacao.remove(i);
    }
    
    public int retornaTamanho(){ 
        int x=0;
        if(apresentacao.size()==0){
            return x;
        }
        else{
            x=apresentacao.size();
                    
            return x;
        }
    }
}
