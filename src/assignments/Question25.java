package assignments;

import java.util.Scanner;

public class Question25 {

	/*Write a program that prompts the user to enter the number of students and each student’s
name and score. Finally display the student with highest score.*/
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int highestScore = 0; // hold the highest student score
		String highestScoreName = ""; // holds the student name with the highest score
		
		
		System.out.println("Enter the number of Students in your class: ");
		int num = in.nextInt();
		
		System.out.println("Enter each student's name and score");
		for(int i = 0; i < num; i++) {
			System.out.println( 
					"Student: " + (i + 1) +
					"\n Name: ");
			String name = in.next();
			System.out.println(
					"Score: ");
			int score = in.nextInt();
			
			if (score > highestScore) {
				
				highestScore = score;
				highestScoreName= name;
				
				
			}
						
		}
		
		System.out.println("Student with the highest score: " + highestScoreName);
		
		
		
		
		
		
		
	}
	
}
