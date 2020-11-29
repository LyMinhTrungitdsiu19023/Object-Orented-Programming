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
		
			draw_width(width);  
			System.out.println();
		}
		 
	}
	


public static void draw_width(int m){   
	for(int star = 1; star <= m; star++) {
	    	System.out.print("*");
	    }
}
}
