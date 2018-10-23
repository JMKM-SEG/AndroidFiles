package engineering.jmkm.seg2505.projet_jmkm;

public class UserAccount {

    private String firstName;
    private String lastName;
    private String eMail;
    private String phoneNumber;
    private String userName;
    private String nameOfCity;
    private String nameOfCountry;

    public UserAccount(String firstName,String lastName, String eMail,String phoneNumber, String userName, String nameOfCountry, String nameOfCity){
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.nameOfCity = nameOfCity;
        this.nameOfCountry =  nameOfCountry;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String geteMail() {
        return eMail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }
}
