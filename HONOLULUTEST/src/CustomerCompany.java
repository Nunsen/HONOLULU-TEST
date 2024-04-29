//en subclass til superclass Customer, da mange af spørgsmålene går igen
public class CustomerCompany extends Customer {

    //fortsætter med at lave dem private
    private static String comName;
    private static String comAddress;
    private static int comPhone;
    private static int comReg;

    //ALLE parametre som customercompany subklassen nu bærer
    public CustomerCompany(String nameDriver, String address, int zip, String city, int phoneNr, String email, int licenseNr, int driverSD, String comName, String comAddress, int comPhone, int comReg) {
        //super keyword, henviser til de fields som subklassen her har arvet
        super(nameDriver, address, zip, city, phoneNr, email, licenseNr, driverSD);

        //setter de nye fields i denne subclass
        this.comName = comName;
        this.comAddress = comAddress;
        this.comPhone = comPhone;
        this.comReg = comReg;

    }
        //getter for de nye fields i denne subclass
        public static String getComName() {
            return comName;
        }
        public static String getComAddress() {
            return comAddress;
        }

        public static int getComPhone() {
            return comPhone;
        }
        public static int getComReg() {
            return comReg;
        }
    }
