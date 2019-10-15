package assignments;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {

		/*Write a Program to accept three sides of triangle and display which kind of
		  triangle is formed.*/
		
		Scanner in = new Scanner(System.in);

		int a,b,c;
		
		System.out.println("Enter side one: ");
		a = in.nextInt();
		
		System.out.println("Enter side two: ");
		b = in.nextInt();
		
		System.out.println("Enter side Three: ");
		c = in.nextInt();

		if (a == b & b == c)
			System.out.println("Equilateral Triangle");
		
		else if (a >= (b + c) || c >= (b + a) || b >= (a + c))
			System.out.println("This is not a triangle");
		
		
		else if ((a == b && b != c) || (a!=b && c==a) || (c==b && c!=a))
			System.out.println("Isosceles Triangle");
		
		
		else if( a!=b && b!=c && c!=a)
			System.out.println("Scalene Triangle");
		
	
		
	}

}
