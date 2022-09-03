package javaTraining;

public class DemoMathClass {

	public static void main(String[] args) {
		
		// The Java Math class has many methods that allows you to perform mathematical tasks on numbers.
		
		System.out.println(Math.min(8, 9));
		System.out.println(Math.max(17.5, 17.78));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.abs(-17.45f));
		
		int randomNumber = (int)(Math.random() * 101);
		System.out.println(randomNumber);
		
	}

}
