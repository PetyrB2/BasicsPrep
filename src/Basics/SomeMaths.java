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
		
		System.out.println("========================");
		System.out.println("Title: Find the Factorial of n");
		System.out.println("Genre: Java Basics");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("========================\n");
		System.out.println("");
		
//		int data [] = {1,2,4,5};
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int num = scanner.nextInt();

		System.out.println("\tThe Factorial of " + num + " is \n\t --> " + factorial(num) + " <-- ");
	}
}