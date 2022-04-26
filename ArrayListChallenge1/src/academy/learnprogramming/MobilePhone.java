package academy.learnprogramming;

import java.util.*;

public class MobilePhone {
    // This master class must hold the ArrayList of contacts

    private String myNumber;

    // This will generate an ArrayList for the contacts
    private ArrayList<Contacts> myContacts;

    // Constructor
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    // this method will
    // if you add new contacts then this will check with the already existing all contacts
    // if it will find any contacts then it will return false
    /// otherwise it will add to the contacts and return true.

    public boolean addNewContact(Contacts contacts) {
        // findContact is another method to find the contact details within the phone diary.
        // it will check whether the contact exists
        // if it does not exist then it will return false
        if (findContact(contacts.getName()) >= 0) {
            System.out.println("contact is already on file");
            return false;
        }
        // If it is true then it will return true...
        myContacts.add(contacts);
        return true;

    }

    // this method updates the Contact after addition of new contact
    public boolean updateContact(Contacts oldContact, Contacts newContacts) {
        // found the position of the old contact
        int foundPosition = findContact(oldContact);
        // if position is less than 0 then it will return false..
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " , was not found.");
            return false;
        }else if(findContact(newContacts.getName()) != -1){
            System.out.println("Contact with name " +newContacts.getName() +
                    "already exists. Update was not successful.");
            return false;
        }
        // else it will update the position and update the position and return true
        this.myContacts.set(foundPosition, newContacts);
        System.out.println(oldContact.getName() + ", was replaced with " + newContacts.getName());
        return true;
    }

    public boolean removeContact(Contacts contacts){
        // found the position of the old contact
        int foundPosition = findContact(contacts);
        // if position is less than 0 then it will return false..
        if (foundPosition < 0) {
            System.out.println(contacts.getName() + " , was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contacts.getName() + ", was deleted.");
        return true;

    }




    // this method will find contact  and return the contact details
    private int findContact(Contacts contacts) {
        return this.myContacts.indexOf(contacts);
    }

    // this method will return the position of the contact name if exist
    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getName().equals((contactName))) {
                return i;
            }

        }
        return -1;
    }

    public String queryContact(Contacts contacts) {
        if (findContact(contacts) >= 0) {
            return contacts.getName();
        }
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List");
        for(int i=0; i<this.myContacts.size();i++){
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName() + " ->" +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }

}
