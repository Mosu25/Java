package javaTraining;

import java.util.Scanner;

public class PasswordApplicationUsingLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for(int i=0; i<3; i++) {

			System.out.println("Please enter the Password:");
			String inputPassword = sc.next();
			String Password = "Pass@123";

			if (inputPassword.equals(Password)) {

				System.out.println("Hi you login successfully ");
				break;

			}else {
				System.out.println("Please enter valid password");
			}

		}
		
		sc.close();
	}

}
