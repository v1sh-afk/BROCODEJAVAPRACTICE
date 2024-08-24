package brocodejava;

public class ThirtyFive {

	public static void main(String[] args) {
		// method overriding = declaring a method in a subclass
		//					   which is already present in parent class
		// 					   done so that a child class can give its own implementation
		Animal animal = new Animal();
		animal.speak();
		
		Dog dog = new Dog();
		dog.speak();
		
		Cat cat = new Cat();
		cat.speak();
	}

}

class Animal{
	public void speak() {
		System.out.println("The animal is speaking");
	}
}

class Cat extends Animal{
	@Override
	public void speak() {
		System.out.println("The cat says meow");
	}
}
class Dog extends Animal{
	@Override
	public void speak() {
		System.out.println("The dog is barking");
	}
}