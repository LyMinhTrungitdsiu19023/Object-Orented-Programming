package OOPlab;

import java.util.Scanner;

public class TestRectangle {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Gettersetter input = new Gettersetter(31,23);
		System.out.println("Width: ");
		int width1 = scanner.nextInt();
		input.setwidth(width1);  
		System.out.println("Height: ");
		int height1 = scanner.nextInt();
		input.setheight(height1);  
		System.out.println("Width: ");
		int width2 = scanner.nextInt();
		input.setwidth(width2);  
		System.out.println("Height: ");
		int height2 = scanner.nextInt();
		input.setheight(height2); 
		System.out.println("Width: ");
		int width3 = scanner.nextInt();
		input.setwidth(width3);  
		System.out.println("Height: ");
		int height3 = scanner.nextInt();
		input.setheight(height3); 
		System.out.println("Width: ");
		int width4 = scanner.nextInt();
		input.setwidth(width4);  
		System.out.println("Height: ");
		int height4 = scanner.nextInt();
		input.setheight(height4); 
		System.out.println("Width: ");
		int width5 = scanner.nextInt();
		input.setwidth(width5);  
		System.out.println("Height: ");
		int height5 = scanner.nextInt();
		input.setheight(height5); 
		
		for(int i = 1; i <= height1; i++) {
			
			draw_width(width1);  
			System.out.println();
		} 
		System.out.println();
		
		for(int i = 1; i <= height2; i++) {
			
			draw_width(width2);  
			System.out.println();
		} 
		System.out.println();
		
		for(int i = 1; i <= height3; i++) {
			
			draw_width(width3);  
			System.out.println();
		} 
		System.out.println();
		for(int i = 1; i <= height4; i++) {
			
			draw_width(width4);  
			System.out.println();
		}
		System.out.println();
		for(int i = 1; i <= height5; i++) {
			
			draw_width(width5);  
			System.out.println();
		} 

}
	public static void draw_width(int m){   
		for(int star = 1; star <= m; star++) {
		    	System.out.print("*");
		    }
	}
}
