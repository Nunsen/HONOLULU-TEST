import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

        public class HONOLULUTEST {
            public static void main(String[] args) throws IOException {
                Scanner input = new Scanner(System.in);
                //Kalder ourMenu() metoden fra OurMenu klassen, som specifikt står for denne opgave
                OurMenu.ourMenu();
                //Vi deklarerer en variable c af typen Customer, kalder metoden customerType med Scanner parameter
                Customer c = customerType(input);
                /*Vi opretter en slags pladsholder/variable som skal opbevare den valgte bil,
                da den ikke indeholder noget lige nu sættes den til null */
                Vehicle selectedCar = null;
                pickCar(input, c);
                //FileWriter.wrnullWriter();
            }
            //Første metode der finder kundetypen enten private eller company
            public static Customer customerType(Scanner input) throws IOException {
                System.out.println("Press 1 for Private Renter\nPress 2 for Company Renter");
                int customerType = input.nextInt();
                input.nextLine();

                String nameDriver = null;
                String address = null;
                int zip = 0;
                String city = null;
                int phoneNr = 0;
                String email = null;
                int licenseNr = 0;
                int driverSD = 0;

                if (customerType == 1) {
                    System.out.println("Enter Name of Driver");
                    nameDriver = input.nextLine();

                    System.out.println("Enter Adress");
                    address = input.nextLine();

                    System.out.println("Enter zip code");
                    zip = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter city");
                    city = input.nextLine();

                    System.out.println("Enter phone number");
                    phoneNr = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter e-mail");
                    email = input.nextLine();

                    System.out.println("Enter Drivers License Number");
                    licenseNr = input.nextInt();

                    System.out.println("Enter Driver since date (MM-DD-YY");
                    driverSD = input.nextInt();
                    input.nextLine();
                        return new Customer(nameDriver, address, zip, city, phoneNr, email, licenseNr, driverSD);

                 } if (customerType == 2) {
                        System.out.println("Enter Company Name:");
                        String comName = input.next();

                        System.out.println("Enter Company Address:");
                        String comAddress = input.next();

                        System.out.println("Enter Company Phone number:");
                        int comPhone = input.nextInt();

                        System.out.println("Enter Company Registration Number (6 digits):");
                        int comReg = input.nextInt();
                        return new CustomerCompany(nameDriver, address, zip, city, phoneNr, email, licenseNr, driverSD, comName, comAddress, comPhone, comReg);
                 }else {
                System.out.println("Invalid input. Please enter 1 for individual or 2 for company.");
                customerType(input);
                }
                return null;
            }
            public static void writeContract(Customer c, boolean customerIsCompany, Vehicle car) throws IOException {
                //anvender localdate til at bruge den aktuelle dato på hvornår kontrakten oprettes
                LocalDate currentDate = LocalDate.now();

                //Vi vil have systemet til at oprette en fil der hedder Contract + dagens dato, fremfor at vi laver en fil
                String fileName = "Contract_" + currentDate + ".txt";

                //Filen oprettes, der tilføjes append:true da der senere skal tilføjes biltype til samme fil
                FileWriter writer = new FileWriter(fileName,true);

                //følgende informationer om kunden skrives ind i filen
                writer.write("X****************************************************************X\n");
                writer.write("\t\tContract\n");
                writer.write("X****************************************************************X\n");
                writer.write("This is a new contract created on " + currentDate + "." + "\n");

                //TO STRING METODE
                writer.write(c.toString());

        /*HVIS boolean customerIsCompany er sand(2), og comName (fra CustomerCompany klassen
        IKKE(!) isEmpty, dvs. den er ikke tom, SÅ skal det printes med over i filen
        Dette sikrer derfor at der ikke printes company information ud, hvis ikke det er nødvendigt */
                if (customerIsCompany && c instanceof CustomerCompany) {
                    CustomerCompany customerCompany = (CustomerCompany) c; // Cast c to CustomerCompany
                    writer.write(customerCompany.toString());
                }
                //er car IKKE nul dvs. at der er valgt en bil med informationre i toString metoden, som så gennem filewriter append skrives ind i filen
                if (car != null) { // Check if car is not null before using it
                    writer.write("\nChosen Car Information:\n");
                    writer.write(car.toString() + "\n");
                } else {
                    writer.write("\nNo car information available.\n");
                }
                writer.close();
            }

            public static void pickCar(Scanner input, Customer customer) throws IOException {
                ArrayList<Vehicle> carList = new ArrayList<>();

                Family Volkswagen = new Family("Volkswagen", "Touran", "Manuel", 150, "Diesel", "UVW 101", 70000, "2017");
                carList.add(Volkswagen);
                Family Toyota = new Family("Toyota", "Sienna", "Automatic", 269, "Petrol", "LMN 202", 85000, "2016");
                carList.add(Toyota);
                Family Ford = new Family("Ford", "Galaxy", "Manuel", 180, "Diesel", "QRS 303", 60000, "2018");
                carList.add(Ford);

                Luxery Mercedes = new Luxery("Mercedes-Benz", "S-Class", "Automatic", 435, "Petrol", "ABC 123", 50000, "2019");
                carList.add(Mercedes);
                Luxery BMW = new Luxery("BMW", "7 Series", "Automatic", 400, "Petrol", "UNO 678", 20200, "2020");
                carList.add(BMW);
                Luxery Audi = new Luxery("Audi", "A8", "Automatic", 350, "Petrol", "LOW 974", 65000, "2018");
                carList.add(Audi);

                Sport Porsche = new Sport("Porsche", "911 Carrera", "Automatic", 379, "Petrol", "MAX 753", 30000, "2019");
                carList.add(Porsche);
                Sport Chevrolet = new Sport("Chevrolet", "Camaro", "Manual", 450, "Petrol", "HGH 283", 30000, "2020");
                carList.add(Chevrolet);
                Sport FordMus = new Sport("Ford", "Mustang", "Manual", 460, "Petrol", "KJL 293", 23000, "2018");
                carList.add(FordMus);

                System.out.println("Select car category:\nPress 1 for Family Car\nPress 2 for Luxery Car\nPress 3 for Sports Car\nPress 0 to quit.");
                int answer = input.nextInt();
                int choiceOfCar;
                Vehicle selectedCar;

                switch (answer) {
                    case 1:
                        /*vi laver et forloop til at printe vores arraylist som består af 9 pladser
                        I første case vil vi kun printe de tre første biler derfor 0:i<3.
                        For at printe informationen og ikke kun tallene 1-3, kalder vi på vores toString metode
                        fra Vehicle super klassen*/
                        System.out.println("Family Cars:");
                        for (int i = 0; i < 3; i++) {
                            selectedCar = carList.get(i);
                            System.out.println((i + 1) + ": " + selectedCar.toString());
                        }
                        System.out.println("Press 1 for Volkswagen\nPress 2 for Toyota\nPress 3 for Ford");
                        choiceOfCar = input.nextInt();
                        selectedCar = carList.get(choiceOfCar - 1);
                        writeContract(customer, true, selectedCar);
                        carList.get(choiceOfCar - 1);
                        break;

                    case 2:
                        System.out.println("Luxery Cars: ");
                        for (int i = 3; i < 6; i++) {
                            selectedCar = carList.get(i);
                            System.out.println((i + 1) + ": " + selectedCar.toString());
                        }
                        System.out.println("Press 1 for Mercedes\nPress 2 for BMW\nPress 3 for Audi");
                        choiceOfCar = input.nextInt();
                        selectedCar = carList.get(choiceOfCar - 1);
                        writeContract(customer, true, selectedCar);
                        carList.get(choiceOfCar - 1);
                        break;

                    case 3:
                        System.out.println("Sports Cars: ");
                        for (int i = 6; i < 9; i++) {
                            selectedCar = carList.get(i);
                            System.out.println((i + 1) + ": " + selectedCar.toString());
                        }
                        System.out.println("Press 1 for Porsche\nPress 2 for Chevrolet\nPress 3 for Ford Mustang");
                        choiceOfCar = input.nextInt();
                        selectedCar = carList.get(choiceOfCar - 1);
                        writeContract(customer, true, selectedCar);
                        break;

                    case 0:
                        System.out.println("Thank you, Goodbye!");
                        System.exit(0);

                    default:
                        System.out.println("Number is invalid, please choose a number between 0-3.");
                }
            }
        }
