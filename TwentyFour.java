package brocodejava;

public class TwentyFour {

	public static void main(String[] args) {
		// printf() = optional method to control,format and display test to the console window
		//			two arguments = format string + (object/variable/value)
		//			% [flags] [precision] [width] [conversion-character]
		
		System.out.printf("%s is a format string %d ","vishal",123);
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Vishal";
		int myInt = 50;
		double myDouble = 34589.145246;
		
		//[conversion-character]
		System.out.printf("%b",myBoolean);
		System.out.println();
		System.out.printf("%c",myChar);
		System.out.println();
		System.out.printf("%s",myString);
		System.out.println();
		System.out.printf("%d",myInt);
		System.out.println();
		System.out.printf("%f",myDouble);
		System.out.println();
		//[width]
		// minimum number of characters to be written as output 
		System.out.printf("Hello %10s", myString);
		System.out.println();
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		
		System.out.printf("You have %.2f money left",myDouble);
		System.out.println();
		System.out.printf("You have %f money left",myDouble);
		System.out.println();
		
		//[flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus (+) or minus(-) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping seperator if numbers>1000
		System.out.println();
		System.out.printf("You have %-10f money left",myDouble);
		System.out.println();
		System.out.printf("You have %+f money left",myDouble);
		System.out.println();
		System.out.printf("You have %020f money left",myDouble);
		System.out.println();
		System.out.printf("You have %,f money left",myDouble);

	}

}
