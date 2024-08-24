package brocodejava;

public class Seventeen {

	public static void main(String[] args) {
		// String = a reference data type that can store one or more characters
		//		    reference data types have access to useful methods
		String name = "Vishal";
		boolean result = name.equals("Vishal");
		boolean result1 = name.equals("vishal");
		boolean result2 = name.equalsIgnoreCase("vishal");
		
		if (name.equals("  Vishal  ")) {
			System.out.println("True Vishal Real");
		}
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println();
		
		int result3 = name.length();
		System.out.println(result3);
		System.out.println();
		
		char result4 = name.charAt(3);
		System.out.println(result4);
		System.out.println();
		
		int result5 = name.indexOf('a');
		System.out.println(result5);
		System.out.println();
		
		int result6 = name.indexOf('z');
		System.out.println(result6);
		System.out.println();
		
		boolean result7 = name.isEmpty();
		System.out.println(result7);
		System.out.println();
		
		String result8 = name.toUpperCase();
		System.out.println(result8);
		
		String result9 = name.toLowerCase();
		System.out.println(result9);
		System.out.println();
		
		String result10 = name.trim();
		System.out.println(result10);
		System.out.println();
		
		String result11 = name.replace("Vi","Rizz");
		System.out.println(result11);
		
		
		
	}

}
