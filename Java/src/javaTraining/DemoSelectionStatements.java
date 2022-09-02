package javaTraining;

public class DemoSelectionStatements {

	public static void main(String[] args) {

		//if , if ...else , if...else if ...else, switch

		int a = 5, b = 10, c = 15;

		// if Statement

		if (a>b) {

			System.out.println("a is greater than b");

		}

		System.out.println("End of the program");


		// if...else Statement

		if (a>b) {

			System.out.println("a is greater than b");

		}else {

			System.out.println("b is grater than a"); 
		}


		// if ...else if ...else


		if(a>b) {

			System.out.println("a is grater than b");

		}else if (b>c) {

			System.out.println("b is grater than b");

		}else if (c>a) {

			System.out.println("c is grater than a");

		}else {

			System.out.println("End of the program");
		}


		//switch case
		
		String fooditem = "pizza";
		
		switch(fooditem) {
		
		
		case "burger" :
			System.out.println("Here is your Burger");
			break;
		case "pizza" :
			System.out.println("Here is your Pizza");
			break;
		case "Idly":
			System.out.println("Here is your Idly");
			break;
			
		default:
			System.out.println("We only serve burger, pizza and Idly");
			
		}

		
	}

}
