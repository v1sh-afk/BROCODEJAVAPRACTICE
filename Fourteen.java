package brocodejava;
import java.util.Scanner;
public class Fourteen {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter number of rows");
		rows = scanner.nextInt();
		
		System.out.println("Enter number of cols");
		columns = scanner.nextInt();
		
		System.out.println("Enter the symbol");
		symbol = scanner.next();
		
		for (int i=1;i<=rows;i++) {
			System.out.println();
			for (int j=1;j<=columns;j++) {
				System.out.print(symbol);
			}
		}
		
	}

}
