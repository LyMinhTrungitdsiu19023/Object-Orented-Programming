package OOPlab;
import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Trianglergetset input = new Trianglergetset(100,100,100);
		System.out.println("Side 1: ");
		int s1 = scanner.nextInt();
		input.sets1(s1); 
		System.out.println("Side 2: ");
		int s2 = scanner.nextInt();
		input.sets2(s2); 
		System.out.println("Side 3: ");
		int s3 = scanner.nextInt();
		input.sets3(s3); 
		
		if(s1 == s2 && s2 == s3 && s1 == s3) {
			System.out.println("Tam giac deu");
		} 
		if(s1 == s2 && s1 != s3 && s2 != s3) {
			System.out.println("Tam giac can");
		}
		if(s1 != s2 && s2 != s3 && s1 != s3) {
			System.out.println("Tam giac khong deu");
		}		

}
}
