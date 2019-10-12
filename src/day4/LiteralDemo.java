package day4;

//Literal: a Source code representation of fixed value
//Literal ==> Fixed Value + data type
//45 Hello 34.55 null are examples of literals

public class LiteralDemo {

	public static void main(String[] args) {
		//1. Integer Literal 656 6763 67889 5685686 
		byte b = 127;
		short s = 127;
		int i = 127;
		long l = 127;
		long l1 = 2147483647;
		long l2 = 2147483648l; 
		
		//2. Floating Literal 45.454 33.67 676.45 (Double)
		
		double d = 45.67;
		float f = 45.67f; 
		
		//3. Boolean Literal true false
		
		boolean b1 = true;
		boolean b2 = false; 
		
		//4. Character Literal 
		char c1 = '?';
		char c2 = '2';
		char c3 = '%';
		char c4 = '\u0004';
		char c5 = '\u0915';
		
		System.out.println(c1);
		
		//5. String Literal fdgfd abc@44
		
		String s1 = "Hello";
		String s2 = "abc@123$pp";
		String s3 = "a";
		String s4 = "";
		String s5 = " ";
		String s6 = "123";
		String s7 = "34.56";
		String s8 = " I live in USA";
		
		//6. Null Literal null
		String s9 = null;
		
		LiteralDemo ob = new LiteralDemo();// this is an object
		
		// ASCII 0-255
		//Unicode 0 -65535
	}
}
