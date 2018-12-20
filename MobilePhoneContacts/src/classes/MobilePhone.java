package classes;

import java.util.ArrayList;

public class MobilePhone {
	private String number;
	private ArrayList<Contact> contacts;
	
	public MobilePhone(String number) {
		this.number = number;
		contacts = new ArrayList<Contact>();
	}
	
	
	public boolean doesExist(String nameToFind) {
		boolean exits = false;
		for(int i = 0;i < contacts.size();i++) {
			if (contacts.get(i).getName().equals(nameToFind)) {
				exits = true;
			}
		}
		return exits;
	}
	
	public void listContacts() {
		for(int i = 0;i < contacts.size();i++) {
			if (contacts.size()-1 == i) {
				System.out.print(contacts.get(i).getName() + " " +
						contacts.get(i).getPhoneNumber() + "\n");
			}else {
				System.out.println(contacts.get(i).getName() + " " +
						contacts.get(i).getPhoneNumber() + ", ");
			}
							
		}
	}
	
	public void addContact(String name, long phone) {
		if (doesExist(name)) {
			System.out.println("name already exists...");
		}else {
			Contact newContact = new Contact(name, phone);
			contacts.add(newContact);
			System.out.println(newContact + " has been added....");
		}
		
	}

	public void removeContact(String nameToRemove) {
		if (contacts.isEmpty()) {System.out.println("List is empty...");}
		if(doesExist(nameToRemove)) {
			for(int i = 0;i < contacts.size();i++) {
				if(contacts.get(i).getName().equals(nameToRemove)) {
					contacts.remove(i);
				}
			}
		}
		

	}
	
	public void searchNames(String contactName) {
		if(doesExist(contactName)) {
			for(int i = 0;i < contacts.size();i++) {
				if (contacts.get(i).getName().equals(contactName)) {
					System.out.println(contactName + " found at index " + i);
				}
			}
		}else {
			System.out.println("Name not found...");
		}
		
	}
	
	
	
}
