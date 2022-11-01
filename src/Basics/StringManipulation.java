package Basics;

public class StringManipulation {

	public static void main(String[] args) {
		// String literal

		String string1 = "Hello";
		String string2 = "Hello";
		// Compare the Literal Strings
		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));

		// String Obj
		String stringObj1 = new String("World");
		String stringObj2 = new String("World");
		// Compare the Object Strings
		System.out.println("Are stringObj1 and stringObj2 the same?");
		System.out.println(stringObj1 == stringObj2);

		// Compare them again using .equals
		System.out.println("Are stringObj1 and stringObj2 the same using .EQUALS ?");
		System.out.println(stringObj1.equals(stringObj2));
		
		
		// Array to a String
		char[] randomArray = {'h', 'g', '3', '4'};
		String randomString = new String(randomArray);
		System.out.println(randomString);
	
		String bob = "bob" + 2 ;
		System.out.println(bob);
	}

}
