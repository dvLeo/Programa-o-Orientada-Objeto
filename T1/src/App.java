
//Questão 2. (1.5 pt) Responda suscintamente (explique/exemplifique suas respostas):

// • neste diagrama pode ser observado polimorfismo?
//   R: Sim, pois há duas classes herdadas de uma superclasse, onde se encontram métodos com a mesma identificação mas com diferentes comportamentos.
// • neste diagrama pode ser observado sobrecarga?
//   R: Sim, pois tenho métodos "iguais", como por exemplo os lists,.
// • neste diagrama pode ser observado sobrescrita?
//   R: Sim, pois na prática de heranças, a gente reescreve um mesmo método, como o super.toString
// • qual a implicação da classe Imovel ser abstract?
//   R: A classe Imovel não poderá ser implementada.
// • qual a implicação do método calculaImposto ser abstract
//   R: O método "calculaImpostos" terá que ser implementado em todas as classes herdeiras.



public class App {
    public static void main(String[] args) {
        CadastroImoveis imoveis = CadastroImoveis.getInstance();

        imoveis.insert(new Residencial("John Doe", 550, 250, 5,41.40338, 22.84725));
        imoveis.insert(new Residencial("Cleison", 400, 300, 5,33.48296, 91.42368));
        imoveis.insert(new Residencial("Juca", 800, 700, 5,99.78514, 52.64214));
        imoveis.insert(new Residencial("Ana", 200, 150, 5,74.41275, 88.95212));
        imoveis.insert(new Comercial("Michele",  180, 5,64.47812, 12.41823));


        System.out.println(imoveis.list());

        System.out.println("\n*********************************************\nImposto total: "+ imoveis.impostoTotal()+" Reais");

        System.out.println("\n*********************************************\n"+imoveis.list("John Doe"));
    }
}


