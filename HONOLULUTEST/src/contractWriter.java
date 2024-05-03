import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class contractWriter {
    public static void writeContract(Customer c, boolean customerIsCompany, Vehicle car, RentingDetails newRenter) throws IOException {
        //anvender localdate til at sætte ind i kontrakten, så man ikke manuelt skal skrive datoen ind.
        LocalDate currentDate = LocalDate.now();

        /*Vi vil have systemet til at oprette en fil der hedder Contract + nameDriver + licenseNr på den måde sikrer vi
        at der bliver oprettet en ny fil for hver kunde, da det vil være et nyt unikt navn for hver gang
        Vi henter informationen fra vores Customer class.*/
        String fileName = "Contract_" + c.getNameDriver() + "_" + c.getLicenseNr() + ".txt";

        //Filen oprettes, der tilføjes append:true da der senere skal tilføjes biltype til samme fil
        FileWriter writer = new FileWriter(fileName, true);

        //følgende informationer om kunden skrives ind i filen
        writer.write("X****************************************************************X\n");
        writer.write("\t\tContract\n");
        writer.write("X****************************************************************X\n");
        writer.write("This is a new contract created on " + currentDate + "\nSecured and dealt by Honolulu Car Rental APS" + "\n\n");

        //Anvender vores toString metode for at printe kundeinformationerne ud i filen (Se customerklasse)
        writer.write("Customer information:\n");
        writer.write(c.toString());

        if (customerIsCompany && c instanceof CustomerCompany) {
            CustomerCompany customerCompany = (CustomerCompany) c; // Cast c to CustomerCompany
            writer.write(customerCompany.toString());
        }

        /* if (customerIsCompany) {
            writer.write("Customer information:\n");
            writer.write(c.toString());
        } else if (!customerIsCompany && c instanceof CustomerCompany) {
            CustomerCompany customerCompany = (CustomerCompany) c; // Cast c to CustomerCompany
            writer.write("\n\nCompany Information:\n\n");
            writer.write(customerCompany.toString());
        }
        */

        /*er car IKKE nul dvs. der ER valgt en bil. Så printes iformationerne i toString metoden,
        som så gennem filewriter append skrives ind i filen*/
                if (car != null) { // Check if car is not null before using it
                    writer.write("\nChosen Car Information:\n");
                    writer.write(car.toString() + "\n");
                } else {
                    writer.write("\nNo car information available.\n");
                }
                /* Sidste del af vores filewriter er udlejeinformation, vi printer informationer
                via toString metode i RentingDetails klasse, bevidst valg så man senere kan tilføje mere*/
                writer.write("\nDuration of Rent:");
                writer.write(newRenter.toString());

                writer.close();
            }
        }

