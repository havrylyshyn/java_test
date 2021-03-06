package en.stqa.pft.addressbook.model;

/**
 * Created by Bohdan.Havrylyshyn on 09.06.2017.
 */
public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String mobilePhone;
    private final String email;

    public ContactData(String firstName, String lastName, String address, String mobilePhone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobilePhone = mobilePhone;
        this.email = email;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getAddress() {return address;}
    public String getMobilePhone() {return mobilePhone;}
    public String getEmail() {return email;}

}
