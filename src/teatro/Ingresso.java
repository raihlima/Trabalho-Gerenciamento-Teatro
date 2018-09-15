package teatro;

import java.io.Serializable;

public class Ingresso implements Serializable
{
   private boolean pagamento;
   private boolean cancelado;
   private int id;
   //private int idEspec;
   private Espectador espectador;
   private int dia;
   private int mes;
   private int ano;
   private String horario;
   private String nomeEspetaculo;
   private Espetaculo espetaculo;
   private int assento;
   private float preco;

    public Ingresso(int dia, int mes, int ano, String horario, String nomeEspetaculo, Espetaculo espetaculo, int assento, float preco) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.horario = horario;
        this.nomeEspetaculo = nomeEspetaculo;
        this.espetaculo = espetaculo;
        this.assento = assento;
        this.preco = preco;
        //this.cont = id;
        this.id++;
        this.pagamento=false;
        this.cancelado = false;
    }
    
    public Ingresso(){
        
    }
    public int getId() {
        return id;
    }

    public boolean isPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNomeEspetaculo() {
        return nomeEspetaculo;
    }

    public void setNomeEspetaculo(String nomeEspetaculo) {
        this.nomeEspetaculo = nomeEspetaculo;
    }

    public Espetaculo getEspetaculo() {
        return espetaculo;
    }

    public void setEspetaculo(Espetaculo espetaculo) {
        this.espetaculo = espetaculo;
    }

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }
}
