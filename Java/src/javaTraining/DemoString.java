package javaTraining;

public class DemoString {

	public static void main(String[] args) {
		
		// A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:
		
		//String Length finding
		
		String str = "Hi Mosu...Good Morning";
		System.out.println("Lenth of string: "+str.length());
		System.out.println(str.toUpperCase()); // convert to UpperCase
		System.out.println(str.toLowerCase());  // convert to LowerCase
		
		/* Finding a Character in a String
		The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
		*/
			
		System.out.println(str.indexOf("Mosu"));
		
		String firstName = "Mosu";
		String lastName = "M";
		System.out.println(firstName+ " "+lastName); //concatenation
		System.out.println(firstName.concat(lastName)); //concatenation
		
		
		//If you add two numbers, the result will be a number:
		
		int x = 5;
		int y = 10;
		System.out.println(x+y); // will be 30 (an integer/number)
		
		//If you add two strings, the result will be a string concatenation:
		
		String a = "5";
		String b = "10";
		System.out.println(a+b);
	
		// If you add a number and a string, the result will be a string concatenation:
		
		String c = "5";
		int d = 10;
		System.out.println(c+d);
		
	
	}
	
	

}
