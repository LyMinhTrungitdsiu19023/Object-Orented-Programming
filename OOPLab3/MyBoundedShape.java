package OOPLab3;

public abstract class MyBoundedShape {
	private double area;
	public abstract void GetArea();
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	} 

}
