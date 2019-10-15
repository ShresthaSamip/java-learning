package assignments;

public class Question23 {

	//Write a program to sum 1 to nth natural number
	//using for loop
	//The positive integers 1,2,3,4 etc are known as natural numbers.
	
	public static void main(String[] args) {
		
	
	int num = 5, count, total = 0;
	
	for(count = 1; count <= num; count++) {
		total = total + count;
		
	}
	
	System.out.println("Sum of first " + num + " natural number is: "+ total);
	
	}
	
	
}
