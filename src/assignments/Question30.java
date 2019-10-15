package assignments;

import java.util.Scanner;

public class Question30 {

	//Write a program to print the Fibonacci series. 1 1 2 3 5 8...
	
	public static void main(String[] args) {
		
		int n, a = 0, b = 0, c = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of n: ");
		n = sc.nextInt();
		
		System.out.println("Fibonacci Series: ");
		
		for(int i = 1; i <= n; i++) {
			
			a = b;
			b = c;
			c = a + b;
			System.out.println(a+" ");
			
			
			
		}
		
		
	}
	
	
}
