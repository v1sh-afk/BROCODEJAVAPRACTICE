package brocodejava;

public class ThirtyThree {

	public static void main(String[] args) {
		// static = modifier. A single copy of a variable/method is created and shared.
		// 			The class "owns" the static member
		
		Friend friend1 = new Friend("Rajul");
		Friend friend2 = new Friend("Sivaraman");
		Friend friend3 = new Friend("Rayappan");
		System.out.println(Friend.numberOrFriends);
		
		Friend.displayFriends();
		
	}

}

class Friend{
	String name;
	static int numberOrFriends;
	Friend(String name){
		this.name = name;
		numberOrFriends++;
	}
	
	static void displayFriends() {
		System.out.println("You have "+numberOrFriends+" friends");
	}
}