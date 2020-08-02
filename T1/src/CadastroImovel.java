import java.util.ArrayList;
import java.util.Collections;
public class CadastroImoveis {
    private ArrayList<Imovel> lista;
    private CadastroImoveis() {
        lista = new ArrayList<>();
    }
    private static CadastroImoveis instance;

    public static CadastroImoveis getInstance(){
        if (instance == null)
            instance = new CadastroImoveis();
        return instance;
    }

    public void insert(Imovel imovel){
        lista.add(imovel);
    }

    public String list(){
        Collections.sort(lista, Imovel.getCompImp());
        String aux = "";
        for (Imovel i: lista) {
            aux+=i;
        }
        return aux;
    }

    public String list(String proprietario){
        for (Imovel p: lista) {
            if (p.getProprietario().equals(proprietario))
                return p.toString();
        }
        return null;
    }


    public double impostoTotal(){
        double imposto = 0;
        for (Imovel t : lista) {
            imposto += t.calculaImposto();
        }
        return imposto;
    }

    public String toString() {
        String aux = "";
        for (Imovel p : lista) {
            aux = aux + p.toString() + "\n";
        }
        return aux;
    }
}