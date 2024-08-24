package brocodejava;
import java.io.File;
public class FortyFive {

	public static void main(String[] args) {
		// file = abstract representation of file and directory pathnames
		
		File file = new File("C:\\Users\\visha\\eclipse-workspace\\brocodejava\\src\\brocodejava\\secret_message.txt");
		if (file.exists()) {
			System.out.println("That file exists");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			//file.delete(); 
		}
		else {
			System.out.println("That file doesnt exist");
		}

	}

}
