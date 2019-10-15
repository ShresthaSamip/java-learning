package assignments;

import java.util.Scanner;

public class Question11 {

//Write a Program to swap two numbers
	//Without Temporary variable
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the value of x:  ");
	double x = sc.nextDouble();
	
	System.out.println("Enter the value of y: ");
	double y = sc.nextDouble();
	
	System.out.println("Before Swapping: x = " + x + ", y = " + y);
	
	x = x + y;//15
	y = x - y; // 5
	x = x - y; // 10
	
	System.out.println("After Swapping: x = " + x +", y = " + y);
	
		
	}
	
	
	
}
