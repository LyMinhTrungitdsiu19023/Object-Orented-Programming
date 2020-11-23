package OOPlab;

import java.util.Random;
public class Particle {
	private int x_velo, y_velo;
    private int x_box, y_box;
    private Random rng = new Random();
    
    public Particle(int x, int y, Box b) {
        x_velo = x;
        y_velo = y;
        x_box = b.getWidth();
        y_box = b.getHeight();
        
        System.out.printf("\nRandom Particles <%d, %d>", x_velo, y_velo);
    }
    
    public Particle(Box b) {
        x_box = b.getWidth();
        y_box = b.getHeight();
        x_velo = rng.nextInt(x_box);
        y_velo = rng.nextInt(y_box);
        
        System.out.printf("\nRandom Particles <%d, %d>\n", x_velo, y_velo);
    }
    
    public int getX() {return x_velo;}
    public int getY() {return y_velo;}
    
    public void move() {
        int x = rng.nextInt(2) - 1;
        int y = rng.nextInt(2) - 1;
        
        if (x_velo + x >= 0 && x_velo + x <= x_box &&
            y_velo + y >= 0 && y_velo + y <= y_box) {
            x_velo += x;
            y_velo += y;
     
        }
    }
}
