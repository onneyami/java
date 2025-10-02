public class Author {

    // Fields of the Author class
    private String surname;
    private String name;
    private String secondName;
    private String passportData;
    private String address;
    private String phoneNumber;

    // Constructor with values for the Author class
    public Author(String surname, String name, String secondName, String passportData, String address, String phoneNumber) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.passportData = passportData;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        String str = surname + " " + name + " " + secondName + ", " + "passport data: " + passportData + ", " + "\naddress: " + address + ", telephon: " + phoneNumber;
        return str;
    }

    // Method that returns the surname and initials of the author
    String getShortName(String surname, String name, String secondName) {
        String str = surname + " " + name.substring(0, 1) + "." + secondName.substring(0, 1) + ".";
        return str;
    }

    // Overloaded method that returns the surname and initials of the author
    String getShortName(String surname, String name) {
        String str = surname + " " + name.substring(0, 1) + ".";
        return str;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }

    public String getPassportData() {
        return passportData;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
