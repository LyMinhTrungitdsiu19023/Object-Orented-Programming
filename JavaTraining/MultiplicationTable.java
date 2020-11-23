

package JavaTraining;

public class MultiplicationTable {
	public static void main(String[] args) {
		
		for(int i = 2; i <= 9; i++) {
			System.out.println("");
			System.out.println("Bang cuu chuong " +i);
			for(int j = 1; j <= 10; j++) {
				System.out.printf("%d x %d = %d %n", i, j, i*j);
			}
		}
	}

}
