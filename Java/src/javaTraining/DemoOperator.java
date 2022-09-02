package javaTraining;

public class DemoOperator {

	public static void main(String[] args) {
		
	// 1. Arithmetic Operator
		
		int a = 7 , b = 4 ;
		
		System.out.println("Value of a = 7 and Value of b = 4");
		System.out.println("Additon: "+ (a+b));
		System.out.println("Substraction: "+ (a-b));
		System.out.println("Multiplication: "+ (a*b));
		System.out.println("Division: "+ (a/b));
		System.out.println("Modulus: "+ (a%b));
		System.out.println("Increment: "+ (++a));
		System.out.println("Decrement: "+ (--b));

	// 2. Relational Operator
		
		int c = 5 , d = 6, f = 5;
		
		//equal 
		System.out.println(c==d); //False 
		System.out.println(c==f); //True
		
		//not equal
		System.out.println(c!=d); //true
		System.out.println(c!=f); //false
		
		//greater than
		System.out.println(c>d); //false
		System.out.println(c>f); //false
		
		//less than
		System.out.println(c<d); //true
		System.out.println(c<f); //false
		
		//Greater than equal
		System.out.println(c>=d); //false
		System.out.println(c>=f); //true
		
		//less than equal
		System.out.println(c<=d); //true
		System.out.println(c<=f); //true
		
			
	//3. Logical Operator
		
		System.out.println("Logical Operator");
		
		//logical And
		
		System.out.println(true && true); //true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); //false
		
		//logical Or
		System.out.println(true || true); //true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); //false
		
		//logical Not
		System.out.println(!true); //false
		System.out.println(!false); //true
		
	//4. Assignment Operator
		
		int i = 8;
		
//		i+=4; // i = i + 4
		i-=4; // i = i - 4
//		i*=4; // i = i * 4
//		i/=4; // i = i / 4
//		i%=4; // i = i % 4
		
		
		System.out.println(i);	
		
		
	//5. conditional Operator
	
		int x = 8 , y = 7 ;
		
	String z = (x<y)? "Mosu" : "M";
	int z1 = (x>y)? 9:8;
		
	System.out.println(z);
	System.out.println(z1);
	
	}

}
