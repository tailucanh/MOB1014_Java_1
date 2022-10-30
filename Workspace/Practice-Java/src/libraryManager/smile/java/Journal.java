package libraryManager.smile.java;

import java.util.Scanner;

public class Journal extends Document{

	private String issueNumber; //Số phát hành
	private int releaseMonth;  
	
	
	public Journal() {
		
	}
	public Journal(String id, String manufacturersName, int releaseNumbers,String issueNumber, int releaseMonth) {
		super(id, manufacturersName, releaseNumbers);
		this.issueNumber = issueNumber;
		this.releaseMonth = releaseMonth;
	}
	
	
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.print("  - Nhập số phát hành: ");
		this.issueNumber = scanner.nextLine();
		System.out.print("  - Nhập tháng phát hành: ");
		this.releaseMonth = scanner.nextInt();
	}
	

	
	public void output() {
		super.output();
		System.out.println("\t - Số phát hành: "+issueNumber);
		System.out.println("\t - Tháng phát hành: "+releaseMonth);
		System.out.println("      ---------------------------");
	}
	
	
	
	public String getIssueNumber() {
		return issueNumber;
	}
	public void setIssueNumber(String issueNumber) {
		this.issueNumber = issueNumber;
	}
	public int getReleaseMonth() {
		return releaseMonth;
	}
	public void setReleaseMonth(int releaseMonth) {
		this.releaseMonth = releaseMonth;
	}  
	
	

}




