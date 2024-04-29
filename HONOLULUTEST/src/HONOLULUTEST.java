import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

        public class HONOLULUTEST {
            public static void main(String[] args) throws IOException {
                Scanner input = new Scanner(System.in);
                //Kalder ourMenu() metoden fra OurMenu klassen, som specifikt står får denne opgave
                OurMenu.ourMenu();
                Customer customer = customerType(input);
                writeContract(customer, true);
                //FileWriter.wrnullWriter();
            }
            //Første metode der finder kundetype
            public static Customer customerType(Scanner input) throws IOException {
                System.out.println("Press 1 for Private Renter\nPress 2 for Company Renter");
                int customerType = input.nextInt();

                System.out.println("Enter Name of Driver");
                String nameDriver = input.next();

                System.out.println("Enter Adress");
                String address = input.next();
                input.nextLine();
                input.nextLine();

                System.out.println("Enter zip code");
                int zip = input.nextInt();

                System.out.println("Enter city");
                String city = input.next();

                System.out.println("Enter phone number");
                int phoneNr = input.nextInt();

                System.out.println("Enter e-mail");
                String email = input.next();

                System.out.println("Enter Drivers License Number");
                int licenseNr = input.nextInt();

                System.out.println("Enter Driver since date (MM-DD-YY");
                int driverSD = input.nextInt();

                /*if statement, scanneren leder efter svaret int customerType, 1 er for privat udlejer,
                2 for company udlejer --> derfor else if, hvor man får lov at tilføje flere informationer til company*/
                if (customerType == 1) {
                    return new Customer(nameDriver, address, zip, city, phoneNr, email, licenseNr, driverSD);
                } else if (customerType == 2) {
                    System.out.println("Enter Company Name");
                    String comName = input.next();

                    System.out.println("Enter Company Address");
                    String comAddress = input.next();

                    System.out.println("Enter Company Phone number");
                    int comPhone = input.nextInt();

                    System.out.println("Enter Company Registration Number (6 digits)");
                    int comReg = input.nextInt();

                    //returnerer med de ekstra informationer
                    return new CustomerCompany(nameDriver, address, zip, city, phoneNr, email, licenseNr, driverSD, comName, comAddress, comPhone, comReg);
                }
                System.out.println("Invalid input for customer type.");
                return null;
            }
            public static void writeContract(Customer c, boolean customerIsCompany) throws IOException {
                //anvender localdate til at bruge den aktuelle dato på hvornår kontrakten oprettes
                LocalDate currentDate = LocalDate.now();

                //Vi vil have systemet til at oprette en fil der hedder Contract + dagens dato, fremfor at vi laver en fil
                String fileName = "Contract_" + currentDate + ".txt";

                //Filen oprettes
                java.io.FileWriter writer = new java.io.FileWriter(fileName);

                //følgende informationer skrives ind i filen
                writer.write("This is a new contract created on " + currentDate + "." + "\n");

                writer.write("Name of Driver: " + c.getNameDriver() + "\n");
                writer.write("Address: " + c.getAddress() + "\n");
                writer.write("Zip code: " + c.getZip() + "\n");
                writer.write("City: " + c.getCity() + "\n");
                writer.write("Phone number: " + c.getPhoneNr() + "\n");
                writer.write("E-mail: " + c.getEmail() + "\n");
                writer.write("Drives License Number: " + c.getLicenseNr() + "\n");
                writer.write("Driver since date: " + c.getDriverSD() + "\n");

        /*HVIS boolean customerIsCompany er sand(2), og comName (fra CustomerCompany klassen
        IKKE(!) isEmpty, dvs. den er ikke tom, SÅ skal det printes med over i filen
        Dette sikrer derfor at der ikke printes company information ud, hvis ikke det er nødvendigt */
                if (customerIsCompany && CustomerCompany.getComName() != null && !CustomerCompany.getComName().isEmpty()) {
                    //if (customerIsCompany && !CustomerCompany.getComName().isEmpty()){
                    writer.write("Comany Name: " + CustomerCompany.getComName() + "\n");
                    writer.write("Company Address: " + CustomerCompany.getComAddress() + "\n");
                    writer.write("Company Phone number: " + CustomerCompany.getComPhone() + "\n");
                    writer.write("Company Registration Number: " + CustomerCompany.getComReg() + "\n");
                }
                writer.close();
            }
        }

        /*public static void pickCar(Scanner input) {

                System.out.println("Select car category:\nPress 1 for Family\nPress 2 for Luxery\nPress 3 for Sport\nPress 0 to quit.");
                int answer = input.nextInt();
                switch (answer) {
                    case 1:
                        System.out.println("Press 1 for \nPress 2 for xx\nPress 3 for xxx");
                        break;

                    case 2:
                        System.out.println("Press 1 for x");
                        break;


                    case 3:
                        System.out.println("Press 1 for x jfdsjf");
                        break;

                    case 0:
                        System.out.println("Thank you, Goodbye!");
                        System.exit(0);

                    default:
                        System.out.println("Number is invalid, please choose a number between 0-3.");
*/
