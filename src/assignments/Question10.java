package assignments;

import java.text.DecimalFormat;

public class Question10 {

	public static void main(String[] args) {
		// Write a Program for the following Mathemaical Function
		
	double u = 2;
	double t = 2;
	double a = 2;
	double b = 2;
	double c = 2;
	
	double s = (u * t) + (0.5*a*t*t);
	double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	double x = (-b + Math.sqrt(b * b)-(-4*a*c))/(2*a);
	
	DecimalFormat df = new DecimalFormat("###.##");
	
	System.out.println("The value of S is : " + s);
	System.out.println("The value of the area is : " + df.format(area));		
	System.out.println("The value of x is : " + x);
	System.out.println("I have changed the code");
	
	}

}
