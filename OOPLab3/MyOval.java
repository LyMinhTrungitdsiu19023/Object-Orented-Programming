package OOPLab3;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.util.Scanner;

class Testoval extends JComponent {

    private int width, length;

    public Testoval() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Drawing Oval ");
        System.out.print("Width: ");
        width = scanner.nextInt();
        System.out.print("Length: ");
        length = scanner.nextInt();
        GetArea();
        scanner.close();
        
    }


    public void paint(Graphics g) {
        g.drawOval (20, 20, width, length);  
      }  

    public int Calarea() {
    	System.out.printf("Area = " +3,14*width*length);
    	return width*length; 
    }
    public double GetArea() {
    	
    	return Calarea();
    }
}

public class MyOval {
    public void drawOval() {
        JFrame window = new JFrame();
        window.setBounds(30, 30, 300, 300);
        window.getContentPane().add(new Testoval());
        window.setVisible(true);
    }
}
    	
   
