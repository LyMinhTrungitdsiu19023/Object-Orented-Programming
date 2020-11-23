package OOPLab4;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Question4a extends JPanel{ 
	public static void main(String []arg){
        Question4a panel = new Question4a();
        JFrame window = new JFrame("Question 4a");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(panel); 
        window.setSize(300, 300); 
        window.setVisible(true);
	}
	  public void paintComponent(Graphics g) {
	        Graphics2D l = (Graphics2D)g;
	        int width = getWidth();
	        int height = getHeight();
	        double counter = 0;
	        while(counter <= 20) {
	           double tyle = counter / 20;
	           Line2D line1 = new Line2D.Double(0, tyle * height, tyle * width, height);
	           l.draw(line1);
	           counter++;
	}
}
}
