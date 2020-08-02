import java.util.Comparator;
public abstract class Imovel extends Geo {
    private String proprietario;
    private int areaConstruida;
    public static int valorReferencia=50;

    public Imovel(String nome, int areaC, double vr, double latitude, double longitude){
        super(latitude,longitude);
        proprietario = nome;
        areaConstruida = areaC;
    }

    public String getProprietario(){return proprietario;}
    public int getAreaConstruida(){return areaConstruida;}
    public int getVr(){return valorReferencia;}

    public abstract double calculaImposto();

    public static Comparator<Imovel> getCompImp(){
        return new Comparator<Imovel>() {
            @Override
            public int compare(Imovel i1, Imovel i2) {
                return (int) (i2.calculaImposto() - i1.calculaImposto());
            }
        };
    }

    @Override
    public String toString(){
        return "\nProprietario: "+proprietario+"\nArea Construida: "+areaConstruida+super.toString()+"Imposto: "+calculaImposto()+" Reais";
    }
}
