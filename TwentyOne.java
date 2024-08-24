package brocodejava;

import java.util.ArrayList;

public class TwentyOne {

	public static void main(String[] args) {
		
		//String[] animals = {"cat","dog","rat","bird"};
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("dog");
		animals.add("cat");
		animals.add("rat");
		animals.add("bird");
		for(String i : animals) {
			System.out.println(i);
		}
		
	}

}
