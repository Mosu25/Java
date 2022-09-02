package javaTraining;

public class DemoDataType {

	static byte by;
	static short sh;
	static int in;
	static long lg;
	static float fl;
	static double db;
	static boolean bl;
	static char ch;

	byte by1;
	short sh1;
	int in1;
	long lg1;
	float fl1;
	double db1;
	boolean bl1;
	char ch1;

	public static void main(String[] args) {

		/* byte = 0 
		 * short =0 
		 * int = 0	
		 * long = 0L	
		 * float = 0.0f
		 * double = 0.0d
		 * char = '\u0000'
		 * String (or any Object ) = null
		 * boolean = false 
		 */

		//	 byte i = (byte) 130;
		//	 System.out.println(i);  //1byte = 8bits -- 2^8 =256  -- -128 to 127

		System.out.println("Default Values of Data type: ");
		System.out.println("byte: "+by);
		System.out.println("short: "+sh);
		System.out.println("int: "+in);
		System.out.println("long: "+lg);
		System.out.println("float: "+fl);
		System.out.println("double: "+db);
		System.out.println("boolean: "+bl);
		System.out.println("char: "+ch);


		DemoDataType   ddt = new DemoDataType();
		System.out.println("Default Values of Data type: ");
		System.out.println("byte: "+ddt.by1);
		System.out.println("short: "+ddt.sh1);
		System.out.println("int: "+ddt.in1);
		System.out.println("long: "+ddt.lg1);
		System.out.println("float: "+ddt.fl1);
		System.out.println("double: "+ddt.db1);
		System.out.println("boolean: "+ddt.bl1);
		System.out.println("char: "+ddt.ch1);

		System.out.println("Default Range Values: ");

		System.out.println("Byte DataType min Range: "+Byte.MIN_VALUE);
		System.out.println("Byte DataType max Range: "+Byte.MAX_VALUE);
		
		System.out.println("Integer DataType min range: "+ Integer.MIN_VALUE);
		System.out.println("Integer DataType min range: "+ Integer.MAX_VALUE);
		
		char c =(char)-1;
		System.out.println(Integer.valueOf(c).toString());
		
	}
	
}


