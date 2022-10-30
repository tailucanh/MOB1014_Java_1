
public class Array_OPP {

	public static void main(String[] args) {
		//Khai báo mảng 
		
		//int[] numbers = new int[3];
		//char[] characeters = new char[5];
		//String[] strings = new String[4];
		
		//Khai báo mảng đối tượng gồm 3 thành phần trong dấu [].
		//Array_OPP_COPY[] foodsRefrigerator = new Array_OPP_COPY[3];  
		//Thêm tên các món ăn
		
		Array_OPP_COPY food1 = new Array_OPP_COPY("pizza");
		Array_OPP_COPY food2 = new Array_OPP_COPY("meet");
		Array_OPP_COPY food3 = new Array_OPP_COPY("fish");
		
		
		//Lưu trữ các món ăn vào tủ lạnh
		
		//foodsRefrigerator[0] = food1;
		//foodsRefrigerator[1] = food2;
		//foodsRefrigerator[2] = food3;
		
		Array_OPP_COPY[] foodsRefrigerator = {food1,food2,food3}; //- cách 2
		
		//Xuất tên các món ăn trong tủ lạnh
		System.out.println(foodsRefrigerator[0].name);
		System.out.println(foodsRefrigerator[1].name);
		System.out.println(foodsRefrigerator[2].name);
		
	}

}
