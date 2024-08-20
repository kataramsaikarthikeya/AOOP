package lab7;
import java.util.HashSet;
import java.util.Set;

public class ContactManager {
	 private Set<Contact> contacts;

	    public ContactManager() {
	        contacts = new HashSet<>();
	    }

	    public boolean addContact(Contact contact) {
	        return contacts.add(contact);
	    }

	    public boolean removeContact(Contact contact) {
	        return contacts.remove(contact);
	    }

	    public Set<Contact> getAllContacts() {
	        return contacts;
	    }

	    public Contact findContactByName(String name) {
	        for (Contact contact : contacts) {
	            if (contact.getName().equalsIgnoreCase(name)) {
	                return contact;
	            }
	        }
	        return null;
	    }

}
