package tailaph26495.bai1;

import java.util.Scanner;

public class StringAPI {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Nhập họ và tên: ");
		String fullName = scanner.nextLine();
		
		fullName.trim();
		
		String surName = fullName.substring(0, fullName.indexOf(" "));
		String middleName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
		String lastName = fullName.substring(fullName.lastIndexOf(" "));
		
		
		System.out.println(" Họ và tên sau khi thay đổi: "+surName.toUpperCase()+" "+middleName+" "+lastName.toUpperCase());
		
		
		
	}

}
