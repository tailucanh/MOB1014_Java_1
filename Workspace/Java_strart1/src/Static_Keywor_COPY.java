
public class Static_Keywor_COPY {
	//OPP bạn bè
	
	String name;
	static int numberOfFriends;
	//int numberOfFriends;  - bỏ static
	 
	Static_Keywor_COPY(String name){
		this.name = name;
		numberOfFriends++;
	}
	
	//Gọi hàm biến tĩnh Static
	static void displayFriends() {
		System.out.println("Bạn có "+numberOfFriends+" người bạn.");
		
	}
}
