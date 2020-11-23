package JavaTraining;
import java.util.Scanner; // include scanner utility for accepting keyboard input
public class MinMax {
	
	 public static void main(String[] args) { // begin the main method
	 Scanner input=new Scanner (System.in); //create a new Scanner object to use
	 int num1=0, num2=0, num3, bigger=0, smaller=0; // initialize variables
	 System.out.printf("NUMBER CALCULATIONS\n\n");

	 System.out.printf("Enter First Number:\t\t ");
	 num1=input.nextInt(); // store next integer in num1

	 System.out.printf("Enter Second Number:\t ");
	 num2=input.nextInt(); // store next integer in num2

	 System.out.printf("Enter Third Number:\t ");
	 num3=input.nextInt(); // store next integer in num3

	 bigger=num1>num2?num1:num2; // checks the biggest number in and assigns it to bigger variable
	 bigger=bigger>num3?bigger:num3;
	 smaller=num1<num2?num1:num2; // checks the smallest number in and assigns it to smaller variable
	 smaller=smaller<num3?smaller:num3;
	 // display the sum, average, product, smallest and the biggest of all three numbers
	 System.out.printf("\t-------------------------\n");
	 System.out.printf("\t\t\tSum =\t\t %d\n", num1+num2+num3);
	 System.out.printf("\t\t\tAverage =\t %d\n", (num1+num2+num3)/3);
	 System.out.printf("\t\t\tProduct =\t %d\n", num1*num2*num3);
	 System.out.printf("\t\t\tBiggest =\t %d\n", bigger);
	 System.out.printf("\t\t\tSmallest =\t %d\n", smaller);
	 }
	} 

