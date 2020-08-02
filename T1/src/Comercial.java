public class Comercial extends Imovel {

    public Comercial(String nome, int areaC, double vr, double latitude, double longitude) {
        super(nome, areaC, vr, latitude, longitude);
    }

    @Override
    public double calculaImposto() {
        return 0;
    }
    public String toString() {
        return "\n____________________\nArea Comercial\n" + super.toString() ;
    }
}