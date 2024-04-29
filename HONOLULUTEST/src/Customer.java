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
}
