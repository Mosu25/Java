package javaTraining;

public class DemoMethodOverloading {

	public static int AdditionOfTwoNumbers (int a, int b) {

		return a+b;
	}

	public static Double AdditionOfTwoNumbers (double c, double d) {

		return c+d;
	}


	public static void main(String[] args) {

		// Method overloading, multiple methods can have the same name with different parameters

		System.out.println(AdditionOfTwoNumbers(3,4));
		System.out.println(AdditionOfTwoNumbers(3.34,4.56));

	}

}

