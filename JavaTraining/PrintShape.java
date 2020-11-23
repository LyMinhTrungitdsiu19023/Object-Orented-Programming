package JavaTraining;

import java.util.Scanner; 

public class PrintShape {
	
	
	public static void main(String[] args) {
		/*
		 * 
		 * *
		 * * *
		 * * * *
		 * * * * *
		 */
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number: ");
		number = scanner.nextInt();
		
		int k = 1;
		while(k <= number) {
	
			for(int i = 1; i <= k; i++) System.out.print("* ");
			System.out.println();
			k++;
		}
		System.out.println(); 
		/*
		 * * * * *
		 * * * *
		 * * *
		 * *
		 *
		 */
		while(number >= 1) {
			for(int j = 1; j <= number; j++) System.out.print("* ");
			System.out.println();
			number--;
		}
		System.out.println();
		/*
		          *
		        * *
		      * * *
		    * * * *
		 */
		int k1 = 1;
		while(k1 <= 5) {
			for(int i = 1; i <= 5 - k1; i++) System.out.print("  ");
			for(int j = 1; j <= k1; j++) System.out.print("* ");
			System.out.println();
			k1++;
		}
		System.out.println();
		/*
		* * * * * 
		* * * * 
		* * * 
		* * 
		* 
		*/
	    int number1 = 5;
		while(1 <= number1) {
	
			for(int i = 1; i <= number1; i++) System.out.print("* ");
			System.out.println();
			number1--;
		}
		
		System.out.println();
		/*
			1 
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5 
		 */
		int k2 = 1;
		while(k2 <= 5) {
	
			for(int i = 1; i <= k2; i++) System.out.print(i+" ");
			System.out.println();
			k2++;
		}
		
	
	}

}
