package assignments;

import java.util.Scanner;

public class Question27 {
/*Write a Program to sum each digit of given number as well as product. //456 =&gt;4*5*6
	and 4+5+6*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, temp;
		int product = 1;
		int sum = 0;
		
		System.out.println("Enter any number: ");
		num = sc.nextInt();
		
		temp = num;
		
	while(temp != 0) {
		
		product = product * (temp % 10);
		sum += temp%10;
		
		
		temp = temp / 10;
		}
		
		System.out.println("\nProduct of all digits in " + num + " : " + product);
		System.out.println("\nSum of all digits in " + num + " : " + sum);
	
	
	}
}
