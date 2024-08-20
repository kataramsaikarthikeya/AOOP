package lab7;


public class Main {
	public static void main(String[] args) {
        // Using Set
        ContactManager contactManager = new ContactManager();
        contactManager.addContact(new Contact("karthik", "12345"));
        contactManager.addContact(new Contact("vinay", "67890"));
        contactManager.addContact(new Contact("kavya", "12345")); // Duplicate contact

        System.out.println("All Contacts (Set): " + contactManager.getAllContacts());

        // Using Map
        ContactManagerWithMap contactManagerWithMap = new ContactManagerWithMap();
        contactManagerWithMap.addContact(new Contact("karthik", "12345"));
        contactManagerWithMap.addContact(new Contact("vinay", "67890"));

        System.out.println("Find Contact by Name (karthik): " + contactManagerWithMap.findContactByName("karthik"));
        System.out.println("Find Contact by Phone Number (67890): " + contactManagerWithMap.findContactByPhoneNumber("67890"));
    }
}

