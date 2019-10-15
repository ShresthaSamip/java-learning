package assignments;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
	
		/*Write a program that receives an ASCII code (between 0 – 128) and display its character
		[example: 97 (input) -->a(output)]*/
		
		Scanner input = new Scanner(System.in);
		
		//Prompting user to enter an ASCII code 
		//(input integer between 0 to 127)
		
		
		System.out.println("Enter an ASCII code: ");
		int i = input.nextInt();
		
		System.out.println((char)i);
		
		

	}

}
