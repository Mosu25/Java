package javaTraining;

import java.util.Scanner;

public class GetUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner object creation
		System.out.println("Enter your Name");
		String name= sc.nextLine(); //Read user input
		System.out.println("User Name: "+name); // output -- Display user input
		
		
		System.out.println("Enter Age: " +sc.nextInt());
		
		
		/*
		 
		nextBoolean()	Reads a boolean value from the user
		nextByte()		Reads a byte value from the user
		nextDouble()	Reads a double value from the user
		nextFloat()		Reads a float value from the user
		nextInt()		Reads a int value from the user
		nextLine()		Reads a String value from the user
		nextLong()		Reads a long value from the user
		nextShort()		Reads a short value from the user
		
		*/
		
		
		// Note: If you enter wrong input (e.g. text in a numerical input), you will get an exception/error message (like "InputMismatchException").
	
	}

}
