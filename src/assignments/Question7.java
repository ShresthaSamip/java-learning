package assignments;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		//Write a program that read the radius and length of a cylinder and computes volume.
		
		Scanner sc = new Scanner(System.in);
		
		double volume;
		double radius = 0;
		double height = 0;
		
		System.out.println("Enter the Radius of the Cylinder: ");
		radius = sc.nextDouble();
		
		System.out.println("Enter the height of the Cylinder: ");
		height = sc.nextDouble();
		
		volume = Math.PI * radius * radius * height;
		
		System.out.println("The volume of the Cylinder is: "+ volume);
		
		
	}

}
