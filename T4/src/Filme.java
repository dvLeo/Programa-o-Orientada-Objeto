public class Filme {
    private int codigo;
    private String nome;
    private boolean locacao;

    public Filme(int codigo, String nome, boolean locacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.locacao = locacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isLocacao() {
        return locacao;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", locacao=" + locacao +
                '}';
    }
}
