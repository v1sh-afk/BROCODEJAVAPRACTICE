package brocodejava;

public class TwentySeven {

	public static void main(String[] args) {
		// constructors = a special method that is called when the object is instantiated (created)
		
		Human human1 = new Human("Vishal",21,67.4);
		Human human2 = new Human("Raju",21,47.4);
		
		System.out.println(human1.name);
		System.out.println(human2.name);
		
		human2.eat();
		System.out.println();
		human1.drink();
	}
}
class Human{
	String name;
	int age;
	double weight;
	//constructors
	Human(String name, int age,double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;	
	}
	
	void eat() {
		System.out.printf("%s is eating",this.name);
	}
	void drink() {
		System.out.println(this.name+" is drinking");
	}
}