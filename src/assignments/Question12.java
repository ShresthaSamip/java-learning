package assignments;

import java.util.Scanner;

public class Question12 {

	public static void main(String [] args) {
		
		/*Write a program to accept the roll, name, and nationality of the person and display
		those values in good format way.*/
		
		// *Why can't i type my first and last name in one single String?????*
		
		Scanner sc = new Scanner(System.in);
		
		String first , last , name, nationality;
		int roll;
		
		System.out.println("Enter your roll #: ");
		roll = sc.nextInt();
		
		System.out.println("Enter your First name: ");
		first = sc.next();
		
		
		System.out.println("Enter you Last name: ");
		last = sc.next();
		
		name = first + " " + last;
		
		System.out.println("Enter your nationality: ");
		nationality = sc.next();
		
		System.out.println("Roll Number: " + roll);
		System.out.println("Name: "+ name);
		System.out.println("Nationality: " + nationality);
		
		
	}
	
	
}
