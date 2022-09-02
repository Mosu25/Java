package javaTraining;

import java.util.Scanner;

public class DemoSwitchCase {

	public static void main(String[] args) {

		System.out.println("Please enter the Table Number: ");
		Scanner sc = new Scanner(System.in);
		int inputSwitchNum = sc.nextInt();
		sc.close();

		// Duplicate case not allowed

		switch(inputSwitchNum) {

		case 1: {

			System.out.println("I am Table No: 1, Please Come ");
			break;

		}

		case 2: {

			System.out.println("I am Table No: 2, Please Come ");
			break;

		}

		case 3: {

			System.out.println("I am Table No: 3, Please Come ");
			break;

		}

		case 4: {

			System.out.println("I am Table No: 4, Please Come ");
			break;
		}

		default: {

			System.out.println("No one need help");

		}

		}

	}

}
