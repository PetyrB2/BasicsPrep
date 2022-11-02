package Basics;

public class Arrays_Prep {

	public static void main(String[] args) {

		System.out.println("========================");
		System.out.println("Title: Arrays & Multiple Arrays");
		System.out.println("Genre: Java Basics");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("========================\n");
		System.out.println("");
		int[] numberArray = { 1, 2, 3, 4, 5 };
		System.out.println("A Single Array.");
		System.out.println("---------------");

		for (int i = 0; i < numberArray.length; i++) {
			System.out.println(i);
		}

		System.out.println("");

		int[][] nums = null;

		int[][] arrayNums = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 2, 4, 6, 8 }, { 1, 3, 5, 7, 9, 11 } };

		int[][] primeNums = new int[2][5];

		primeNums[1][3] = 11;
		System.out.println("");
		System.out.println("Multiple Array Printed Backwards");
		System.out.println("---------------");
		for (int i = arrayNums.length - 1; i >= 0; i--) {
			for (int j = arrayNums[i].length - 1; j >= 0; j--)
				System.out.println(arrayNums[i][j]);

		}

	}
}
