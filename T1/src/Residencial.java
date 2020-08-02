public class Residencial extends Imovel {
    private int areaTerreno;

    public Residencial( String nome, int areaTerreno, int areaC, double vr, double latitude, double longitude){
        super(nome, areaC, vr, latitude, longitude);
        this.areaTerreno = areaTerreno;
    }

    public int getAreaTerreno(){return areaTerreno;}

    @Override
    public double calculaImposto() {
        int imposto = 0;
        if(getAreaConstruida()<200){
            imposto = 0;
        }
        if(getAreaConstruida()>200 ){
            int valorExcedente = getAreaConstruida()-200;
            imposto = (int) (valorExcedente*getVr());
        }
        if (getAreaTerreno()>500){
            imposto+=100*getVr();
        }
        return imposto;
    }

    @Override
    public String toString(){
        String aux ="\n____________________\nArea Residencial\n"+ super.toString()+ "\nArea do Terreno: "+areaTerreno+"\n";
        if (getAreaTerreno()>500){
            aux += "Será cobrado IMPOSTO EXTRA";
        }
        return aux;
    }
}
