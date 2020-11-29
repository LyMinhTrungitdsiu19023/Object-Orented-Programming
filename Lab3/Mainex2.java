package OOPLab3;
import java.util.Scanner;
public class Mainex2 {
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	     System.out.println("Enter the dimension of the 1st point");
	    System.out.print("x = ");
	    int x1 = scanner.nextInt();
	    System.out.print("y = ");
	    int y1 = scanner.nextInt();
	    
	    System.out.println("Enter the dimension of the 2nd point");
	    System.out.print("x = ");
	    int x2 = scanner.nextInt();
	    System.out.print("y = ");
	    int y2 = scanner.nextInt();
	    
	    System.out.println("Enter the dimension of the 3rd point");
	    System.out.print("x = ");
	    int x3 = scanner.nextInt();
	    System.out.print("y = ");
	    int y3 = scanner.nextInt();
	    scanner.close(); 
	    
	    MyPoint p1 = new MyPoint(x1, y1);
	    MyPoint p2 = new MyPoint(x2, y2);
	    MyPoint p3 = new MyPoint(x3, y3);
	    MyTriangle tri = new MyTriangle(p1, p2, p3);
	    System.out.println(tri.toString());
	    System.out.println(tri.getTypeTri());
	    System.out.print("Perimeter = ");
	    System.out.println(tri.getPeri());
	  }
	}
