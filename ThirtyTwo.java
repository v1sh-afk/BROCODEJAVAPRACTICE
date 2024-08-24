package brocodejava;

public class ThirtyTwo {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		Cars car = new Cars("BMW");
		Cars car2 = new Cars("Ertiga");

		garage.park(car);
		garage.park(car2);
		
	}

}

class Cars{
	String name;
	Cars(String name){
		this.name = name;
	}
}

class Garage{
	
	void park(Cars car) {
		System.out.println("The "+car.name+" is parked in the garage");
	}
}