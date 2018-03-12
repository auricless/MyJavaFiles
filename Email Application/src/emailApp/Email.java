package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private int defaultPasswordLength = 10;
	private String department;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
	//Constructor to receive the first name and last name
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department . return the department
		this.department = setDepartment();
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		
		//Combine elements to generate email
		email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "." + companySuffix;
		
		showInfo();
	}
	
	//Ask for the department
	private String setDepartment(){
		System.out.println("New worker " + firstName + " DEPARTMENT CODES:\n1 For Sales\n2 For Development\n3 For Accounting\n0 For None\nEnter Department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		switch(depChoice){
			case 1:
				return "sales";
			case 2:
				return "dev";
			case 3:
				return "acct";
			default:
				return "";
		}
	}
	
	//Generate a random password
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		char[] password = new char[length];
		
		for(int i = 0; i < length; i++){
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	
	//Set the mailbox capacity
	public void setEmailCapacity(int capacity){
		this.mailBoxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String alternate){
		this.alternateEmail = alternate;
	}
	
	//Change the password
	public void changePassword(String password){
		this.password = password;
	}
	
	public int getMailboxCapacity(){
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail(){
		return alternateEmail;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void showInfo(){
		System.out.println("DISPLAY NAME: " + firstName + " " + lastName +
							"\nCOMPANY EMAIL: " + email +
							"\nMAILBOX CAPACITY: " + mailBoxCapacity
				);
		
	}
	
}
