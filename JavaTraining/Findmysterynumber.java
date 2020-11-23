package JavaTraining;

import java.util.Scanner;

public class Findmysterynumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number;
		final int min = 1;
		final int max = 100;
		int range = (max - min) + 1;
		int secretnumber = (int)(Math.random() * range ) + min;
		
		System.out.println("You only have 30 opportunites - "
				+ "Now getting start"); 
		System.out.println();
		
		System.out.print("Your Number(1-100): ");
		number = scanner.nextInt(); 
		
		for(int i = 1; i <= 30; i++) {
			
			if(i == 30) {
				System.out.println("______-_-_______");
				System.out.println("You lose");
				System.out.print("Secret Number is " + secretnumber);
				break;
			}
			if(number < secretnumber) {
				System.out.println("Greater than");
				System.out.print("Your Number(1-100): ");
				number = scanner.nextInt();
			}
		    if(number > secretnumber) {
				System.out.println("Less than");
				System.out.print("Your Number(1-100): ");
				number = scanner.nextInt();
			}
		    

		}
		if(number == secretnumber){
			System.out.println("You win");
		}
	}

}
