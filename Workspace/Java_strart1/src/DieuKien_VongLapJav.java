import java.util.ArrayList;
import java.util.Scanner;

public class DieuKien_VongLapJav {

	public static void main(String[] args) {
		//if - else  or switch case
		Scanner scanner = new Scanner(System.in);
		
		//--------------------Điều kiện---------------//
		/*
		System.out.print("Nhap so tuoi cua ban:");
		int age = scanner.nextInt();
		
		
		if(age >= 18 && age <= 60) {
			System.out.println("Ban da truong thanh.");
			
		}else if(age > 0 && age <18) {
			System.out.println("Ban la con nit.");		
		}else if(age > 60) {
			System.out.println("Ban da gia.");
		}else {
			System.out.println("Ban chua duoc sinh ra.");
		}
		
		
		int days;
		do {
			System.out.print("Nhap tu 2-->8: ");
			days = scanner.nextInt();
			
			switch (days) {
				case 2: 
					System.out.println("Monday");
					break;
				case 3: 
					System.out.println("Tuesday");
					break;
				case 4: 
					System.out.println("Wednesday");
					break;
				case 5: 
					System.out.println("Thursday");	
					break;
				case 6: 
					System.out.println("Friday");
					break;
				case 7: 
					System.out.println("Saturday");
					break;
				case 8: 
					System.out.println("Sunday");		
					break;
				default:
					System.err.println("Ban da nhap sai.");
					break;
			}
			
		}while(days < 2);
		*/
		//-----------------------Vòng lặp----------------
		for(int i = 0; i< 3;i++) {
			System.out.println("Smile");
		}
		//-----------------------Vòng lặp For lồng----------------
		/*
		String kitu = "" ;
		System.out.print("Nhap so hang: ");
		int hang = scanner.nextInt();
		System.out.print("Nhap so cot: ");
		int cot = scanner.nextInt();
		System.out.print("Nhap ki tu:");
		kitu = scanner.next();
		
		for(int i = 1; i<= hang;i++) {
			System.out.println();
			for(int j = 1; j <= cot;j++) {
				System.out.print(kitu);
			}
		}
		*/
		//-----------------------Vòng lặp For nâng cao----------------
		//Dùng ngắn hơn nhưng kém linh hoạt
		String[] animals = {"cat","dog","bird","pig"};
		
		for(String  i : animals) {
			System.out.println(i);
		}
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("meet");
		food.add("pizza");
		food.add("hotdog");
		food.add("hambuger");
		for(String  i : food) {
			System.out.println(i);
		}
		
		
	}

}
