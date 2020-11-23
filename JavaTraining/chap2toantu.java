package JavaTraining;
import java.util.Scanner;
public class chap2toantu {
	// 001 Toan tu so hoc 
	public static void main001(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int number1;
		int number2; 
		int result; 
		System.out.println("Input Number 1");
		number1 = scanner.nextInt();
		System.out.println("Input Number 2");
		number2 = scanner.nextInt();
		
	// + 
		result = number1 +number2;
		System.out.println(number1 + " + " +number2 + " = " +result);
	// -
		result = number1 - number2;
		System.out.println(number1 + " - " +number2 + " = " +result);
	// *
		result = number1*number2;
		System.out.println(number1 + " x " +number2 + " = " +result);
	// /
		result = number1/number2;
		System.out.println(number1 + " : " +number2 + " = " +result);
	// %
		result = number1%number2;
		System.out.println(number1 + " % " +number2 + " = " +result);
	} 
	
	
	// 002 Toan tu gan
	public static void main(String[] args) {
		int number = 20; 
		
		System.out.println("Start = " +number);
		
		//number = number + 10; 
		//System.out.println(+number); 
		number +=10; 
		System.out.println(+number);
	}
}
    
	
	
	

