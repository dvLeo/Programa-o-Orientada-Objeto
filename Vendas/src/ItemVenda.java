public class ItemVenda {
    private int quantidade;
    private Produtos prod;

    public ItemVenda(int umaQtde, Produtos umProd){
        quantidade = umaQtde;
        prod = umProd;
    }
    public double getValor() {
        return quantidade * prod.getPreco();
    }
    @Override
    public String toString() {
        return prod.toString() + " " + quantidade + " " + getValor();
    }
}
