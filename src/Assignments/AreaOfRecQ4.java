package Assignments;

import java.util.Scanner;

public class AreaOfRecQ4 {

	public static void main(String[] args) {
		
	// area = length * Width
	// Per = 2 * ( l + W)
		
	Scanner sc = new Scanner(System.in);
	
	double length = 0;
	double width = 0;
	double area = 0;
	double per=0;
	
	System.out.println("Enter the length of the Rectangle:  ");
	length = sc.nextDouble();
	
	System.out.println("Enter the width of the Rectangle:  ");
	width = sc.nextDouble();
	
	area = length * width;
	per = 2 * (length + width);
	
	System.out.println("The Area of Rectangle is: " + area);
	System.out.println("The perimeter of Rectangle is: " + per);
	
	
		
		
	}
	
	
}
