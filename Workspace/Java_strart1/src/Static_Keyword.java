
public class Static_Keyword {

	public static void main(String[] args) {
		// Static là từ khoá có thể áp dụng cho biến,phương thức hay các lớp
		//là một bản sao được tạo và chia sẻ mọi nơi
		//Tất cả các biến, hàm ... trong Static gọi là Static member - Thành viên tĩnh
		
		Static_Keywor_COPY friend1 = new Static_Keywor_COPY("Smile");
		Static_Keywor_COPY friend2 = new Static_Keywor_COPY("Boll");
		Static_Keywor_COPY friend3 = new Static_Keywor_COPY("Tiel");
		Static_Keywor_COPY friend4 = new Static_Keywor_COPY("Snada");
		
		
		//Đếm số lượng bạn bè- không nên dùng
		//System.out.println(Static_Keywor_COPY.numberOfFriends);  
		
		//Bỏ static của OPP
		//System.out.println(Static_Keywor_COPY.numberOfFriends); //Báo lỗi
		//System.out.println(friend1.numberOfFriends);  //Chỉ hiện số phần tử của 1 đối tượng
		
		//Gọi hàm tĩnh để đếm số lượng
		Static_Keywor_COPY.displayFriends();
		
		
		
	}
}
