public class Clientes {
    private int codigo;
    private String nome;
    private String telefone;
    private String senha;

    public Clientes(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.senha = senha;
    }
    public String getNome() {return nome;}
    public int getCodigo() {return codigo;}
    public String getTelefone(){return telefone;}
    public void setTelefone(String telefone){ this.telefone = telefone;}
    public void setSenha(String senha){this.senha = senha;}
    @Override
    public String toString() {
        //return codigo + " - " + nome + " - " + telefone;}
        return  "codigo: " + codigo + " - nome: " + nome + " - telefone: " + telefone;

    }

}


