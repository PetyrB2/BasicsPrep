package Basics;

import java.util.Scanner;

public class SomeMaths {
	
	
	 // Method to find factorial of given number
	 static int factorial(int n)
	 {
	  int res = 1, i;
	  for (i=2; i<=n; i++)
	   res *= i;
	  return res;
	 }
	  
	 // Driver method
	 public static void main(String[] args)
	 {
		 Scanner scanner  = new Scanner(System.in);
		 
		 System.out.println("Please Enter a Number: ");
		 int num = scanner.nextInt();
	
		System.out.println("The Factorial of --> "+ num + " <--  = " + factorial(num));
	 }
	}