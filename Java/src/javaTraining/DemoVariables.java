package javaTraining;

public class DemoVariables {

	static int ss=101; // Static variable --Memeory allocated only once when class loaded
	int a = 25; // Global Variable (Scope for entire class)
	int b = 10; // Global Variable (Scope for entire class)


	public void exampleOne() {

		int a = 5 ; // Local Variable (scope for only in the method)

		System.out.println("Local Variable ExampleOne Method: " +a);
		System.out.println("Global Variable ExampleOne Method: " +this.a);
		System.out.println("Static Variable ExampleOne Methhod: "+ss);

	}

	public void exampleTwo() {

		System.out.println("Global Variable ExampleTwo Method: " +b);

	}


	public static void main(String[] args) {

		DemoVariables eo = new DemoVariables();
		eo.exampleOne();
		eo.exampleTwo();
		System.out.println("static variable Main Method: "+ss);


	}
}


