package assignments;

import java.util.Scanner;

public class Question13 {

	/*Write a program to print the number entered by user only if the number entered is
	negative*/
	public static void main(String[] args) {
		
		double number; 	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number = sc.nextDouble();
		
		if (number < 0)
		
		{
			System.out.println("The number is :" + number );

		}
		
		else 
			
			System.out.println(number + " is a positve number, please enter a negative number!");
		
		
		
		
		
		
		
		
	}
	
	
	
}
