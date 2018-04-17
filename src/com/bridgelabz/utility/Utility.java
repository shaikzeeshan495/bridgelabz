package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static int inputInteger(){
		try {
			return scanner.nextInt();
		} 
		catch (Exception e) {
			scanner.nextLine();
			System.out.println("Invalid input, try again.");
			return inputInteger();
		}
	}
	
	public static String inputString(){
		
			return scanner.next();
		
	}

}
