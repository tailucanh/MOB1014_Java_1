package populationManagement.java;

import java.util.Scanner;

public class People {
	
	private String name;
	private String job;
	private int age;
	private int cmnd;
	
	
	public People() {
	
	}
	public People(String name, String job, int age, int cmnd) {
		this.name = name;
		this.job = job;
		this.age = age;
		this.cmnd = cmnd;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		do {
			try {
				System.out.print(" - Nhập tên:  ");
				this.name = scanner.nextLine();
				if (this.name.isEmpty()|| this.name.equals(" ")) {
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
				System.out.print(" - Nhập công việc:  ");
				this.job = scanner.nextLine();
				if (this.job.isEmpty()|| this.job.equals(" ")) {
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
				System.out.print(" - Nhập tuổi:  ");
				
				String assignAge = String.valueOf(this.age);
				assignAge = scanner.nextLine();
				
				String checkAge = "\\d{1,5}";
				
				if (assignAge.isEmpty() || assignAge.equals(" ")) {
					System.out.println("\t  --> Hãy nhập tuổi!");
					check = true;
				}else if (!assignAge.matches(checkAge)) {
					System.out.println("\t  --> Hãy nhập đúng số tuổi!");
					check = true;
				}else if (Double.valueOf(assignAge) < 0 ) {
					System.out.println("\t  --> Tuổi phải lớn hơn 0! Hãy nhập lại!");
					check = true;
				}else{
					check = false;
					this.age = Integer.valueOf(assignAge);
				}
			} catch (Exception e) {
				check = true;
			}
		} while (check);	
			
			
		do {
			try {
				System.out.print(" - Nhập số CMND:  ");
				String assignCmnd = String.valueOf(this.age);
				assignCmnd = scanner.nextLine();
				
				String checkCMND = "\\d{12}";
				
				if (assignCmnd.isEmpty() || assignCmnd.equals(" ")) {
					System.out.println("\t  --> Hãy nhập cmnd!");
					check = true;
				}else if (!assignCmnd.matches(checkCMND)) {
					System.out.println("\t  --> Hãy nhập đúng số cmnd!");
					check = true;
				}else if (Double.valueOf(assignCmnd) < 0 ) {
					System.out.println("\t  --> Cmnd phải lớn hơn 0! Hãy nhập lại!");
					check = true;
				}else{
					check = false;
					this.age = Integer.valueOf(assignCmnd);
				}
			} catch (Exception e) {
				check = true;
			}
		} while (check);	
		

	}
	
	public void output() {
		System.out.println("\t      - Họ tên: "+getName());
		System.out.println("\t      - Tuổi: "+getAge());
		System.out.println("\t      - Nghề nghiệp: "+getJob());
		System.out.println("\t      - Số cmnd: "+getCmnd());
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
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
	
	
	

}
