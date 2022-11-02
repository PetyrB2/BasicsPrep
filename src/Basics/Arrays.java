package Basics;

public class Arrays {

	 public static int num[] = {1,2,3,4,5,6,7,8,9,0};

	    public static void main(String[] args) {
	    	
			System.out.println("========================");
			System.out.println("Title: Arrays");
			System.out.println("Genre: Java Basics");
			System.out.println("Author: Peter Broadbent");
			System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
			System.out.println("========================\n");
			System.out.println("");
			
			
	        for(int i : num) {
	            System.out.println("Number: " + i);
	        }
	    }
	}