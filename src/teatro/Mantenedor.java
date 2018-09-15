package teatro;

public class Mantenedor extends Pessoa
{
    private int id =0;
    private String usuario="admin";
    private String senha="admin";

    public Mantenedor() {
    }

    public Mantenedor(String nome, String endereco, String telefone, String email, String dataNascimento, String cpf, int rg, String dataEmissao, String orgaoEmissor) {
        super(nome, endereco, telefone, email, dataNascimento, cpf, rg, dataEmissao, orgaoEmissor);
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
}
