package javaTraining;

public class DemoWrapperClass {

	public static void main(String[] args) {
		
		// Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
	
	/*	
	 	Primitive Data Type	Wrapper Class
		byte	Byte
		short	Short
		int	Integer
		long	Long
		float	Float
		double	Double
		boolean	Boolean
		char	Character
	
	*/
	
		
		 	Integer id = 5;
		    Double salary = 5.99;
		    Character gender = 'M';
		    System.out.println(id);
		    System.out.println(salary);
		    System.out.println(gender);
		    
		    		    
		    /*
		      Another useful method is the toString() method, which is used to convert wrapper objects to strings.

				In the following example, we convert an Integer to a String, and use the length() method of the String class to output the length of the "string":
		     
		     */
		    
		    Integer myint = 45;
		   String str = myint.toString();
		   System.out.println(str.length());
	
	}

}
