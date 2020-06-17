public class Cliente {
    private int codigo;
    private String nome;

    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
