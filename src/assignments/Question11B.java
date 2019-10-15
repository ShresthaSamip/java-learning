package assignments;

public class Question11B {

	//Swap two numbers using temporary variable
	
	public static void main(String[] args) {
		
	float first = 1.20f, second = 2.45f;
	
	System.out.println("Before Swapping: First = " + first+ ", Second = " + second);
	
	//value of first is assigned to temporary
	float temporary = first;
	
	//value of second is assigned to first
	first = second;
	
	//value of temporary (Which contain the initial value of first) is assigned to second.
	second = temporary;
	
	System.out.println("After Swapping: Frist =  " + first +", Second = " + second);
		
		
		
		
	}
	
	
	
}
