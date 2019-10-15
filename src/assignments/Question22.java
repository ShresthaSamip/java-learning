package assignments;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		
		//Write a program to print the table of given number
		Scanner in = new Scanner(System.in);
		
		int num, i, tab;
		
		System.out.println("Enter a number : ");
		num = in.nextInt();
		
		System.out.println("Table of " + num + " is");
		for(i=1; i<=10; i++)
		{
			
			tab = num * i;
			System.out.println(num + " * " + i + " = " + tab );
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
}
