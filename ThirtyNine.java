package brocodejava;

public class ThirtyNine {

	public static void main(String[] args) {
		// encapsulation = attributes of a class will be hidden or private,
		//	   			   can be accessed only through methods (getters and setters)
		//				   You should make attributes private if you don't have a reason to make them public/protected
		
		Carss car = new Carss("Ertiga","Suzuku",2020);
			
//		car.year = 2022;
		car.setYear(2022);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());	
	}
}
class Carss{
	private String make;
	private String model;
	private int year;
	
	Carss(String make,String model, int year){
//		this.make = make;
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	//Overloaded constructors
	Carss(Carss x){
		this.copy(x);
	}
	
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void copy(Carss x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear()) ;
	}
	
}