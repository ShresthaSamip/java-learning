package assignments;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
	
		/*Write a program that converts pounds into kg. The program prompts the user to enter
		number of pounds, converts it to kg and displays the result [1 pound is 0.454 kg].*/
		
		Scanner sc = new Scanner(System.in);
		
		double pound;
		double kg;
		
		System.out.println("Enter number of pounds: ");
		pound = sc.nextDouble();
		
		kg = pound * 0.454;
		
		System.out.println("The total kg is:  " + kg);
		
	}

}
