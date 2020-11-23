package OOPLab4;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class Question3b extends JPanel { 
    public static void main(String args[]){
        Question3b panel = new Question3b();
        JFrame window = new JFrame("Question 3b");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(panel); 
        window.setSize(350, 350); 
        window.setVisible(true); 
   }  
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth(); 
        int height = getHeight(); 

        for(int i = 0; i<=350; i+=30) {
        	g.drawLine(0 , 0, i, ((-height/width)*i+height));
        } 
        for(int i = 0; i<=350; i+=30) {
        	g.drawLine(width , height, i, ((-height/width)*i+height));
        } 
        for(int i = 0; i<=350; i+=30) {
        	g.drawLine(0 , height, i, ((height/width)*i));
        }
        for(int i = 0; i<=350; i+=30) {
        	g.drawLine(width , 0, i, ((height/width)*i));
        }
} 
}
// Thay nho chinh chinh cai khung, keo ra keo vao no moi ra dung de nha thay
