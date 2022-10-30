
public class Phuongthuc_methodJav {

	public static void main(String[] args) {
		// Tương tự hàm
		/*
		String name = "Smile";
		int age = 18;
		hello(name,age);
		
		int x = 2;
		int y = 6;
		
		System.out.println("X * Y = "+tong(x, y));
		*/
		//hàm quá tải - Có thể dùng chung tên hàm nhưng các tham số phải khác nhau
		 
	
		System.out.println("Tong = "+ add(4.5,6,5,3,7));
		
	}
	
	//Truyền tham số 
	/*
	static void hello(String name, int age) {
		System.out.println("Heloo "+name);
		System.out.println("Toi "+age+" tuoi");
	}
	
	static int tong(int a, int b) {
		return a *b;
	}
	*/
	static int add(int a, int b) {
		System.out.println("Add 1.");
		return a + b;
	}
	static int add(int a, int b,int c) {
		System.out.println("Add 2.");
		return a + b + c;
	}
	static int add(int a, int b,int c,int d) {
		System.out.println("Add 3.");
		return a + b + c + d;
	}
	static double add(double a, double b,double c,double d,double e) {
		System.out.println("Add 4.");
		return a + b + c + d + e;
	}
	
	
}
