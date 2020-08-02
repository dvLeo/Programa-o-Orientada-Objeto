import java.util.ArrayList;
public class Vendas {
    private Clientes comprador;
    private ArrayList<ItemVenda> itens;

    public Vendas(Clientes cli) {
        comprador = cli;
        itens = new ArrayList<>();
    }
    public void inserir(Produtos prod) {
        this.inserir(1, prod);
    }
    public void inserir(int umaQtde, Produtos prod) {
        itens.add(new ItemVenda(umaQtde, prod));

    }
    public double valorTotal() {
        double total = 0;
        for(ItemVenda item : itens) {
            total = total + item.getValor();
        }
        return total;
    }
    @Override
    public String toString() {
        StringBuilder rel = new StringBuilder("\nCupom de Venda");
        rel.append("\tComprador: " + comprador.toString());
        rel.append("\n- - - - - - - - - - - - - - - - - - - - - -\n");
        for (ItemVenda item: itens ) {
            rel.append(item.toString());
            rel.append("\n");
        }
        rel.append("\n");
        rel.append("Total: " + this.valorTotal());
        rel.append("\n------------------------------------------\n");
        return rel.toString();
    }
}
