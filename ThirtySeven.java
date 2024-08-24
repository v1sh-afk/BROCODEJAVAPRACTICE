package brocodejava;

public class ThirtySeven {

	public static void main(String[] args) {
		// abstract = abstract classes cannot be instantiated, but they can have a subclass 
		//		  	  abstract methods are declared without an implementation
		//		      adding abstract keyword adds a level of security
		//Vehicles vehicle = new Vehicles();
		Carzz car = new Carzz();
		car.go();

	}

}

abstract class Vehicles{ // by using abstract keyword, vehicle cannot be declared abstractly and only the child objects can be created.
	abstract void go(); //Abstract methods do not specify a body
		
	
}

class Carzz extends Vehicles{
	@Override
	void go() {
		System.out.println("The driver is driving car");
	}
}