package Java_Exercise_part1;

public class Bai_4 {

	public static void main(String[] args) {
		System.out.println("\tBảng cửu chương");
		for(int i = 1; i < 10;i++) {
			for(int j =0; j <=10;j++) {
				System.out.printf("\t%2d x %2d = %d \n",i,j,(i*j));
			}
			System.out.println("      _________________");
		} 

	}

}
