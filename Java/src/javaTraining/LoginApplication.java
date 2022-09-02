package javaTraining;

import java.util.Scanner;

public class LoginApplication {

	public static void main(String[] args) {
		
		//Password Application using if... else selection statement
		//Two level authentication
		
		System.out.println("Enter the Password: ");
		Scanner sc = new Scanner(System.in);
		String inputPassword = sc.next();
		String password ="Welcome@123";
		int pin = 1234;		

		if(password.equals(inputPassword)) {

			System.out.println("Enter the OTP: ");
			int inputPin = sc.nextInt();

			if(pin==inputPin) {

				System.out.println("Hi you login successfully");

			}else {

				System.out.println("Please enter valid pin");
			}

		}

		else {

			System.out.println("Please enter valid password");
		}

		sc.close();
	}


}
