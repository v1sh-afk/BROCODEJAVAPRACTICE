package brocodejava;

public class Forty {

	public static void main(String[] args) {
		//Using Carss from thirtynine
		
		Carss car1 = new Carss("Suzuki","Ertiga",2020);
//		Carss car2 = new Carss("Santro","Xing",2008);
		
		//if we want to copy the values from car1 to car2
//		car2 = car1;
//		car2.copy(car1);
		
		Carss car2 = new Carss(car1);
				
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
	}

}
