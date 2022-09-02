package javaTraining;

public class DemoMethod {

	public static void main(String[] args) {

		System.out.println("Inside Main Method");

		index(); // method calling statement

		printMyName("Mosu"); // mosu -- Argument, printMyName -- calling method statement
		printMyName("Santhosh");

		add(20,25); // 20,25 -- argument, passing multiple Arguments (20,25)

		int r = multiply(2,3,8);
		System.out.println(r);

		String d = dayOfTheWeek(7);
		System.out.println(d);
	}

	// method

	public static void index() {

		System.out.println("Welcome");
	}

	// create a single parameterized method

	public static void printMyName(String name) { //name -- Parameter

		System.out.println("Welcome "+  name);
	}


	// Create a multiple parameterized method 

	public static void add(int a, int b) { // a, b -- Parameter -- using (multiple parameter)

		int sum;
		sum = a + b ;
		System.out.println(sum);

	}


	// Return the int value from a method

	public static int multiply (int a, int b, int c) {

		int result;
		result = a * b * c;
		return result;

	}

	// Return the String value from a method
	
	public static String dayOfTheWeek(int number) {

		String day= "";

		if (number==1) {
			day = "Sunday";
		}else if(number==2) {
			day ="Monday";
		}else if (number==3) {
			day = "Tuesday";
		}else if (number==4) {
			day="Wednesday";
		}else if(number ==5) {
			day ="Thursday";
		}else if (number==6) {
			day ="friday";
		}else if (number==7) {
			day = "saturday";
		}
		return day;
	}
}
