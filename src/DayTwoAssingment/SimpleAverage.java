package DayTwoAssingment;

import java.util.Scanner;

public class SimpleAverage {

	public static void main(String[] args) {
		
		int x,y,z;
		double average;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for average");
		x = sc.nextInt();
		System.out.println("Enter another integer");
		y = sc.nextInt();
		System.out.println("Enter another integer");
		z = sc.nextInt();
		
		average = (x+y+z) / 3;
		System.out.println("Our Average is " + average);

	}

}
