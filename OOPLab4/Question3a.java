package OOPLab4;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class Question3a extends JPanel{
    public static void main(String args[]) {
        Question3a panel = new Question3a();
        JFrame window = new JFrame("Question 3a");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(panel); 
        window.setSize(350, 350); 
        window.setVisible(true); 
    } 

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth(); 
        int height = getHeight(); 
         
        for(int i = 0; i<=300; i+=20) {
        	g.drawLine(0 , 0, i, ((-height/width)*i+height));
        } 

    } 
}

