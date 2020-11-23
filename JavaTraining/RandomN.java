package JavaTraining;
import java.util.Random;
public class RandomN {
	public static void main(String[] args) {
		Random ran = new Random();
		int n = 0 + ran.nextInt(6);
		
		System.out.println(n);

	}
}
