package brocodejava;
import java.util.Scanner;
public class Twelve {

	public static void main(String[] args) {
		// as long as the condition is true
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
//		while(name.isBlank()) {
//			System.out.println("Enter your name: ");
//			name = scanner.nextLine();
//		}
		
		do {
			System.out.println("Enter your name:");
			name = scanner.nextLine();
		} while (name.isBlank());
		
		
		System.out.println("Hello "+name);

	}

}
