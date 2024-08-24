package brocodejava;

public class TwentyThree {

	public static void main(String[] args) {
		// overload methods = methods that share the same name but have different parameters
		//					  mathod name + parameters = method signature
		//					  parameters = 	number of parameters, data type and the order of parameters can be changed 
		//					  and overload methods can be created with same name but different parameters
		
		int x = add(1,2);
		System.out.println(x);
		
		int y = add(1,2,3);
		System.out.println(y);
		
		int z = add(1,2,3,4);
		System.out.println(z);
		
		double x1 = add(1.1,2.2);
		System.out.println(x1);
		
		double y1 = add(1.1,2.2,3.3);
		System.out.println(y1);
		
		double z1 = add(1.1,2.2,3.3,4.4);
		System.out.println(z1);
	}
	static int add(int a,int b) {
		System.out.println("This is overload method #1");
		return a+b;
	}
	static int add(int a,int b,int c) {
		System.out.println("This is overload method #2");
		return a+b+c;
	}
	static int add(int a,int b,int c, int d) {
		System.out.println("This is overload method #3");
		return a+b+c+d;
	}
	static double add(double a,double b) {
		System.out.println("This is overload method #4");
		return a+b;
	}
	static double add(double a,double b,double c) {
		System.out.println("This is overload method #5");
		return a+b+c;
	}
	static double add(double a,double b,double c, double d) {
		System.out.println("This is overload method #6");
		return a+b+c+d;
	}


}
