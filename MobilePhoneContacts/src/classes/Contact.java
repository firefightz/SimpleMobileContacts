package classes;


public class Contact {
	private String name;
	private long phoneNumber;
	
	public Contact(String name, long number) {
		this.name = name;
		this.phoneNumber = number;
	}
	
	public long getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	
}
