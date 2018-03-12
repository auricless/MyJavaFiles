package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {

		//Ask how many users to add
		System.out.print("HOW MANY STUDENT ARE ENROLLING: ");
		Scanner in = new Scanner(System.in);
		int studentCount = in.nextInt();
		
		//Create n number of new students
		Student[] students = new Student[studentCount];
		for(int i = 0; i < studentCount; i++){
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			students[i].showStudentStat();
		}
	}

}
