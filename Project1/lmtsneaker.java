package Project1;
import java.util.Scanner;
public class lmtsneaker {
	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      
	      String name, pass;  
	      int n, m, chance; 
	      int size1 = 0, size2 = 0; 
	      
	      System.out.println("Welcome to lmtsneaker.com"); 
	      System.out.print("Enter Account: ");                                                 name = scanner.nextLine();
	      System.out.print("Enter Password: ");                                                pass = scanner.nextLine();
	      System.out.print("Hello "); System.out.println(name); 
	      System.out.println("What brand do you want to find? (1)Adidas($200) - (2)Nike($220) - (3)Both"); n = scanner.nextInt(); 
	      
	      
	      if(n == 1) {
	    	  System.out.println("What is your EU size?"); size1 = scanner.nextInt();
	      }
	      if(n == 2 ) {
	    	  System.out.println("What is your EU size?"); size2 = scanner.nextInt();
	      }
	      if(n == 3) {
		      System.out.println("Size of Adidas");        size1 = scanner.nextInt(); 
		      System.out.println("Size of Nike");          size2 = scanner.nextInt(); 
	      }
	      System.out.println("___________________________________"); System.out.println("---RECIPT---"); 
	      System.out.println(name);
	      if(n == 1) {
	    	  System.out.print("Adidas -  "); System.out.println(size1); 
		      System.out.println("Total cost: $200"); 
	      }
	      if(n == 2) {
	    	  System.out.print("Nike -  ");   System.out.println(size2);
		      System.out.println("Total cost: $220");
	      }
	      if(n == 3) {
		      
	    	  System.out.print("Adidas -  ");
	    	  System.out.println(size1);
	    	  System.out.print("Nike -  "); 
	    	  System.out.println(size2);
	    	  System.out.println("Total cost: $420");
	    	  
	      }
 
	      System.out.println("------------");
	      System.out.println("_________");
	      System.out.println("|Payment|");
	      System.out.print("Enter your money: $"); 
	      m = scanner.nextInt(); 
	      
	      if(n == 1) {
	    	  if(m >= 200) {
	    		  chance = m - 200;
	    		  System.out.println("Your chance: $" +chance);
		    	  System.out.println("Your chance is resent to your account");
	    	  }
	    	  else {
	    		  
	    		  System.out.println("You are not enough Money - Payment is denied");
	    	  }
	      }
	      if( n == 2) {
	    	  if(m >= 220) {
		    	  chance = m - 220;
		    	  System.out.println("Your chance: $" +chance);
		    	  System.out.println("Your chance is resent to your account");
	    		  
	    	  }
	    	  else {
	    		  System.out.println("You are not enough Money - Payment is denied");
	    	  }
	      }
	      
	      if(n == 3) {
	         if(m >= 420) {

	          chance = m - 420;
	          System.out.println("Your chance: $" +chance);
	    	  System.out.println("Your chance is resent to your account");
	      }
	         else {
	        	 System.out.println("You are not enough Money - Payment is denied");
	         }
	   }
}
}
