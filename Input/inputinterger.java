package Input;
import java.util.Scanner; //must have

public class inputinterger{
	public static void main(String[] args){    //must have this line
		Scanner scanner = new Scanner(System.in); //call scanner function
		double num1; //declaring  // co the dung int
		double num2;
		double sum, product, minus;  
	 
		System.out.println("Enter number 1: ");
		num1 = scanner.nextInt(); // input
		System.out.println("Enter number 2: ");
		num2 = scanner.nextInt();
		
		product = num1*num2; 
		sum = num1 + num2;
		if(num1 >= num2) {
			minus = num1 - num2;
		}
		else {
			minus = num2 - num1; 
		}
		System.out.println("____________________");
		System.out.println("Number 1: " +num1);
		System.out.println("Number 2: " +num2);
		System.out.println("Sum is: " +sum);
		System.out.println("Minus(positive) is: " +minus);
		System.out.println("Product is: " +product); 
	}

}
