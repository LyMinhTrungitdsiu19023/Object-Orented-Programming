package School;

public class Main2 {
	public static void main(String[] args) {
		Fraction fraction1 = new Fraction(5,6);
		Fraction fraction2 = new Fraction(3,12);
		
		//System.out.println(fraction2.print()); 
		/*if(fraction2.checkNo() == true) {
			System.out.println(fraction2.print() + " Toi gian");
		}
		else {
			System.out.println(fraction2.print() + " Khong toi gian");
		}**/
		fraction2.normalize();
		System.out.println(fraction2);
		//System.out.print(fraction1.UCLN(3, 9));
	}

}
