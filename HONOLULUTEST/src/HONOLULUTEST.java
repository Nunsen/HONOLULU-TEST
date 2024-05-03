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
                Customer c = chooseCustomer.customerType(input);
                /*Vi opretter en slags pladsholder/variable som skal opbevare den valgte bil,
                da den ikke indeholder noget lige nu sættes den til null */
                Vehicle selectedCar = null;
                RentingDetails newRenter = RentingDetails.pickTimeOfRent(input);
                chooseCar.pickCar(input, c, newRenter);
            }
        }
