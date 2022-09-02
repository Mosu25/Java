package javaTraining;

import java.util.Scanner;

public class LoginApplicationUsingWhile {

	public static void main(String[] args) {

		int i =0;
		Scanner sc = new Scanner(System.in);

		while(i<3) {

			System.out.println("Please enter the Password");
			String inputPassword = sc.next();
			String password = "Pass@123";

			if(inputPassword.equals(password)) {

				System.out.println("Hi you Login successfully");
				break;
			}else {
				System.out.println("Please enter the valid password");
			}
			
			i++;
		}
		sc.close();
	}

}
