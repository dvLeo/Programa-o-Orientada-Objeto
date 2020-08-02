public class Produtos {
    private int codigo;
    private String nome;
    private double preco;

    public Produtos(int umCodigo, String umNome, double umPreco) {
        codigo =  umCodigo;
        nome = umNome;
        preco = umPreco;
    }
    public int getCodigo() {return codigo;}
    public String getNome() {return nome;}
    public double getPreco() {return preco;}

    @Override
    public String toString() {
        return String.format("(%3d) %20s %6.2f ",
                codigo,
                nome,
                preco);
    }
}
