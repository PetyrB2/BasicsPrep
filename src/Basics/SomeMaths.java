package Basics;

import java.util.Scanner;

public class SomeMaths {

	// Method to find factorial of given number
	static int factorial(int n) {
		int res = 1, i;
		for (i = 2; i <= n; i++)
			res *= i;
		return res;
	}

	// Driver method
	public static void main(String[] args) {
		
//		int data [] = {1,2,4,5};
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int num = scanner.nextInt();

		System.out.println("\tThe Factorial of " + num + " is \n\t --> " + factorial(num) + " <-- ");
	}
}