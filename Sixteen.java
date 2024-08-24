package brocodejava;

public class Sixteen {

	public static void main(String[] args) {
		
		// 2D arrays = array of arrays
		
		String[][] cars = new String[3][3];
		
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Ertiga";
		cars[1][0] = "Alto";
		cars[1][1] = "Ritz";
		cars[1][2] = "Nano";
		cars[2][0] = "Carnival";
		cars[2][1] = "Carens";
		cars[2][2] = "Mustang";
		
		for (int i=0; i<cars.length;i++) {
			System.out.println();
			for (int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
			}
		
		String[][] cars1 = {{"Camaro","Corvette","Ertiga"},
							{"Alto","Ritz","Nano"},
							{"Carnival","Carens","Mustang"}};
		
		System.out.println();
		for (int i1=0; i1<cars1.length;i1++) {
			System.out.println();
			for (int j=0;j<cars1[i1].length;j++) {
				System.out.print(cars1[i1][j]+" ");
			}
		}
		
	}

}
}
