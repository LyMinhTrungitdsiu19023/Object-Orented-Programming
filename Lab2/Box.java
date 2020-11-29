package OOPlab2;

public class Box {
	private int width, height;
    
	public Box(int w, int h) {
		width = w;
		height = h;
    
		System.out.printf("Box with <%d> in width and <%d> in height\n", width, height);
		System.out.printf("\n3 Random Particles");
	}	

	public int getWidth() {return width;}
	public int getHeight() {return height;}

}
