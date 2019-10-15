package assignments;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		//Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit
		
		Scanner sc = new Scanner(System.in);
		
		double Celsius;
		double F; 
		
		System.out.println("Enter the Temperature in Fahrenheit: ");
		Celsius = sc.nextDouble();
		
		Celsius = ((Celsius - 32) * 5)/9;
		
		System.out.println("The Temperature in Celsius is: " + Celsius);
		
		System.out.println("Enter the Temperature in Celsius:  ");
		F = sc.nextDouble();
		
		F = (9.0/5.0)*Celsius + 32;
		
		System.out.println("The Temperature in Fahrenheit is: " + F);
		
	
	}

}
