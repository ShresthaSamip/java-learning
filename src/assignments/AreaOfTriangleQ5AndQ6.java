package assignments;

import java.util.Scanner;

public class AreaOfTriangleQ5AndQ6 {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		
		double area = 0;
		double pre = 0;
		double base = 0;
		double height =0;
		double hypotenuse =0; 
		
		
		System.out.println("Enter the base of the Triangle: ");
		base = Sc.nextDouble();
		
		System.out.println("Enter the height of the Triangle: ");
		height = Sc.nextDouble();
		
		area = (base * height)/2;
		hypotenuse = Math.pow(Math.pow(base, 2) + Math.pow(height, 2), 0.5);
		pre = base + height + hypotenuse;
	
		
		
		
		System.out.println("The area of the Triangle is:  " + area);
		System.out.println("The Perimeter of the Triangle is:  " + pre);
	}

}
