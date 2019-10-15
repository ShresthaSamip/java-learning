package assignments;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {

		/*
		 * Write a program to create the equivalent of a four-function calculator. The
		 * program to enter two integer’s numbers and an operator. It then carries out
		 * the specified arithmetic operator operations: addition, subtraction,
		 * multiplication or division of the two numbers. Finally, it displays the
		 * result.
		 */

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter two integer numbers");
		double first = reader.nextDouble();
		double second = reader.nextDouble();

		System.out.println("Enter an operator (+, - , *, /: ");
		char operator = reader.next().charAt(0);

		double result;

		switch (operator) {

		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;

		default:
			System.out.println("ERROR! operator is no correct");
			return;
		}

		System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);

	}

}
