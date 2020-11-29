package OOPlab;
import java.util.Scanner;
public class Point {
	private double xp; 
	private double yp;
	public void setX(double xp) {
		this.xp = xp;
	}
	public void setY(double yp) {
		this.yp = yp;
	} 
	
	public Point(double xp, double yp) {
		
		
	}
	
	public static void distance(double x, double y) {
		double distance; 
		double inx = x;
		double iny = y;
		double z = Math.pow(5-x, 2);
		double k = Math.pow(6-y, 2);
		distance = Math.sqrt(z+k);
		System.out.print("Distance = " +distance);
	
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Point p = new Point(5,6);
		double xt = scanner.nextInt(); // input x target
		double yt = scanner.nextInt(); // input y target
		
		distance(xt, yt);


		
	}

}
