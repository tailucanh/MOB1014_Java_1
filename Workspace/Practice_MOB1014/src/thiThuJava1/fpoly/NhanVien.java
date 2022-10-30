package thiThuJava1.fpoly;

import java.util.Scanner;

public class NhanVien {

	private String id;
	private String name;
	private String nganh;
	
	
	
	
	public NhanVien() {
		
	}

	public NhanVien(String id, String name, String nganh) {
		this.id = id;
		this.name = name;
		this.nganh = nganh;
	}
	
	public void input(Scanner scanner) {
		try {
			boolean check = false;
			do {
				try {
					System.out.print("\t - Nhập id:");
					this.id = scanner.nextLine();
					if (this.id.isEmpty() || this.id.equals(" ")) {
						System.out.println("\t -> Hãy nhập id!");
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
					System.out.print("\t - Nhập tên:");
					this.name = scanner.nextLine();
					if (this.name.isEmpty() || this.name.equals(" ")) {
						System.out.println("\t -> Hãy nhập tên!");
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
					System.out.print("\t - Nhập ngành:");
					this.nganh = scanner.nextLine();
					if (this.nganh.isEmpty() || this.nganh.equals(" ")) {
						System.out.println("\t -> Hãy nhập ngành!");
						check = true;
					}else {
						check = false;
					}
				} catch (Exception e) {
					check = true;
				}
				
			} while (check);
			
			
		} catch (Exception e) {
			System.out.println(" \t -->  Lỗi dữ liệu!");
		}

	}
	


	public void inThongTin() {
		System.out.println("\t    - Mã: "+this.id);
		System.out.println("\t    - Họ và tên: "+this.name);
		System.out.println("\t    - Chuyên ngành: "+this.nganh);
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	
	
}















