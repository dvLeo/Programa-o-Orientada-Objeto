public class ProdutoAlcoolico extends Produtos {

    public ProdutoAlcoolico(int codigo, String nome, double preco){
        super(codigo, nome, preco);

    }
    @Override
    public double getPreco(){return super.getPreco()*(1+ProdutoAlcoolico.getTaxaBebidasAlcoolicas());}
    private static double taxaBebidasAlcoolicas;
    public static double getTaxaBebidasAlcoolicas(){return taxaBebidasAlcoolicas;}
    public static void setTaxaBebidasAlcoolicas(double outraTaxa) {taxaBebidasAlcoolicas = outraTaxa;}
}