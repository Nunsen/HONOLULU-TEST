import java.io.IOException;
import java.util.Scanner;

public class chooseCustomer {
    public static Customer customerType(Scanner input) throws IOException {
        System.out.println("Press 1 for Private Renter\nPress 2 for Company Renter");
        int customerType = input.nextInt();
        input.nextLine();

        System.out.println("Enter Name of Driver");
        String nameDriver = input.nextLine();

        System.out.println("Enter Adress");
        String address = input.nextLine();

        System.out.println("Enter zip code");
        int zip = input.nextInt();
        input.nextLine();

        System.out.println("Enter city");
        String city = input.nextLine();

        System.out.println("Enter phone number");
        int phoneNr = input.nextInt();
        input.nextLine();

        System.out.println("Enter e-mail");
        String email = input.nextLine();

        System.out.println("Enter Drivers License Number");
        int licenseNr = input.nextInt();
        input.nextLine();

        System.out.println("Enter Driver since date (MM-DD-YY");
        String driverSD = input.nextLine();

        if (customerType == 1) {
            return new Customer(nameDriver, address, zip, city, phoneNr, email, licenseNr, driverSD);

        } else if (customerType == 2) {
            System.out.println("Enter Company Name:");
            String comName = input.nextLine();

            System.out.println("Enter Company Address:");
            String comAddress = input.nextLine();

            System.out.println("Enter Company Phone number:");
            int comPhone = input.nextInt();
            input.nextLine();

            System.out.println("Enter Company Registration Number (6 digits):");
            int comReg = input.nextInt();
            input.nextLine();

            return new CustomerCompany(nameDriver, address, zip, city, phoneNr, email, licenseNr, driverSD, comName, comAddress, comPhone, comReg);
        }else {
            System.out.println("Invalid input. Please enter 1 for individual or 2 for company.");
            customerType(input);
        }
        return null;
    }
}
