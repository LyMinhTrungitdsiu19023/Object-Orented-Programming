package OOPLab3;

public class MyTriangle {
	  private MyPoint a;
	  private MyPoint b;
	  private MyPoint c;
	  private double d1;
	  private double d2;
	  private double d3;


	  public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
	    a = new MyPoint(x1, y1);
	    b = new MyPoint(x2, y2);
	    c = new MyPoint(x3, y3);
	    d1 = a.getDistance(b);
	    d2 = b.getDistance(c);
	    d3 = c.getDistance(c);
	  }

	  public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
	    this.a = v1;
	    this.b = v2;
	    this.c = v3;
	    d1 = v1.getDistance(v2);
	    d2 = v1.getDistance(v3);
	    d3 = v2.getDistance(v3);
	  }

	  public String toString() {
	    return String.format("MyTriangle A(%d, %d), B(%d, %d), C(%d, %d)]", a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY());
	  }

	  public double getPeri() {
	    return  d1 + d2 + d3;
	  }

	  public String getTypeTri() {
	    if (d1 == d2 && d2 == d3)
	      return "Your Triangle is Equilateral";
	    else if (d1 == d2 || d1 == d3 || d2 == d3) 
	      return "Your Triangle is Isosceles";
	    else 
	      return "Your Triangle is Scalene";
	  }
	}
