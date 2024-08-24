package brocodejava;

public class Fifteen {

	public static void main(String[] args) {
		
		String[] cars = {"Camaro","Tesla","Santro"};
		int[] numbers = {1,2,3,4};
		cars[0] = "Mustang";
		System.out.println(cars[0]);
		System.out.println(numbers[3]);
		
		
		String[] arr = new String[3];
		
		arr[0] = "Ertiga";
		arr[1] = "Luxus";
		arr[2] = "Carens";
		
		System.out.println(arr[0]);
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
