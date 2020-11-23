package Input;
import java.util.Scanner;
public class inputstring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int n; 
		String chuoi = null; 
		
		System.out.print("Enter the number of string:");
		n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
		 
		chuoi = scanner.nextLine();// attention: string thì .nextLine()
		chuoi = scanner.nextLine(); 
		}
		
		for(int i=1; i<=n; i++) {
		System.out.println("Your string");
		System.out.println(chuoi);
	
	}
	}
}
