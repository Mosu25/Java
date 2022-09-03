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


		// Using for loop access the array value

		for (int i=0;i<name.length;i++) {
			System.out.println("for loop result: " + name[i]);
		}


		// Using for each loop to access the array value

		for(String i: name) {

			System.out.println("for-each loop result: " +i);
		}
		
		// Multidimensional Array 
		
		int[][] salary = {{25000,30000},{34000,18000}}; 

		System.out.println(salary[0][1]);
		System.out.println(salary[1][0]);
		
		
		// using for loop to access values from multidimensional array
		
		for (int i = 0; i<salary.length; i++) {
			for(int j=0; j<salary[i].length; j++) {
				System.out.println(salary[i][j]);
				
			}
		}
		
		
	}

}
