package javaTraining;

public class DemoArrays {

	public static void main(String[] args) {
		
		/* Java Arrays
		Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
		To declare an array, define the variable type with square brackets:
		*/
		
	
		String[] name = {"Mosu", "Subash", "Santhosh", "Arasu"}; //String Array
		int[] age = {28, 25, 24, 21};
		age[0] = 29; // To change the value of a specific element, refer to the index number
		System.out.println(age[0]);
		System.out.println(name[0]);
		System.out.println(age[3]);
		System.out.println(name.length); // Array length finding
	}

}
