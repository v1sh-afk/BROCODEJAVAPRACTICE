package brocodejava;

public class ThirtyFour {

	public static void main(String[] args) {
		// Inheritance = the process where on class acquires the attributes and methods of another

		Carz car = new Carz();
		car.go();
		
		Bicycle bike = new Bicycle();
		bike.stop();
		
		System.out.println(car.doors); //unique to the car class
		System.out.println(bike.pedals); //unique to the bike class
	}

}

class Vehicle{
	double speed;
	
	void go() {
		System.out.println("This vehicle is moving");
	}
	
	void stop() {
		System.out.println("This vehicle has stopped");
	}
}

class Carz extends Vehicle{
	int wheels = 4;
	int doors = 4;
}

class Bicycle extends Vehicle{
	int wheels = 2;
	int pedals = 2;
	
}





