package assignments;

import java.util.Scanner;

public class SimpleInterestQ4 {

	public static void main(String[] args) {
		
		//Si = Simple interest
		//P = Principle amount
		//N = number of years
		//R = Rate of Interest
	
	Scanner sc = new Scanner(System.in);
	
	double SI;
	int P = 0;
	double R = 0;
	double N = 0;
	
	System.out.println("Enter the Principle amount: ");
	P = sc.nextInt();

	System.out.println("Enter number of years: ");
	N = sc.nextDouble();
	
	System.out.println("Enter rate of interest: ");
	R = sc.nextDouble();
	
	SI = (P*R*N)/100;
	
	System.out.println("The Calculated Simple interest is: " + SI);
	
		

	}

}



	


