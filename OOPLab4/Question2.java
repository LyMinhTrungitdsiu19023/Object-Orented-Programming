package OOPLab4;
import  java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

	public class Question2 extends JPanel{
		public static void main(String[] args) {
			Question2 panel = new Question2();
	        JFrame window = new JFrame("Question 2");
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        window.add(panel); 
	        window.setSize(350, 350); 
	        window.setVisible(true); 

		}
		public void paint(Graphics g) {
	    	super.paint(g);
	        int x = getWidth();
	        int y = getHeight();
	    	g.drawLine(0, 0, x, y);
	        g.drawLine(0, y, x, 0);
	        g.drawLine(x/2, 0, x/2 ,y);
	        g.drawLine(0, y/2, x, y/2);
	        }

	}



