package DayTwoAssingment;

import java.util.Scanner;

public class AssignmentTwo {

	public static void main(String[] args) {
		
		int a,b,sum;
		float avg;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First number : ");
		a=sc.nextInt();
		
		System.out.println("Enter Second number :");
		b=sc.nextInt();
		
		sum = a+b;
		avg = (float)((a+b)/2);
		
		System.out.println("Sum : " +sum +"\nAverage : " +avg);
	
		
	}
}
