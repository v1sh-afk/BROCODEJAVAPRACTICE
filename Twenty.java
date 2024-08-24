package brocodejava;
import java.util.*;
public class Twenty {

	public static void main(String[] args) {
		
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("Pasta");
		bakeryList.add("Garlic Bread");
		bakeryList.add("Donuts");
		
		System.out.println(bakeryList);
		System.out.println(bakeryList.get(0));
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("Tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		System.out.println(produceList);
		System.out.println(produceList.get(0));
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(0));
		System.out.println(groceryList.get(0).get(0));

	}

}
