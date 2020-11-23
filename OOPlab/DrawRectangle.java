package OOPlab;
import java.util.Scanner;
public class DrawRectangle {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Gettersetter input = new Gettersetter(31,23);
		System.out.println("Width: ");
		int width = scanner.nextInt();
		input.setwidth(width);  
		System.out.println("Height: ");
		int height = scanner.nextInt();
		input.setheight(height);
		
		for(int i = 1; i <= height; i++) {
		    for(int j = 1; j<= width; j++) {
		    	if(j>=2 && j<=width-1 && i>=2 && i<=height-1) System.out.print("  ");
		    	else System.out.print("* ");
		    }  
			System.out.println();
		}
		 
	}
}
