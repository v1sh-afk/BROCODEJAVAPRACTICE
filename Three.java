package brocodejava;

public class Three {

	public static void main(String[] args) {
		String x = "water";
		String y = "Acid";
		String temp = null;
		
		temp = x;
		x=y;
		y=temp;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}

}
