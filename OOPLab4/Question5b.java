package OOPLab4;

import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Question5b extends JPanel{
    public static void main(String args[]){
        Question5b panel = new Question5b();
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(panel); 
        window.setSize(350, 350); 
        window.setVisible(true); 
   }
    public void paintComponent(Graphics g) {
        int w = getSize().width /2-10;
        int h = getSize().height/2-10;
        int width = 30;
        int height = 30;
        int counter = 0;
        while(counter <= 10) {
            if (counter % 2 == 0) {
                h = h-10;
                width = width+2*10;
                height = height+2*10;
                g.drawArc(w, h, width, height, 0, -200);
            } else {
                w = w-2*10;
                h = h-10;
                width =width+2*10;
                height = height+2*10;
                g.drawArc(w, h, width, height, 0, 200);
            }
            counter++;
        }
    }
}
