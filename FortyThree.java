package brocodejava;
import java.util.*;
public class FortyThree {

	public static void main(String[] args) {
		//polymorphism = many forms
		// dynamic = after compilation, during runtime
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("What animal do u want?");
		String choice = scanner.next();
		System.out.println(choice);
		if (choice.equals("dog")) {  //using == will check for the memory values also hence would return false
			animal = new Dog();
			animal.speak();
		}
		else if(choice.equals("cat")) { //therefore using .equals() is suitable in this case as it checks for the values only
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			animal.speak();
		}
		
	}

}
