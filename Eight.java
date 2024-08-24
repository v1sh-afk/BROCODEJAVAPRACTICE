package brocodejava;
import java.util.Random;
public class Eight {

	public static void main(String[] args) {
		
		Random random = new Random();
		
//		int x = random.nextInt(); (Result will be in the range -2billion to positive 2billion)
//		int x = random.nextInt(6)+1;
		
//		double y = random.nextDouble(); (Random value between 0 and 1)
		boolean z = random.nextBoolean();
		
		System.out.println(z);
	}

}
