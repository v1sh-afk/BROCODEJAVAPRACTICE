package brocodejava;

public class Eighteen {

	public static void main(String[] args) {
		// wrapper class = provides a way to use primitive data types as reference data types
		//                 reference data types contain useful methods
		//                 can be used with collections

		// autoboxing = the automatic conversion that the java compiler makes between the primitive types 
		//              and their corresponding object wrapper classes
		// unboxing = the reverse of autoboxing. Automatic converstion of wrapper class to primitive type
		
		//autoboxing
		Boolean a = true;
		Character b = '@';
		Integer c = 1234;
		Double d = 3.14;
		String e = "Vishal";
		
		//unboxing
		if (a == true) {
			System.out.println("This is true");
		}
		
	}

}
