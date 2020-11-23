package JavaTraining;

public class OverloadMethod {
	public static void main(String[] args) {
		System.out.println(square(7));
		System.out.println(square(7.5));
		
	}
	
	public static int square(int value) {
		System.out.print("square int 	= ");
		return value*value;
	}
	public static double square(double value) {
		System.out.print("square double	= ");
		
		return value*value;
	}

}
