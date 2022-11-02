package Basics;

public class StringManipulation {

	public static void main(String[] args) {
		System.out.println("========================");
		System.out.println("Title: String Manipulation");
		System.out.println("Genre: Java Basics");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("========================\n");
		System.out.println("");

		// String literal

		String string1 = "Hello";
		String string2 = "Hello";
		// Compare the Literal Strings
		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));
		System.out.println("");
		// String Obj
		String stringObj1 = new String("World");
		String stringObj2 = new String("World");
		// Compare the Object Strings
		System.out.println("Are stringObj1 and stringObj2 the same?");
		System.out.println(stringObj1 == stringObj2);
		System.out.println("");
		// Compare them again using .equals
		System.out.println("Are stringObj1 and stringObj2 the same using .EQUALS ?");
		System.out.println(stringObj1.equals(stringObj2));
		System.out.println("");

		// Array to a String
		System.out.println("A random char Array");
		char[] randomArray = { 'h', 'g', '3', '4' };
		String randomString = new String(randomArray);
		System.out.println(randomString);
		System.out.println("");
		System.out.println("Adding an integer to a String");
		String bob = "bob" + 2;
		System.out.println(bob);
	}

}
