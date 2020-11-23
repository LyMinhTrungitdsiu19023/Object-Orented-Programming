package JavaTraining;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int number1;
	int number2;
	int result = 0;
	String calculate; 
	
	System.out.print("Number 1: ");
	number1 = scanner.nextInt();
	scanner.nextLine();
	System.out.print("Number 2: ");
	number2 = scanner.nextInt();
	scanner.nextLine();
	
	System.out.print("Calculate: ");
	calculate = scanner.nextLine();
	
	switch(calculate) {
	case "+":
		result = number1 + number2;
		break;
	case "-":
		result = number1 - number2;
		break;
	case "*":
		result = number1 * number2;
		break;
	case "x": 
		result = number1 * number2;
		break;
	case "/":
		result = number1 / number2;
		break;
	case ":": 
		result = number1 / number2;
		break;
	case "%":
		result = number1 % number2;
		break;
	}
	System.out.println("_________________________");
	System.out.println("Result: ");
	System.out.print(number1 + calculate + number2 + "=" + result);
	}
	

}
