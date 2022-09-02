package javaTraining;

public class DemoTypeCasting {

	public static void main(String[] args) {

		// Type casting is when you assign a value of one primitive data type to another type.
		
		// Widening Casting (automatically) - converting a smaller type to a larger type size

		// byte -> short -> char -> int -> long -> float -> double

		int a = 8;
		double b = a; // Automatic casting: int to double
		System.out.println(a);
		System.out.println(b);

		// Narrowing Casting (manually) - converting a larger type to a smaller size type
	
		// double -> float -> long -> int -> char -> short -> byte
	
		
		double c = 5.74d;
		int d = (int) c; // Manual casting: double to int
		System.out.println(c);
		System.out.println(d);
		
	}

}
