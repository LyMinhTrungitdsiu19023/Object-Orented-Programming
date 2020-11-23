/*1.	Write a Taxi meter program to calculate the taxi fare for a given mileage.

a.	The first 2km is 15,000 VND
b.	The next 250m will cost 2000 VND
c.	If the travel distance is larger than 30km then each extra km will cost only 5000VND
 print the amount of money to be paid. **/
package Project1;
import java.util.Scanner;
public class TaxiFee {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int distance;
		int totalfee = 0;
		
		System.out.println("Welcome to Minh Trung Taxi");
		System.out.println("How far do you want to go?(please enter in meters unit)");
		distance = scanner.nextInt();
		
		if(distance <= 2000) { 
			totalfee = 15000;
		}
		if( distance > 2000 && distance < 30000 ) {
			totalfee = 15000 + (distance - 2000)*8; 
			
		}
		if(distance >= 30000) {
			totalfee = 239000 + (distance - 30000)*5;
		}
		System.out.print("Your total fee is " +totalfee); System.out.println(" VND");
		System.out.println("Thanks so much due to using our service, Have nice trips");
	}

}

