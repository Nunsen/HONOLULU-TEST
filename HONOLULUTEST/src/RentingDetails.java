import javax.swing.*;
import java.util.Scanner;

public class RentingDetails {
    private String startDate;
    private String endDate;

    public RentingDetails(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String toString() {
        return ("\nStart of rent: " + startDate + "\nEnd of rent: " + endDate + "\n");
    }

    public static RentingDetails pickTimeOfRent(Scanner input) {
        System.out.println("Enter Start Date of Rent: ");
        String startDate = input.next();

        System.out.println("Enter End Date of Rent: ");
        String endDate = input.next();

        return new RentingDetails(startDate, endDate);
    }
}