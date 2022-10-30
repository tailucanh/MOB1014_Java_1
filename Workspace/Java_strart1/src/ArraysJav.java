import java.util.ArrayList;

public class ArraysJav {

	public static void main(String[] args) {
		
		//---------Mảng 1 chiều--------------//
		//String[] food = {"meet", "fish", "chicken"};
		/*
		String[] food = new String[3];
		
		food[0] = "meet";
		food[1] = "fish";
		food[2] = "chiken";
		
		for(int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		*/
		
		//---------Mảng 2 chiều 2D--------------//
		/*
		String[][] cars = new String[2][2];
		
		cars[0][0] = "Lamboo";
		cars[0][1] = "Tesla";
		
		cars[1][0] = "Camaro";
		cars[1][1] = "F-150";
	
		
		for(int i  = 0; i < cars.length; i++) {
			for(int j =0; j < cars[i].length;j++) {
				System.out.println(cars[i][j]);
			}
		}
		*/
		
		//---------Mảng danh sách ArrayList--------------//
		
		//Dùng tham chiếu nguyên thuỷ String, Integer , Boolean ...
		
		/*
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("meet");
		food.add("pizza");
		food.add("hotdog");
		food.add("hambuger");
		
		food.set(0, "sushi"); //Thay thế phần tử
		food.remove(2);  //Xoá 1 phàn tử nào đó
		food.clear(); // Xoá hết
		
		for (int i = 0; i< food.size();i++) {
			System.out.println(food.get(i));
		}
		*/
		//---------Mảng danh sách ArrayList 2D--------------//
		
		ArrayList<ArrayList<String>> listFood = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> moneys = new ArrayList<String>();
		moneys.add("dola");
		moneys.add("dong");
		moneys.add("bangAnh");
		
		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("soda");
		drinks.add("coca");
		drinks.add("phanta");
		
		ArrayList<String> foods = new ArrayList<String>();
		foods.add("pizza");
		foods.add("rice");
		foods.add("noodle");
		
		listFood.add(moneys);
		listFood.add(drinks);
		listFood.add(foods);
		
		//Dung .get để truy suất từng phần tử nếu muốn
		System.out.println(listFood.get(1).get(2));
		
	}

}
