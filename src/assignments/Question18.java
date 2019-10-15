package assignments;

import java.util.Scanner;

public class Question18 {

	//Write a program to display the largest number from given three values.
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int x,y,z;
		System.out.println("Enter three integers");
		
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		if(x > y && x > z)
			System.out.println(x + " is the Largest number");
		else if (y > x && y > z)
			System.out.println(y + " is the Largest number");
		else if(z > y && z > x)
			System.out.println(z + " is the Largest number");
		else 
			System.out.println("The numbers are invalid");
	
	}
	
}
