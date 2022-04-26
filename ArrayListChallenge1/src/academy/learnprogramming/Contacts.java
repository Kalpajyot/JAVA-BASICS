package academy.learnprogramming;

//Here we are creating a class named Contacts
public class Contacts {
    // create some fields or parameters
    private String name;
    private String phoneNumber;

    // Constructor for the parameter
    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;    }

    // this is get method. It will return the value in the mentioned data type
    // get method for Name
    public String getName() {
        return name;
    }

    // This is get method for phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // this is another method to create Contacts with the parameters name and phoneNumber
    public static Contacts createContact(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber);
    }
}
