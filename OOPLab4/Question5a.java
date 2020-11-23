package OOPLab4;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class Question5a extends JPanel{
    public static void main(String args[]){
        Question5a panel = new Question5a();
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(panel); 
        window.setSize(350, 350); 
        window.setVisible(true); 
   }
    public void paintComponent(Graphics g)
    {
        int width = getSize().width;
        int height = getSize().height;
        int widthCenter = width / 2;
        int heightCenter = height / 2;
        int counter = 0;
        
        while(counter <= 5 ) {
        	g.setColor(Color.RED);
            g.drawLine(widthCenter + (30*counter), heightCenter - (30*counter), widthCenter + (30*counter), heightCenter + 30 + (30*counter));
            g.drawLine(widthCenter + (30*counter), heightCenter + 30 + (30*counter), widthCenter - 30 - (30*counter), heightCenter + 30 + (30*counter));
            g.drawLine(widthCenter - 30 - (30*counter), heightCenter + 30 + (30*counter), widthCenter - 30 - (30*counter), heightCenter - 30 - (30*counter));
            g.drawLine(widthCenter - 30 - (30*counter), heightCenter - 30 - (30*counter), widthCenter + 30 + (30*counter), heightCenter - 30 - (30*counter));
            
            counter++;
        }
	}
}
