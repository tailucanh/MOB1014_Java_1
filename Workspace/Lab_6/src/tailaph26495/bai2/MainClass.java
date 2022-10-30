package tailaph26495.bai2;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			ArrayList<SanPham> listSp = new ArrayList<>();
			
			for(int i = 0; i < 5; i++ ) {
				SanPham sp = new SanPham();
				System.out.println("    Sản phẩm "+(i+1));
				sp.input();
				listSp.add(sp);
			}
			
			System.out.println("  *-- Thông tin sản phẩm --*");
			for(SanPham sp : listSp) {
				if(sp.getCompany().equalsIgnoreCase("Nokia")) {
					sp.output();
					System.out.println(" ");
				}
				
			}
			
			
			
		} catch (Exception e) {
			System.out.println(" Sai dữ liệuu!");
		}
		
	}

}
