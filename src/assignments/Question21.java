package assignments;

import java.util.Scanner;

public class Question21 {

	/*Program to input the number of (1...7) and translate to its equivalent name of the day of
	the week.*/
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number between 1 to 7");
	int num = sc.nextInt();
	
	if (num == 1)
		System.out.println("Monday");
	if (num == 2)
		System.out.println("Tuesday");
	if (num == 3)
		System.out.println("Wednesday");
	if (num == 4)
		System.out.println("Thursday");	
	if (num == 5)
		System.out.println("Friday");
	if (num == 6)
		System.out.println("Saturday");
	if (num == 7)
		System.out.println("Sunday");
	else
		System.out.println("Invalid Date Range");
	}
	
}
