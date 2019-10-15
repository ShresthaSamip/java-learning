package assignments;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		
	// Write a program to relate two integers entered by user using = =or > or < sign.
		
		Scanner sc = new Scanner(System.in);
		
		int x , y;
		
		System.out.println("Input first integer: ");
		x = sc.nextInt();
		
		System.out.println("Input second integer: ");
		y = sc.nextInt();
		
		if (x == y)
			System.out.printf( "%d == %d\n", x , y);
		if (x < y)
			System.out.printf( "%d < %d\n", x , y);
		if (x > y)
			System.out.printf( "%d > %d\n", x , y);	
		if (x <= y)
			System.out.printf( "%d <= %d\n", x , y);
		if (x >= y)
			System.out.printf( "%d >= %d\n", x , y);
		if (x != y)
		System.out.printf( "%d != %d\n", x , y);
	
	}
	
}
