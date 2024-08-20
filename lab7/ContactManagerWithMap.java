package lab7;
import java.util.HashMap;
import java.util.Map;

public class ContactManagerWithMap {
	 private Map<String, Contact> contactsByName;
	    private Map<String, Contact> contactsByPhoneNumber;

	    public ContactManagerWithMap() {
	        contactsByName = new HashMap<>();
	        contactsByPhoneNumber = new HashMap<>();
	    }

	    public void addContact(Contact contact) {
	        contactsByName.put(contact.getName(), contact);
	        contactsByPhoneNumber.put(contact.getPhoneNumber(), contact);
	    }

	    public void removeContactByName(String name) {
	        Contact contact = contactsByName.remove(name);
	        if (contact != null) {
	            contactsByPhoneNumber.remove(contact.getPhoneNumber());
	        }
	    }

	    public Contact findContactByName(String name) {
	        return contactsByName.get(name);
	    }

	    public Contact findContactByPhoneNumber(String phoneNumber) {
	        return contactsByPhoneNumber.get(phoneNumber);
	    }

	    public Map<String, Contact> getAllContactsByName() {
	        return contactsByName;
	    }

	    public Map<String, Contact> getAllContactsByPhoneNumber() {
	        return contactsByPhoneNumber;
	    }

}
