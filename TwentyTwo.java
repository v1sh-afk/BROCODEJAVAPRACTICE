package brocodejava;

public class TwentyTwo {

	public static void main(String[] args) {
		// method = block of code which is executed whenever it is called upon
		String name = "Vishal";
		int age = 21;
		
		hello(name,age);
		

	}
	
	static void hello(String name, int age) {
		System.out.println("Hello "+name);
		System.out.println("Your are "+age);
		
	}

}
