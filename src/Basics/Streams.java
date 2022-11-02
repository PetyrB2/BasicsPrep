package Basics;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		System.out.println("========================");
		System.out.println("Title: Streams");
		System.out.println("Genre: Java Basics");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("========================\n");
		System.out.println("");
		
		List<String> names2 = Arrays.asList("Bob", "Peter");

		List<String> names = new ArrayList<>();
		names.add("Bob");
		names.add("Barbara");
		names.add("Bert");
		names.add("Peter");
		names.add("Brett");

		List<Integer> nums = new ArrayList<>();
		nums.add(13000000);
		nums.add(130000);
		nums.add(13000);
		nums.add(1300435);
		nums.add(1300);
		nums.add(130);

		List<Integer> characters = new ArrayList<>();
		characters.add(22);
		characters.add(11);
		characters.add(534);
		characters.add(124);
		characters.add(14);

		// Print out Integers using a ForEach with a Stream
		Stream<Integer> randoms = characters.stream();
		randoms.forEach(x -> System.out.println(x));
		System.out.println(" \n");
		// MAPPING with .map
		List<Integer> doubles = nums.stream().map(x -> x * 2).collect(Collectors.toList());

		List<String> sortedOrder = names.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted order of names Array");
		System.out.println("------------");
		for (String i : sortedOrder) {
		
			System.out.println(i);
		}

		
		int odds = characters.stream()
				.filter(x -> x % 2 != 0)
				.reduce((a, b) -> a + b)
				.get();

		System.out.println(odds);
		System.out.println("-----");
		System.out.println("");
		
		
		// using var instead of setting the variable Type
		System.out.println("Using var instead of setting the variable Type");
		System.out.println("-------------------------------------------------");
		var var = "BOB";
		System.out.println(var);
	}

}
