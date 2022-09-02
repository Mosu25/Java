package javaTraining;

public class DemoStaticBlock {

	//static block1
	
	static { 	 
		System.out.println("Static Block1 Executed");
	}
	
	//static block2
	
	static {  	 
		System.out.println("Static Block2 Executed");
	}
	
	//Static Method
	
	static void Add() {
		
		int a = 5, b = 6, sum;
		sum = a + b;
		System.out.println("Additon two numbers: "+ sum);
		
	}
	
	//Main Method
	
	public static void main(String[] args) {
		
		System.out.println("Main method Executed");
		Add();
		
	}
	
	//static block3
	
	static {
		System.out.println("Static Block3 Executed");
	}

}
