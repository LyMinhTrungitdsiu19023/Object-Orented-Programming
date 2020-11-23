package OOPLab3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;



import javax.swing.JComponent;
import javax.swing.JFrame;

class Testrect extends JComponent {

    private int width, length;

    public Testrect() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Drawing Rectangle");
        System.out.print("Width: ");
        width = scanner.nextInt();
        System.out.print("Length: ");
        length = scanner.nextInt();
        GetArea();
        scanner.close();
    }

	public void paint(Graphics g) {
        g.drawRect (20, 20, width, length);
    }
	public int Calarea() {
		System.out.println("Area = " +width*length);
		return width*length; 
	}
	public double GetArea() {
		
		return Calarea();
	}
}

public class MyRectangle {
    public void drawRec() {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(40, 40, 400, 400);
        window.getContentPane().add(new Testrect());
        window.setVisible(true);
      }
}
