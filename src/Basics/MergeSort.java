package Basics;

import java.util.Random;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {

		System.out.println("========================");
		System.out.println("Title: Merge & Sort an Array");
		System.out.println("Genre: Java Intermediate");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("========================\n");
		System.out.println("");
		
		// Begin code
		Scanner sc = new Scanner(System.in);
		System.out.println("How Big do you want the Array? \n\t");

		int arraySize = sc.nextInt();
		
		Random rand = new Random();
		int[] numbers = new int[arraySize];

		// For Loop 
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(10000000);
		}
		
		System.out.println("");
		System.out.println("Before: ");
		System.out.println("-------");
		printArray(numbers);
		mergeSort(numbers);
		System.out.println("");
		System.out.println("==========");
		System.out.println("\nAfter: ");
		System.out.println("------");
		printArray(numbers);
	}



	// mergeSort()
	private static void mergeSort(int[] inputArray) {
		int inputLength = inputArray.length;

		if (inputLength < 2) {
			return;
		}

		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];

		// Left Half For Loop
		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = inputArray[i];
		}
		// Right Half For Loop
		for (int i = midIndex; i < inputLength; i++) {
			rightHalf[i - midIndex] = inputArray[i];
		}

		// mergeSort() the 2
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		
		// Call the merge() Method
		merge(inputArray, leftHalf, rightHalf);
			
	}

	// merge()
	private static void merge (int[] inputArray, int[] leftHalf, int [] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
	
		// Initiated the integer Attributes 
		int i = 0, j = 0, k = 0;
		
		while (i < leftSize && j < rightSize) {
			if(leftHalf[i] <= rightHalf[j]) {
				inputArray[k] = leftHalf[i];
				i++;
			}
			else {
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		// LEFT OVER CLEAN UP
		// While on the Left Array
		while (i < leftSize) {
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}
		// While on the Right Array
		while (j < rightSize) {
			inputArray[k] = rightHalf[j];
			j++;
			k++;
		}

	}
	
	// printArray()
	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Number: " + (numbers[i]));
		}
	};

}
