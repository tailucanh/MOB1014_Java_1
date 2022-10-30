import java.util.Random;
 
public class randomJav {
		
	//Random random = new Random();
	//int x = random.nextInt(6)+1;
	//double y = random.nextDouble();
	//boolean z = random.nextBoolean();
	//System.out.println(z);
		
	//Con xúc xắc
	int number;  //Biến toàn cục
	Random random; 
	
	randomJav(){
		//Random random = new Random();  //biến cục bộ
		//int number = 0;
		random = new Random();
		roll();
			
	}
	void roll() {   //Phải truyền tham số khi khai báo cục bộ
		number = random.nextInt(6)+1;  //không thể gọi vì number là biến cục bộ
		System.out.println(number);
	
		
	}
		
}
