package teatro;

import java.util.ArrayList;


public class Espectador extends Pessoa
{
    private String profissao;
    private String localDeTrabalho;
    private String enderecoComercial;
    private String usuario;
    private String senha;
    private int id = 0;
    //private static int cadastro=1;
    private ArrayList <String> interesses;
    private ArrayList <Ingresso> ingressos;
    private boolean newsletter;
    
    public Espectador(String profissao, String localDeTrabalho, String enderecoComercial, String usuario, String senha, boolean newsletter) {
        this.profissao = profissao;
        this.localDeTrabalho = localDeTrabalho;
        this.enderecoComercial = enderecoComercial;
        this.usuario = usuario;
        this.senha = senha;
        this.newsletter = newsletter;
    }

    public Espectador() {
        interesses = new ArrayList<>();
        ingressos = new ArrayList<>();
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getLocalDeTrabalho() {
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(String localDeTrabalho) {
        this.localDeTrabalho = localDeTrabalho;
    }

    public String getEnderecoComercial() {
        return enderecoComercial;
    }

    public void setEnderecoComercial(String enderecoComercial) {
        this.enderecoComercial = enderecoComercial;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList <String> getInteresses() {
        return interesses;
    }

    public void setInteresses(ArrayList <String> interesses) {
        this.interesses = interesses;
    }

    public ArrayList <Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(ArrayList <Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public boolean isNewsletter() {
        return newsletter;
    }

    public void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }
}
