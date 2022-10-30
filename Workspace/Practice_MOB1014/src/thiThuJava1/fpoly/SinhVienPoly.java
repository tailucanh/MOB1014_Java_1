package thiThuJava1.fpoly;

import java.util.Scanner;

public class SinhVienPoly extends NhanVien{

	private int nganhHep;

	public SinhVienPoly() {
		super();
		
	}

	
	public SinhVienPoly(String id, String name, String nganh) {
		super(id, name, nganh);
	}

	
	
	public SinhVienPoly(int nganhHep) {
		this.nganhHep = nganhHep;
	}


	public void input(Scanner scanner) {
		try {
			boolean check = false;
			System.out.print(" \t  Chuyên ngành ");
				System.out.println("\t  1. Java   2.C# ");
			do {
				try {
					
					System.out.print("\t  -> Chọn chuyên ngành: ");
					
					String iNganhHep = String.valueOf(this.nganhHep);
					iNganhHep = scanner.nextLine();
					
					if (iNganhHep.isEmpty() || iNganhHep.equals(" ")) {
						System.out.println("\t --> Chọn 1 hoặc 2");
						check = true;
					}if (Integer.valueOf(iNganhHep) == 1|| Integer.valueOf(iNganhHep) == 2) {
						this.nganhHep = Integer.valueOf(iNganhHep);
						check = false;
					}else {
						System.out.println("\t --> Chọn 1 hoặc 2");
						check = true;
					}
				} catch (Exception e) {
					check = true;
				}

				
			} while (check);
			
			
		} catch (Exception e) {
			System.out.println("\t-> Sai dữ liệu!");
		}
	}
	
	
	public void output() {
		super.inThongTin();
		if (this.nganhHep == 1) {
			System.out.println("\t    - Ngành hẹp: Java ");
		}else if(this.nganhHep == 2){
			System.out.println("\t    - Ngành hẹp: C# ");
		}
	}
	
	

	public int getNganhHep() {
		return nganhHep;
	}

	public void setNganhHep(int nganhHep) {
		this.nganhHep = nganhHep;
	}


}
