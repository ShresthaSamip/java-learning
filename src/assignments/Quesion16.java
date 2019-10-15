package assignments;

import java.util.Scanner;

public class Quesion16 {

	public static void main(String[] args) {
		
		//Write a program to find the given number is even or odd.
		
	Scanner reader = new Scanner(System.in);
	
	System.out.println("Enter a number: ");
	int num = reader.nextInt();
	
	if(num % 2 == 0)
		System.out.println(num + " is even");
	
	else
		System.out.println(num + " is odd");
		
	}
	
	
}
