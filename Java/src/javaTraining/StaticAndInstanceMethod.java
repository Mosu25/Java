package javaTraining;

public class StaticAndInstanceMethod {

	public static void main(String[] args) {

		display(); // calling without object		
		StaticAndInstanceMethod obj = new StaticAndInstanceMethod();
		obj.Show(); // calling using object
	}

	// Static Method

	static void display() {

		System.out.println("This is Static Method");
	}

	//Instance Method

	void Show() {

		System.out.println("This is Instance Method");

	}

}

