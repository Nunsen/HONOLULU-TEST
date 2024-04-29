public class Vehicle {
    private String brand;
    private String model;
    private String gear;
    private int horsePower;
    private int fuelTime;
    private int regNr;
    private double odometer;
    public Vehicle(String b, String mo, String g, int hp, int ft, int rn, double od ){
        this.brand = b;
        this.model = mo;
        this.gear = g;
        this.horsePower = hp;
        this.fuelTime = ft;
        this.regNr = rn;
        this.odometer = od;

    }
    //Fordi vi har private, skal vi lave getter
    public String getBrand() {
        return brand;
    }
    public String getMode() {
        return model;
    }
    public String getGear () {
        return gear;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public int getFuelTime() {
        return fuelTime;
    }
    public int getRegNr() {
        return regNr;
    }
    public double odometer() {
        return odometer;
    }
}