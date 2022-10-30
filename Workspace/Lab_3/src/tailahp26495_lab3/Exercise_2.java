package tailahp26495_lab3;

public class Exercise_2 {

	public static void main(String[] args) {
		System.out.println("\tBảng cửu chương");
		System.out.println("\t+---------------+");
		for(int i = 1; i <= 10;i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("\t  %2d x %d = %d  \n",i,j,i*j);
			}
			System.out.println("\t --------------");
		}
		

	}

}
