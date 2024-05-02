import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Customer {
    private String nameDriver;
    private String address;
    private int zip;
    private String city;
    private int phoneNr;
    private String email;
    private int licenseNr;
    private int driverSD;

    //private int customerId;

    //setter navnene, så vi kan overload, variable med samme navn
    public Customer(String nameDriver, String address, int zip, String city, int phoneNr, String email, int licenseNr, int driverSD) {
        this.nameDriver = nameDriver;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.phoneNr = phoneNr;
        this.email = email;
        this.licenseNr = licenseNr;
        this.driverSD = driverSD;
        //this.customerId = customerId;
    }

    //getter, eftersom vi har lavet vores fields private
    public String getNameDriver() {
        return nameDriver;
    }

    public String getAddress() {
        return address;
    }

    public int getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public int getPhoneNr() {
        return phoneNr;
    }

    public String getEmail() {
        return email;
    }

    public int getLicenseNr() {
        return licenseNr;
    }

    public int getDriverSD() {
        return driverSD;
    }

    //public int getCustomerId(){return customerId;}

    public String toString() {
        return "Name of Driver: " + nameDriver + "\n" + "Address: " + address + "\n" + "Zip code: " + zip + "\n" + "City: " + city + "\n" + "Phone number: " + phoneNr + "\n" + "E-mail: " + email + "\n" + "Drives License Number: " + licenseNr + "\n" + "Driver since date: " + driverSD + "\n";
    }
}
