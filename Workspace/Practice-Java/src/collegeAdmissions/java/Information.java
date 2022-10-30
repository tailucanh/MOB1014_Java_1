package collegeAdmissions.java;

import java.util.Scanner;

public class Information {

	
	private String id;
	private String fullName;
	private String address;
	private String priority;
	private String examBlock;
	

	public Information() {
		
	}
	
	public Information(String id, String fullName, String address, String priority,	 String examBlock) {
		this.id = id;
		this.fullName = fullName;
		this.address = address;
		this.priority = priority;
		this.examBlock = examBlock;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		do {
			try {
				System.out.print("\t - Nhập số báo danh: ");
				this.id = scanner.nextLine();
				if (this.id.isEmpty() || this.id.equals(" ")) {
					System.out.println("     --> Hãy nhập số báo danh!");
					check = true;
				}else {
					check = false;
				}
			} catch (Exception e) {
				check = true;
			}
			
		} while (check);
		
		do {
			try {
				System.out.print("\t - Nhập tên: ");
				this.fullName = scanner.nextLine();
				if (this.fullName.isEmpty() || this.fullName.equals(" ")) {
					System.out.println("     --> Hãy nhập tên!");
					check = true;
				}else {
					check = false;
				}
			} catch (Exception e) {
				check = true;
			}
			
		} while (check);

		
		
		do {
			try {
				
				System.out.print("\t - Nhập địa chỉ: ");
				this.address = scanner.nextLine();
				
				if (this.address.isEmpty() || this.address.equals(" ")) {
					System.out.println("     --> Hãy nhập địa chỉ!");
					check = true;
				}else {
					check = false;
				}
			} catch (Exception e) {
				check = true;
			}
			
		} while (check);

		
			
		do {
			try {
				
				System.out.print("\t - Nhập mức ưu tiên: ");
				this.priority = scanner.nextLine();
				
				if (this.address.isEmpty() || this.address.equals(" ")) {
					System.out.println("     --> Hãy nhập mức ưu tiên!");
					check = true;
				}else {
					check = false;
				}
			} catch (Exception e) {
				check = true;
			}
			
		} while (check);

			
	}
	
	public void output() {
		System.out.println("\t  - Số báo danh: "+id);
		System.out.println("\t  - Tên: "+fullName);
		System.out.println("\t  - Địa chỉ: "+address);
		System.out.println("\t  - Khối thi: "+examBlock);
		System.out.println("\t  - Mức ưu tiên: "+priority);
		System.out.println("     -----------------------------");
		
	}
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getExamBlock() {
		return examBlock;
	}
	public void setExamBlock(String examBlock) {
		this.examBlock = examBlock;
	}
	

	
}




