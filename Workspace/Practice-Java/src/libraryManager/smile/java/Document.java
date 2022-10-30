package libraryManager.smile.java;

import java.util.Scanner;

public class Document {

	private String id;
	private String manufacturersName; //Nhà sx
	private int releaseNumbers;    //Số bản phát hành
	
	
	public Document() {
		
	}

	public Document(String id, String manufacturersName, int releaseNumbers) {

		this.id = id;
		this.manufacturersName = manufacturersName;
		this.releaseNumbers = releaseNumbers;
	}
	
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("  - Nhập ID: ");
		this.id = scanner.nextLine();
		System.out.print("  - Nhập tên nhà Sx: ");
		this.manufacturersName = scanner.nextLine();
		System.out.print("  - Nhập số bản phát hành: ");
		this.releaseNumbers = scanner.nextInt();
		
	}
	
	public void output() {
		System.out.println("\t - ID: "+id);
		System.out.println("\t - Nhà SX: "+manufacturersName);
		System.out.println("\t - Số bản: "+releaseNumbers);
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getManufacturersName() {
		return manufacturersName;
	}
	public void setManufacturersName(String manufacturersName) {
		this.manufacturersName = manufacturersName;
	}
	public int getReleaseNumbers() {
		return releaseNumbers;
	}
	public void setReleaseNumbers(int releaseNumbers) {
		this.releaseNumbers = releaseNumbers;
	}
	
	
	

}
