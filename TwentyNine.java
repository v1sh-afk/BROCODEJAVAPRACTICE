package brocodejava;

public class TwentyNine {

	public static void main(String[] args) {
		// overloaded constructors = multiple constructors within a class with the same name,
		//							 but have different parameters
		// 							 name + parameters = signature

//		Pizza pizza = new Pizza("thicc crust", "tomato","cheddar","olives");
		Pizza pizza = new Pizza("thicc crust", "tomato","cheddar");
		System.out.println("Here are the ingredients of your pizza");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
//		System.out.println(pizza.topping);
		
	}

}
class Pizza{
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	Pizza(String bread,String sauce, String cheese){
			
			this.bread = bread;
			this.sauce = sauce;
			this.cheese = cheese;
			
		}
	
	Pizza(String bread,String sauce, String cheese, String topping){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
		
	}
}