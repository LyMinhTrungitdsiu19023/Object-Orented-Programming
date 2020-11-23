package OOPlab;
import java.util.Scanner; 
public class Order {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GetsetOrder input = new GetsetOrder(); 
		int sum=0;
		System.out.print("ID of an Order: ");
		int idorder = scanner.nextInt();
		input.setIdorder(idorder);
		
		System.out.print("The number of Items: ");
		int n = scanner.nextInt();
		input.setN(n);

		for( int i = 1; i <= n; i++) {
			inputitem();

		}
		for( int i = 1; i<=n; i++) {
			System.out.print("Price of Item " +i+ ":" );
			double price = scanner.nextDouble();
			input.setPrice(price);
			sum +=price;
	
		}
		calculateAverageCost(sum, n);
		System.out.println("Averagecost: " +calculateAverageCost(sum, n));
	}
public static void inputitem() {
	Scanner scanner = new Scanner(System.in);
	GetsetOrder input = new GetsetOrder();
	System.out.print("The name of Item: ");
	String name = scanner.nextLine();
	input.setName(name); 
	
	System.out.print("ID of item:");
	int iditem = scanner.nextInt(); 
	input.setIditem(iditem); 
	

	
}

public static double calculateAverageCost(double sum, int n) {
	GetsetOrder input = new GetsetOrder();
	double average; 
	return average = sum/n; 
}
}
