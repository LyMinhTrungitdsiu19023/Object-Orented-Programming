package OOPLab3;

import java.util.ArrayList;
import java.util.Scanner;
class Point2D { 
	private float x = 0.0f;
	private float y = 0.0f; 
	
	public Point2D(float x, float y) {
		this.setX(x);
		this.setY(y);
	} 
	public Point2D() {
		x = 0;
		y = 0;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}  
	public void setXY(float x, float y) {
		setX(x);
		setY(y);
	}
	public ArrayList<Float> getXY() {
		ArrayList<Float> lo = new ArrayList<Float>();
		lo.add(x); lo.add(y);
		return lo;
	} 
	public String toString() {
		return "Point2D: A(" +x+","+y+")";
	} 
}
class Point3D extends Point2D{
	private float z = 0.0f;

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	} 
	public Point3D(float x, float y, float z) {
		super.setXY(x, y);                               // qua class khac nen phai dung setter de gan gia tri x va y
		this.setZ(z);
	}
	public Point3D() {
		z = 0;
	}
	public void setXYZ(float x, float y, float z) {
		super.setXY(x, y);
		setZ(z);
	}
	public ArrayList<Float> getXYZ() {
		ArrayList<Float> lo = new ArrayList<Float>();
		lo.add(getX()); lo.add(getY()); lo.add(z);      // qua class khac nen phai dung getter de gan gia tri x va y
		return lo;
	}

	@Override
	public String toString() {
		return "Point3D: B("+getX()+","+getY()+"," + z + ")";
	} 
}

public class Excercise4{
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	float x2, y2, x3, y3, z; 
    	System.out.println("Input Point 2D");
    	System.out.print("X = ");
    	x2 = scanner.nextFloat();
    	System.out.print("Y = ");
    	y2 = scanner.nextFloat();
    	System.out.println("Input Point 3D");
    	System.out.print("X = ");
    	x3 = scanner.nextFloat();
    	System.out.print("Y = ");
    	y3 = scanner.nextFloat();
    	System.out.print("Z = ");
    	z = scanner.nextFloat();
    	scanner.close();
        Point2D p2d = new Point2D(x2 , y2);
        Point3D p3d = new Point3D(x3 , y3, z);
        System.out.println(p2d.toString());
        System.out.println(p3d.toString());
    }
	}
