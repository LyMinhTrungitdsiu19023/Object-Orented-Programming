package OOPlab2;

public class ParticleSimulation {
	public static void main(String[] args) {
		
		 Simulation s = new Simulation();  
	      for (int i = 0; i < 40; i++) {
	            s.move();
	            s.visualize();
	        }

	}

}
