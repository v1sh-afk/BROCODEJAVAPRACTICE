package brocodejava;

public class Thirty {

	public static void main(String[] args) {
		// toString() = special method that all objects inherit,
		//				that returns a string that "textually represents" an object.
		//				can be used both implicitly and explicitly
		
		Caroo car = new Caroo();
		
//		System.out.println(car.make);
//		System.out.println(car.model);
//		System.out.println(car.colour);
//		System.out.println(car.year);
		System.out.println(car); //displays the address of the object, implicitly calls toString() method 
		//the above line is equivalent to 
		System.out.println(car.toString());
		
		//however after method overriding, ie., declaring a method toString in the Car class, the result becomes
		System.out.println(car.toString());

	}

}

