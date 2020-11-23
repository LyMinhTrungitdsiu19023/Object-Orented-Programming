package OOPLab4;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Question4b extends JPanel{ 
	public static void main(String []arg){
        Question4b panel = new Question4b();
        JFrame window = new JFrame("Question 4b");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(panel); 
        window.setSize(300, 300); 
        window.setVisible(true);
	}

	public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        int width = getWidth();
        int height = getHeight();
        double counter = 0;
        while(counter < 20) {
           double tyle = counter / 20;
           double tyle2 = (20-counter-1) / 20;
           Line2D line1 = new Line2D.Double( 0, tyle * height, tyle * width, height );
           Line2D line2 = new Line2D.Double( tyle*width, 0, width, tyle*height );
           Line2D line3 = new Line2D.Double( width, tyle*height, tyle2*width, height );
           Line2D line4 = new Line2D.Double( tyle2*width, 0, 0, tyle*height );
           g2.draw(line1);
           g2.draw(line2);
           g2.draw(line3);
           g2.draw(line4);
           counter++;
         }


	}
	
	
}
