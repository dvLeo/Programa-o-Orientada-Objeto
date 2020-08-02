import java.time.LocalDate;

public class ProdutoEE extends Produtos {
    private int diasGarantia;

    public ProdutoEE(int codigo, String nome, double preco, int numeroDias){
        super(codigo, nome, preco);
        this.diasGarantia = numeroDias;
    }
    //LocalDate cria uma data sem hora,
    // now é a data de hoje
    // e o plusDays soma essa data com o diasGarantia
    public String getGarantia() {
        LocalDate garantia = LocalDate.now().plusDays(diasGarantia);
        return getNome() + "\n - Garantia de: " + diasGarantia + "dias, com vencimento de: " + garantia;
    }
    @Override
    public String toString() {return super.toString() + "Garantia EE: " + diasGarantia;}
}
