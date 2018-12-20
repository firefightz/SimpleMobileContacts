package classes;

import java.util.Scanner;

public class MobileInterface {
	public Scanner scanner = new Scanner(System.in);
	private MobilePhone newPhone;
	
	public MobileInterface() {
		System.out.println("Enter a number: ");
		String number = scanner.nextLine();
		newPhone = new MobilePhone(number);
		userInterface();
	}
	
	private void listChoices() {
		System.out.println("----Press A Choice----");
		System.out.println("0 : List Choices");
		System.out.println("1 : List Contacts");
		System.out.println("2 : Add Contact");
		System.out.println("3 : Remove Contact");
		System.out.println("4 : Search Contact");
		System.out.println("5 : Quit");
	}
	
	private void userInterface() {
		int choice = 0;
		boolean quit = false;
		while (quit == false) {
			listChoices();
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0: 
				listChoices();
				break;
			case 1:
				listContacts();
				break;
			case 2:
				addContact();
				break;
			case 3:
				removeContact();
				break;
			case 4: 
				searchContact();
				break;
			case 5:
				quit = true;
			default:
				listChoices();
			}
		}
	}
	
	private void listContacts() {
		newPhone.listContacts();
		
	}
	
	private void addContact() {
		System.out.println("Enter name of new contact: ");
		String newName = scanner.nextLine();
		System.out.println("Enter new phone number: ");
		long newPhoneNumber = scanner.nextLong();
		newPhone.addContact(newName, newPhoneNumber);
	}
	
	private void removeContact() {
		System.out.println("Name to remove: ");
		String nameToFind = scanner.nextLine();
		if(newPhone.doesExist(nameToFind)) {
			newPhone.removeContact(nameToFind);
		}else {
			System.out.println("Name does not exit....");
		}
	}
	
	private void searchContact() {
		System.out.println("Name to remove: ");
		String nameToFind = scanner.nextLine();
		newPhone.searchNames(nameToFind);
	}
	
	
}
