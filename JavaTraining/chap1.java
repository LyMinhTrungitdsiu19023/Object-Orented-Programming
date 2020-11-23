 	

package JavaTraining;

public class chap1 { 
	
	public static void main(String[] args) {
		int var1 		= 12;
		double var2 	= 1.23;
		int var3 		= var1 + (int)var2; 
		double var4		= (double)var1 + var2;
		
		
		System.out.println("var3: " +var3);
		System.out.println("var4: " +var4);
	}
	
	// 003 DATA TYPES
	public static void main003(String[] args) {
		int var1 		= 12;
		byte var2 		= 10;
		boolean var3 	= true;    
		double var4 	= 123.456; 
		String name = "Ly Minh Trung"; 
		
		System.out.println("var1: " +var1);
		System.out.println("var2: " +var2);
		System.out.println("var3: " +var3);
		System.out.println("var4: " +var4);
		System.out.println("name: " +name);
		
	}
	// 002 CONSTANTS
	public static void main002(String[] args) {
		final int YOUR_BIRTHDAY = 2001;           // CAN NOT BE CHANGED
		System.out.println(YOUR_BIRTHDAY);
	}

    // 001 DECLARATION
	public static void main001(String[] args) {
		int age 	= 19; 
		int year 	= 2020; 
		String name = "Ly Minh Trung";
		/*
		 Types of Declaration
		 - char firstname;   //normal
		 - char firstName;   //camelcase
		 - char first_name;  //underscores
		**/
		System.out.println("\" Hello") ;
		System.out.println("name: " +name);
		System.out.print( "age: " +age +"\n"); 
		System.out.println("year: " +year); 
		System.out.println("age: " +age);
		
		age = 30; 
		System.out.println("age: " +age);
	}

}
