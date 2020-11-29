package OOPLab3;
import  java.util.Scanner;
public class Main { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String chooseShape; 
		System.out.println("Choose the Shape that you want to draw \n (Line-Oval-Rectangle)"); 
		chooseShape = scanner.nextLine();
		
		if(chooseShape.equals("Line")) {
        MyLine l = new MyLine();
        l.drawline(); 
		}
		if(chooseShape.equals("Oval")) {
        MyOval o = new MyOval();
        o.drawOval(); 
		}
		if(chooseShape.equals("Rectangle")) {
		MyRectangle rec = new MyRectangle();
		rec.drawRec();
		}

        

	}
}
     


