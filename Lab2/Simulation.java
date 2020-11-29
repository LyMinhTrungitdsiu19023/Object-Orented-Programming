package OOPlab2;

public class Simulation {
	private Box box;
	private Particle[] P = new Particle[500];
	private int count; 
	    
    public Simulation() {
    	box = new Box(30, 11);
	        
        count = 0;
        while (count < 3) {
            P[count] = new Particle(box);
            count++;
        }
    }
	    
    public int getParticleCount() {return count;}
	    
    public void move() {
        for (int i = 0; i < count; i++) {
            P[i].move();
        }
	        
        boolean part[][] = new boolean[box.getWidth() + 1][box.getHeight() + 1];
        boolean collide = false;
        for (int i = 0; i < count; i++) {
            int x = P[i].getX();
            int y = P[i].getY();
            if (part[x][y]) {collide = true; break;}
            part[x][y] = true;
        }
	        
        if (collide && count < 500) {
            P[count] = new Particle(box);
            count++;
        }
    }
	    
    public void visualize() {
        int w = box.getWidth();
        int h = box.getHeight(); 
        int numberofp = 0;
        boolean part[][] = new boolean[w + 1][h + 1];
        for (int i = 0; i < count; i++) {
            int x = P[i].getX();
            int y = P[i].getY();
            part[x][y] = true;
        }
	        
        System.out.println("\nVisualization and the new position of Particles: ");
        
	        
        for (int i = -1; i <= h+1; i++) {
        	if (i == -1 || i == h+1) {
                for (int j = -1; j <= w+1; j++) {
                    System.out.print("-");
                }
                System.out.println();
            } else {
                System.out.print("|");
                for (int j = 0; j <= w; j++) {
                    if (part[j][i]) {
                        System.out.print("*");
                        numberofp++;
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("|");
            }
        }
        System.out.println("=> The number of particles: " +numberofp); 
        System.out.println("__________________________________");
    }
    

}
