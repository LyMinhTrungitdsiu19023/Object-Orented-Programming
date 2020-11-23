package School;

public class Fraction { 
	private int numerator; 
	private int deniminator;
	
	public Fraction(int numerator, int deniminator) {
		this.setNumerator(numerator);
		this.setDeniminator(deniminator);
	}
	
	public Fraction(Fraction fraction1, Fraction fraction2, String operator) {
		
	}
	public String print() {
		return this.getNumerator() +"/"+ this.getDeniminator();
		
	}
	public void normalize() {
		this.setNumerator(this.getNumerator()   / this.UCLN(this.getNumerator(), this.getDeniminator()));
		this.setDeniminator(this.getDeniminator() / this.UCLN(this.getNumerator(), this.getDeniminator()));
	}
	public void add(Fraction fraction1, Fraction fraction2) {
		
	}
	public void sub(Fraction fraction1, Fraction fraction2) {
		
	}
	public void multiply(Fraction fraction1, Fraction fraction2) {
		
	}
	public void divide(Fraction fraction1, Fraction fraction2) {
		
	}
	protected int UCLN(int a, int b) {
		int u = Math.min(a, b); 
		while(u>=1) {
			if(a % u == 0 && b % u == 0) return u; 
			u--;
	}
		return u;
		
	}
	public boolean checkNo() { 
		if(this.UCLN(getNumerator(), getDeniminator()) == 1) return true;
		return false;
		
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDeniminator() {
		return deniminator;
	}

	public void setDeniminator(int deniminator) {
		this.deniminator = deniminator;
	}
	

}
