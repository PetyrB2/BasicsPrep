package Basics;

public class Exponents {

	// An example of how to get a number to the Power of n
	
	public static void main(String[] args) {
		System.out.println("========================");
		System.out.println("Title: Exponent Examples");
		System.out.println("Genre: Java Basics");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("========================\n");
		
		// A Better Option for ints at least
				Scanner sc = new Scanner(System.in);
		System.out.println("Select a number then another as the exponent");
		System.out.println("\nThis program will multiply the first number " + "\nby itself the second number of times.");
		System.out.println("");
		System.out.println("Pick a number: ");
		int x = sc.nextInt();
		System.out.println("Pick the Exponent: ");
		int y = sc.nextInt();
		System.out.println(x + " multiplied by itself " + y + " times " + "is \n\t" + (Math.pow(x, y)));
		System.out.println("\n-------------------------------------------");
		System.out.println("");
		
		System.out.println("5 to the power of 2: ");
		System.out.println("\t= " + Math.pow(5, 2)); // (5 * 5) - Should be 25.0
		System.out.println("");
		System.out.println("3 to the power of 3: ");
		System.out.println("\t= " + Math.pow(3, 3)); // (3 * 3 * 3) - Should be 27.0
		System.out.println("");
		System.out.println("As an int: ");
		System.out.println("\t= " + (int)Math.pow(3, 3)); // (3 * 3 * 3) - Should be 27
		System.out.println("");
		System.out.println("5.5 to the power of 6.87 as a Double: ");
		System.out.println("\t= " + (double)Math.pow(5.5, 6.87)); 
		System.out.println("");
		System.out.println("A different way of doing it. "
				+ "\nCode = int exponent = (int)Math.pow(5, 5); " 
				+ "\n5 to the power of 5: ");
		int exponent = (int)Math.pow(5, 5);
		System.out.println("\t= " + exponent);
		System.out.println("");
		System.out.println("A different way of doing it (as a Double)."
				+ "\nCode = double exponent = (double)Math.pow(2.2, 5.1);"
				+ "\n2.2 to the power of 5.1");
		double exponentDouble = (double)Math.pow(2.2, 5.1);
		System.out.println("\t= " + exponentDouble);
		System.out.println("\n-------------------------------------------");
		
		
	
	}

}
