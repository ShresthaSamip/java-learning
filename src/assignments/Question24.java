package assignments;

import java.util.Scanner;

public class Question24 {

	//Write a program to print the factorial number of given numbers.
	
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	int i, fact=1;
	
	System.out.println("Enter the factorail number to calculate: ");
	int num = in.nextInt();
	
	for(i=1; i <= num; i++) {
		
		fact = fact*i;
		
	}
	
		System.out.println("Factorial of "+num+" is: "+fact);
	
		
		
		
	}
	
}
