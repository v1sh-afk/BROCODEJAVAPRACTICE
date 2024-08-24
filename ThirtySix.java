package brocodejava;

public class ThirtySix {

	public static void main(String[] args) {
		// super = keyword refers to the superclass (parent) of an object.
		//		   very similar to the "this" keyword.
		
		Hero hero1 = new Hero("Batman",42,"$$$");
		Hero hero2 = new Hero("Shaktimaan",75,"infinity");
		
		System.out.println(hero1.name);
		System.out.println(hero1.age);
		System.out.println(hero1.power);
		System.out.println();
		System.out.println(hero2.toString());
		System.out.println(hero1.toString());
	}
}

class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() { //why are we using public here? 
		return this.name + "\n" + this.age + "\n";
	}
	
}

class Hero extends Person{
	String power;
	Hero(String name, int age, String power){
		super(name,age);
		this.power=power;
	}
	
	public String toString() { //why are we using public here? 
		return super.toString() +  this.power + "\n";
	}
}