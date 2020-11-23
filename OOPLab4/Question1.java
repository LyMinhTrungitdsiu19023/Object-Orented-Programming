package OOPLab4;
import javax.swing.JOptionPane;
public class Question1 {  //NameDialog
	public static void main(String[] args) {
		
		String askname = JOptionPane.showInputDialog("What is your name. Bro?");
		String message = String.format("%s GIAU nhat the gioi", askname); 
		JOptionPane.showMessageDialog(null, message);
	}
} 
