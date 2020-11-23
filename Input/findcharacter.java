package Input;
import java.util.Scanner;
public class findcharacter {
	public static void main(String[] args) {
		String chuoi;
		char character = 0; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string:"); 
		chuoi = scanner.nextLine(); 
		
		for(int i=0; i < chuoi.length(); i++) {   //chay ham for để đếm các character có trong string
			character = chuoi.charAt(i);          // tìm được character
		System.out.println(character);            // in charater ra từng cái
	}
	}
	}
