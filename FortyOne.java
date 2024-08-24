package brocodejava;

public class FortyOne {

	public static void main(String[] args) {
		// interface = a template that can be applied to a class.
		//			   similar to inheritance, but specifies what a class has/must do.
		//			   difference between classes and interface = classes can apply more than one interface, inheritance is limited to 1 super class
		
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		
		Hawk hawk = new Hawk();
		hawk.hunt();
		
		Fish fish = new Fish();
		fish.hunt();
		fish.flee();
	}
}
class Rabbit implements Prey{

	public void flee() {
		System.out.println("The rabbit is fleeing");
	}
}
class Hawk implements Predator{

	public void hunt() {
		System.out.println("The Hawk is hunting");
		
	}
	
}
class Fish implements Prey,Predator{

	public void hunt() {
		System.out.println("The Fish is hunting");	
	}
	public void flee() {
		System.out.println("The Fish is fleeing");	
	}
}