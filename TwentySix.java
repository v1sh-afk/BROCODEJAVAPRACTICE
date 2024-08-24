package brocodejava;

public class TwentySix {

	public static void main(String[] args) {
		
		// object = an instance of a class that may contain attributes and methods
		// example: phone, desk, computer, coffee cup
		
		Caroo myCar1 = new Caroo();
		Caroo myCar2 = new Caroo();
		
		System.out.println(myCar1.model);
		System.out.println(myCar1.make);
		System.out.println();
		System.out.println(myCar2.model);
		System.out.println(myCar2.make);
		
		myCar1.drive();
		myCar1.brake();

	}

}


