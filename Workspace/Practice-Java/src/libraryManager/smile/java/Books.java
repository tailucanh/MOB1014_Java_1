package libraryManager.smile.java;

import java.util.Scanner;

public class Books extends Document{

	private String authorName;  //Tác giả
	private int  numberOfPages; //Trang
	

	public Books() {
		
	}
	
	public Books(String id, String manufacturersName, int releaseNumbers,String authorName, int numberOfPages) {
		super(id, manufacturersName, releaseNumbers);
		this.authorName = authorName;
		this.numberOfPages = numberOfPages;
	}
	
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.print("  - Nhập tác giả: ");
		this.authorName = scanner.nextLine();
		System.out.print("  - Nhập số trang: ");
		this.numberOfPages = scanner.nextInt();
	}
	
	public void output() {
		super.output();
		System.out.println("\t - Tác giả: "+authorName);
		System.out.println("\t - Số trang: "+numberOfPages);
		System.out.println("      ---------------------------");
	}
	
	

	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
}






