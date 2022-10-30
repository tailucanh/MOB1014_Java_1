package polymorphism_dynamic_DaHinhDong;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//polymorphism - đa dạng
		// dynamic - lập trình sau giai đoạn biên dịch (trong tg chạy)
		//Ví dụ: Xe Lambo có nhiều hình dạng: là xe lambo, là xe hơi, là phương tiện hay là 1 đối tượng
		
		Scanner scaner = new Scanner(System.in);
		Animals animal;
		
		System.out.println("What animal do you want? ");
		System.out.print("(1-Dog) or (2-Cat): ");
		int count = scaner.nextInt();
		
		if(count == 1) {
			animal = new Dog();
			animal.speek();
		}else if(count == 2) {
			animal = new Cat();
			animal.speek();
		}else {
			animal = new Animals();
			System.out.println("Ban da chon sai doi tương");
			animal.speek();
		}
		
		
		
	}

}
