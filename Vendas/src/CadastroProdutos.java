import java.util.ArrayList;

public class CadastroProdutos {
    private ArrayList<Produtos> lista;

    private CadastroProdutos() {
        lista = new ArrayList<>();
    }

    private static CadastroProdutos instance;

    public static CadastroProdutos getInstance() {
        if (instance == null)
            instance = new CadastroProdutos();
        return instance;
    }

    public void inserir(int umCod, String umNome,
                        double umPreco) {
        //Produto novo = new Produto(umCod, umNome, umPreco);
        //lista.add(novo);
        lista.add( new Produtos(umCod, umNome, umPreco) );
    }

    public Produtos pesquisar(int cod) {
        for (Produtos p: lista) {
            if (p.getCodigo() == cod)
                return p;
        }
        return null;
    }

    public String toString() {
        String aux = "Cadastro de produtos\n- - - - - - - - - - -\n";
        for (Produtos p : lista) {
            aux = aux + p.toString() + "\n";
        }
        return aux;
    }

}