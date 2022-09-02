package javaTraining;

import java.util.Scanner;

public class LoginApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			System.out.println("Please Enter password");
			String inputPassword =sc.next();
			String Password = "Pass@123";

			if(inputPassword.equals(Password)) {
				System.out.println("Hi you login successfully");
				break;
			}else {
				System.out.println("Please enter valid password");
			}

			//			System.out.println("Enter the flag");
			//			flag=sc.nextBoolean();
		}

		sc.close();	
	}

}
