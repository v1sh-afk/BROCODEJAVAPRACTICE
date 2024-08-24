package brocodejava;

public class Eleven {

	public static void main(String[] args) {
//		&& = AND : Both conditions must be true
//		|| = OR : either condition must be true
//		! = NOT : reverses boolean value of a condition
		
		int temp = 25;
		
		if (temp>30) {
			System.out.println("It is hot outside");
		}
		else if(temp>=20 && temp<=30) {
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is cold outside");
		}

	}

}
