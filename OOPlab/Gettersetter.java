package OOPlab;

public class Gettersetter{
	
	private int width; 
	private int height; 
    
    public Gettersetter(int i, int j) {
		// TODO Auto-generated constructor stub
	}


	public int getwidth() {
        return width;
    }
     
   
    public void setwidth(int width) {
        this.width = width; 
        if(width <0) {
        	System.out.print("Error"); 
        	this.width = 1;
        }
    }
     
     
    
    public int getheight() {
        return height;
    }
     
    public void setheight(int height) {
        this.height = height; 
        if(height <0) {
        	System.out.print("Error"); 
        	this.height = 1;

    }
    }
}