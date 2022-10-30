package libraryManager.smile.java;

import java.util.Scanner;

public class Newspaper extends Document{

	private int releaseDate;

	
	public Newspaper() {
		
	}

	public Newspaper(String id, String manufacturersName, int releaseNumbers, int releaseDate) {
		super(id, manufacturersName, releaseNumbers);
		this.releaseDate = releaseDate;
	}
	
	
	
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.print("  - Nhập ngày phát hành: ");
		this.releaseDate = scanner.nextInt();
	}
	
	public void output() {
		super.output();
		System.out.println("\t - Ngày phát hành: "+releaseDate);
		System.out.println("      ---------------------------");
	}
	
	
	

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	
	
	
}
