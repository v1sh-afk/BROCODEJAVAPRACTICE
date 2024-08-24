package brocodejava;
import java.io.FileWriter;
import java.io.IOException;
public class FortySix {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("C:\\Users\\visha\\eclipse-workspace\\brocodejava\\src\\brocodejava\\secret_message.txt");
			writer.write("This is Secret \nSecret can be Scret ");
			writer.append("\n(Visynthesis)");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
