import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ProdutoAlcoolico.setTaxaBebidasAlcoolicas(.50);
        System.out.println(("Taxa Bebidas Alcoolicas: " + ProdutoAlcoolico.getTaxaBebidasAlcoolicas()));

        //CadastroClientes cadCli = new CadastroClientes();
        CadastroClientes cadCli = CadastroClientes.getCadastroClientes();
        cadCli.inserir(717, "Sr. Smith");
        cadCli.inserir(913, "Sra. Smith");

        Clientes c = new Clientes(123, "Huguinho");
        cadCli.inserir(c);

        Clientes pf;

        pf = new ClientePF(981, "Zezinho", "123.456.789.01");
        cadCli.inserir(pf);

        Clientes estu;
        estu = new Estudante(786, "Luizinho", "111.222.333-55",
                "191003456", "PUCRS");
        cadCli.inserir(estu);

        System.out.println(cadCli.toString());


        //CadastroProdutos cadProd = new CadastroProdutos();
        CadastroProdutos cadProd = CadastroProdutos.getInstance();
        cadProd.inserir(21, "Lápis 1HB", 1.50);
        cadProd.inserir(22, "Caneta vermelha", 3);
        cadProd.inserir(23, "Recarga Caneta Pilot", 10);

        System.out.println(cadProd.toString());

        Vendas venda1 = new Vendas(cadCli.pesquisar(786));
        Produtos prod = cadProd.pesquisar(22);

        if (prod != null) venda1.inserir(3, prod);

        prod = cadProd.pesquisar(21);
        if (prod != null) venda1.inserir(prod);

        //System.out.println("Total da venda1: "+venda1.valorTotal());

        System.out.println(venda1.toString());


    }

}