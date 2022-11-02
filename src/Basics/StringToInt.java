package Basics;

public class StringToInt {

	public static void main(String[] args) {
		// Title
		System.out.println("=====================================");
		System.out.println("Title: String To Int - Int to String");
		System.out.println("Genre: Java Basics");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("=====================================\n");

		// Initiate String and print it out
		String string = "45";
		System.out.println("-----------------");
		System.out.println("String to Integer");
		System.out.println("-----------------");
		System.out.println("");
		System.out.println("Our Initial String is \n\t" + string);
		System.out.println("\nIf we try to add 55 to " + string + " we get:");
		System.out.println("\n\t" + string + 55);
		System.out.println("");

		System.out.println("For us to get the mathematical result we wish \n" + "we parse it as an int like so: \n"
				+ "\n\t(Integer.parseInt(string) + 45) ");
		System.out.println("");
		System.out.println("Result: " + (Integer.parseInt(string) + 55));
		System.out.println("");
		System.out.println("----------------------");
		System.out.println("Integer back to String");
		System.out.println("----------------------");
		System.out.println("");
		int n = 77;
		System.out.println("Integer n = " + n);
		System.out.println("");
		System.out.println("Adding 20 to " + n + " = " + (n + 20));
		System.out.println("");
		System.out.println("If we turn it back into a String using: ");
		System.out.println("\n\t(Integer.toString(n) + 99)");
		System.out.println("\nResult: " + Integer.toString(n) + 99);
		System.out.println("");
		System.out.println("");
		System.out.println("-------");
		System.out.println("Example");
		System.out.println("-------");
		String str = "Age: 35";
		System.out.println("Initial String: \n\t" + str);

		String str2 = str.replaceAll("[0-9]", "");
		String str1 = str.replaceAll("\\D+", "");

		System.out.println("");
		System.out.println("Just digits from String str: \n\t" + str1);

		int z = Integer.parseInt(str1);
		System.out.println("");
		System.out.println("New Integer z + 2: \n\t" + (z + 2));
		System.out.println("");
		int newInt = (z + 2);
		String newStr = (Integer.toString(newInt));
		System.out.println("New String: \n\t" + str2 + newStr);
		System.out.println("");
		System.out.println("-----------------EOF----------------------");
	}

}
