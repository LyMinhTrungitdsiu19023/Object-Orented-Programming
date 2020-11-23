	package OOPLab4;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Question6 extends JPanel{
	private static int length1;
	private static int length2;
	private static int length3;
	private static int length4;
	private static int length5;
	public static void main(String[] args) {
		 String input1 = JOptionPane.showInputDialog("Enter the length of the bar 1");
		 length1 = Integer.parseInt(input1); 
		 String input2 = JOptionPane.showInputDialog("Enter the length of the bar 2");
		 length2 = Integer.parseInt(input2);
		 String input3 = JOptionPane.showInputDialog("Enter the length of the bar 3");
		 length3 = Integer.parseInt(input3);
		 String input4 = JOptionPane.showInputDialog("Enter the length of the bar 4");
		 length4 = Integer.parseInt(input4);
		 String input5 = JOptionPane.showInputDialog("Enter the length of the bar 5");
		 length5 = Integer.parseInt(input5);
		
		 Question6 panel = new Question6();
		 JFrame window = new JFrame("Bar chart"); 
		 window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		 window.add( panel ); 
		 window.setSize( 400, 400 ); 
		 window.setVisible( true );
		
 }
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 50, length1, 20);
		//g.drawRect (0, 50 , length1, 20);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 100, length2, 20);
		//g.drawRect (0, 100, length2, 20);
		g.setColor(Color.magenta);
		g.fillRect(0, 150, length3, 20);
		//g.drawRect (0, 150, length3, 20);
		g.setColor(Color.green);
		g.fillRect(0, 200, length4, 20);
		//g.drawRect (0, 200, length4, 20);
		g.setColor(Color.BLUE);
		g.fillRect(0, 250, length5, 20);
		//g.drawRect (0, 250, length5, 20);
		
	}
	
}
