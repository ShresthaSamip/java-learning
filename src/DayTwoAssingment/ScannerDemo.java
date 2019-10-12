package DayTwoAssingment;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

	int a,b,c;
	double average;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First number: ");
	a=sc.nextInt();
	System.out.println("Enter Second number: ");
	b=sc.nextInt();
	System.out.println("Enter Third number: ");
	c=sc.nextInt();
	
	average = (a+b+c)/3;
	System.out.println("Our average is: " + average);
	
	
	
		
	}
}
		
	
	

