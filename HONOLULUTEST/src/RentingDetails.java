import javax.swing.*;

public class RentingDetails {
    private String startDate;
    private String endDate;

    public RentingDetails (String startDate, String endDate) {
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
}
