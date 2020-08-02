public class Geo {
    private double latitude;
    private double longitude;

    public Geo (double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLatitude(){return latitude;}
    public Double getLongitude(){return longitude;}

    @Override
    public String toString(){
        return "\nLatidude: " +latitude+ " | " + "Longitude: "+longitude+"\n";
    }

}
