package hotelManager.java;

import java.util.Scanner;

public class Information {
	private int dateOfHire;
	private int classify;
	private String name;
	private int age;
	private int cmnd;
	
	
	public Information() {
		super();
	}
	
	
	public Information(int dateOfHire, int classify, String name, int age, int cmnd) {
		super();
		this.dateOfHire = dateOfHire;
		this.classify = classify;
		this.name = name;
		this.age = age;
		this.cmnd = cmnd;
	}


	public void input(Scanner scanner) {
		boolean check = false;
		
		try {
			System.out.println("\t    *---Phân loại phòng---* ");
			System.out.println("\t1. Loại A.\n\t2. loại B.\n\t3. Loại C.\n ( Bấm ENTER để kết thúc.)");
			
			do {
				try {
					System.out.print("\t - Nhập loại phòng: "); 
					String assClassify = String.valueOf(this.classify);
					assClassify = scanner.nextLine();
					
					String checkAge = "\\d{1,50}";
					
					if (assClassify.isEmpty() || assClassify.equals(" ")) {
						System.out.println("\t  --> Hãy nhập loại!");
						check = true;
					}else if (!assClassify.matches(checkAge)) {
						System.out.println("\t  --> Hãy nhập đúng số loại!");
						check = true;
					}else if (Double.valueOf(assClassify) < 0 || Double.valueOf(assClassify) > 3) {
						System.out.println("\t  --> Loại phải > 0 và < 3! Hãy nhập lại!");
						check = true;
					}else{
						check = false;
						this.classify = Integer.valueOf(assClassify);
					}
				} catch (Exception e) {
					check = true;
				}
			} while (check);
			
			
			
		} catch (Exception e) {
			System.out.println("\t  --> Bạn đã nhập sai dữ liệu!");
		}
		do {
			try {
				System.out.print("\t - Nhập ngày ở: "); 
				String assDate = String.valueOf(this.dateOfHire);
				assDate = scanner.nextLine();
				
				String checkDate = "\\d{1,50}";
				
				if (assDate.isEmpty() || assDate.equals(" ")) {
					System.out.println("\t  --> Hãy nhập số ngày!");
					check = true;
				}else if (!assDate.matches(checkDate)) {
					System.out.println("\t  --> Hãy nhập đúng số ngày!");
					check = true;
				}else if (Double.valueOf(assDate) < 0 ) {
					System.out.println("\t  --> Ngày phải lớn hơn 0! Hãy nhập lại!");
					check = true;
				}else{
					check = false;
					this.dateOfHire = Integer.valueOf(assDate);
				}
			} catch (Exception e) {
				check = true;
			}
		} while (check);
				
		do {
			try {
				System.out.print("\t - Nhập tên: ");
				this.name = scanner.nextLine();
				if (this.name.isEmpty() || this.name.equals(" ")) {
					System.out.println("\t  --> Hãy nhập tên!");
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
				System.out.print("\t - Nhập tuổi: "); 
				String assAge = String.valueOf(this.age);
				assAge = scanner.nextLine();
				
				String checkAge = "\\d{1,50}";
				
				if (assAge.isEmpty() || assAge.equals(" ")) {
					System.out.println("\t  --> Hãy nhập tuổi!");
					check = true;
				}else if (!assAge.matches(checkAge)) {
					System.out.println("\t  --> Hãy nhập đúng số tuổi!");
					check = true;
				}else if (Double.valueOf(assAge) < 0 ) {
					System.out.println("\t  --> Tuổi phải lớn hơn 0! Hãy nhập lại!");
					check = true;
				}else{
					check = false;
					this.age = Integer.valueOf(assAge);
				}
			} catch (Exception e) {
				check = true;
			}
		} while (check);
		
		
		do {
			try {
				System.out.print("\t - Nhập cmnd: "); 
				String assCmnd = String.valueOf(this.cmnd);
				assCmnd = scanner.nextLine();
	
					
				if (assCmnd.isEmpty() || assCmnd.equals(" ")) {
					System.out.println("\t  --> Hãy nhập CMND!");
					check = true;
				}else if (Integer.valueOf(assCmnd) < 0 ) {
					System.out.println("\t  --> CMND phải lớn hơn 0! Hãy nhập lại!");
					check = true;
				}else{
					check = false;
					this.cmnd = Integer.valueOf(assCmnd);
				}
			} catch (Exception e) {
				check = true;
			}
		} while (check);
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	
	public int getDateOfHire() {
		return dateOfHire;
	}

	public void setDateOfHire(int dateOfHire) {
		this.dateOfHire = dateOfHire;
	}
	public int getClassify() {
		return classify;
	}
	public void setClassify(int classify) {
		this.classify = classify;
	}
	
	
	
}
