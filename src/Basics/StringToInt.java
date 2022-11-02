package Basics;

public class StringToInt {

	public static void main(String[] args) {
		// Title
		System.out.println("========================");
		System.out.println("Title: String To Int");
		System.out.println("Genre: Java Basics");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("========================\n");
		
		// Initiate String and print it out
		String string = "45";
		System.out.println("Our Initial String is " + string);
		System.out.println("\nIf we try to add 55 to " + string +  " we get:");
		System.out.println("\n\t" + string + 55);
		System.out.println("");
		
		System.out.println("For us to get the mathematical result we wish \n"
				+ "we parse it as an int like so: "
				+ "\n\t(Integer.parseInt(string) + 45) ");
		System.out.println("");
		System.out.println("Result: " + (Integer.parseInt(string) + 55));
		System.out.println("");
		System.out.println("------------------------------------------");
	}

}
