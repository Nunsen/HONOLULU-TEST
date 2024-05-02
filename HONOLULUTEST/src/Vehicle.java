public class Vehicle {
    private String brand;
    private String model;
    private String gear;
    private int horsePower;
    private String fuelType;
    private String regNr;
    private double odometer;
    private String year;
    public Vehicle(String b, String mo, String g, int hp, String ft, String rn, double od, String yr){
        this.brand = b;
        this.model = mo;
        this.gear = g;
        this.horsePower = hp;
        this.fuelType = ft;
        this.regNr = rn;
        this.odometer = od;
        this.year = yr;

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
    public String getFuelType() {
        return fuelType;
    }
    public String getRegNr() {
        return regNr;
    }
    public double getOdometer() {
        return odometer;
    }

    public String getYear() {
        return year;
    }

    public String toString(){
        return ("Brand: "+brand+"\nModel: "+model+"\nGear: "+gear+"\nHorse power: "+ horsePower + "\nFueltype: "+fuelType+"\nRegistration Number: " + regNr + "\nOdometer: " + odometer +"\nYear: "+ year);
    }
}