package tailaph26495.bai2;

import java.util.Scanner;

public class People {

	private String surName;
	private String name;
	
	public People() {
	
	}
	
	
	public People(String surName, String name) {
		this.surName = surName;
		this.name = name;
	}
	
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("   - Họ: ");
		this.surName = scanner.nextLine();	
		System.out.print("   - Tên: ");
		this.name = scanner.nextLine();
		
		if(this.surName.isEmpty() || this.name.isEmpty()) {
			System.out.println("   --> Hãy nhập họ tên đầy đủ!");
		}
	}
	
	
	
	
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	
	
	
	
}
