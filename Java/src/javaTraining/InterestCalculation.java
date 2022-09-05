package javaTraining;

public class InterestCalculation {
	
	/* private - access modifiers
	  
	 1. private method, variable, constructor access only within the class but doesn't allow to access different class
	 
	 
	 */
	
	private int interest = 12;
	private String name = "ICICI";
	
	
	private InterestCalculation(){
		
		System.out.println("Constructor Executed");
	}
	

	public static void main(String[] args) {
		
		
		System.out.println("Hello"); //("Hello") is the parameter
		System.out.println(5);
		System.out.println(10.5f); //predefined method overloading ex. "println"
		
		
		InterestCalculation ic = new InterestCalculation();
		System.out.println("interest: " + ic.interest); //access private variable
		System.out.println("Name: " +ic.name); //access private variable
				
		// ic.calculate(8);
		// ic.calculate(18.67f);
		
	}

	// user defined Method overloading 
	// same method name with different arguments called method overloading
	
	private void calculate(int year) {
		
		System.out.println("int: "+year);
	}
	
	private void calculate(float year) {
		System.out.println("float: "+year);
	}
	
	
}
