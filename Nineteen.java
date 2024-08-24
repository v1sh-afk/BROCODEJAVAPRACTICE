package brocodejava;
import java.util.ArrayList;
public class Nineteen {

	public static void main(String[] args) {
		// ArrayList = resizable array
		//			   Elements can be added and removed after compilation phase
		//			   store reference data types
		// To declare integer array, use wrapper class instead of ArrayList<int> must be ArrayList<Integer>
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("burger");
		food.add("lassi");
		
		food.set(0, "Sushi");
		food.remove(2);
		food.clear();		
		for(int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
		}
		
		
		

	}

}
