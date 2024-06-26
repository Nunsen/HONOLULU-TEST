import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class chooseCar {
    public static void pickCar(Scanner input, Customer customer, RentingDetails newRenter) throws IOException {
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
                contractWriter.writeContract(customer, true, selectedCar, newRenter);
                carList.get(choiceOfCar - 1);
                break;

            case 2:
                System.out.println("Luxery Cars: ");
                for (int i = 3; i < 6; i++) {
                    selectedCar = carList.get(i);
                    System.out.println((i + 1) + ": " + selectedCar.toString());
                }
                System.out.println("Press 4 for Mercedes\nPress 5 for BMW\nPress 6 for Audi");
                choiceOfCar = input.nextInt();
                selectedCar = carList.get(choiceOfCar - 1);
                contractWriter.writeContract(customer, true, selectedCar, newRenter);
                carList.get(choiceOfCar - 1);
                break;

            case 3:
                System.out.println("Sports Cars: ");
                for (int i = 6; i < 9; i++) {
                    selectedCar = carList.get(i);
                    System.out.println((i + 1) + ": " + selectedCar.toString());
                }
                System.out.println("Press 7 for Porsche\nPress 8 for Chevrolet\nPress 9 for Ford Mustang");
                choiceOfCar = input.nextInt();
                selectedCar = carList.get(choiceOfCar - 1);
                contractWriter.writeContract(customer, true, selectedCar, newRenter);
                break;

            case 0:
                System.out.println("Thank you, Goodbye!");
                System.exit(0);

            default:
                System.out.println("Number is invalid, please choose a number between 0-3.");
                pickCar(input, customer, newRenter);
        }
    }
}
