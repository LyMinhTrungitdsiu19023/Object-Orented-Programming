import java.util.Scanner;

public class WelcomeTrungtoJava {


   public static void main(String[] args) {
      
	   
	  Scanner scanner = new Scanner(System.in); 
	  String name;
	  int age;
      
	  System.out.println("What is your name?");
      name = scanner.nextLine();
      System.out.println("How old are you?");
	  age = scanner.nextInt();
      
	  System.out.println("______________");
	  
	  if(age > 18) {
		  System.out.print("Hello Mr ");
		  System.out.println(name);
		  System.out.print("Welcome to Java, You are allowed to access");
		  
	  }
	  else {
		  System.out.print("Oh no, sorry ");
		  System.out.println(name);
		  System.out.println("You are too young to access our website"); 
	  }

  }
}

