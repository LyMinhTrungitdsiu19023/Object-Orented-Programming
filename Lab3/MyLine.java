package OOPLab3;


import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JComponent;
import javax.swing.JFrame;

class Testline extends JComponent {
    private int x, y;

    public Testline() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Drawing Line");
        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("y: ");
        y = scanner.nextInt();
        scanner.close();
    }

    public void paint(Graphics g) {
        g.drawLine(20, 20, x, y);

    }
}

public class MyLine {
    public void drawline() {
        JFrame window = new JFrame();
        window.setBounds(40, 40, 300, 300);
        window.getContentPane().add(new Testline());
        window.setVisible(true);
    }
}


