package assignments;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Rows do you want in this Pattern?");
		int rows = sc.nextInt();
		
		System.out.println("Here is your Patern!!");
		
		for (int i = 1; i <= rows; i++) 
		{
			for (int j = 1; j<=i; j++) 
			{
				System.out.print(j+" ");	
			}
			
			System.out.println();
		}
		//close the resources
		
		sc.close();
		
	}
}
