package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String studentId;
	private int idLength = 5;
	private static int id = 1000;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private static String courses = "";
	private int tuitionBalance;
	private static int costOfCourse = 600;
	
	//Constructor: prompts user to enter student's name and year
	public Student(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - For Freshmen\n2 - For Sohpomore\n3 - For Junior\n"
				+ "4 - For Senior\n Enter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentId();
	}
	
	//Generate an ID
	private void setStudentId(){	
		id++;
		studentId = gradeYear + "-" + id;
	}
	
	//Enroll in courses
	public void enroll(){
		//get inside of a loop user hits Q
		do{
			System.out.print("Enter course to enroll(Q to quit): ");
			Scanner in = new Scanner(System.in);
			
			String course = in.nextLine();
			if(!course.equals("Q")){
				courses += "\n   " + course;
				tuitionBalance += costOfCourse;
			}else{
				break;
			}
		}while(1 != 0);
	}
	
	//View Balance
	public void viewBalance(){
		System.out.println("CURRENT BALANCE: $" + tuitionBalance); 
	}
	
	//Pay tuition
	public void payTuition(){
		viewBalance();
		System.out.print("HOW MUCH DO YOU WANT TO PAY: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance -= payment;
		System.out.println("THANK YOU FOR PAYING $" + payment);
		viewBalance();
	}
	
	//Show student status
	public void showStudentStat(){
		System.out.println("Name: " + firstName + " " + lastName + "\n" + "Class level: " + gradeYear
				+ "\n" + "StudentId: " + studentId);
		System.out.println("COURSES ENROLLED IN: " + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
	}
	
	
	
}
