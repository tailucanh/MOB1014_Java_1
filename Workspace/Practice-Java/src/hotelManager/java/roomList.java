package hotelManager.java;

import java.util.ArrayList;
import java.util.Scanner;





public class roomList {

	private ArrayList<Information> listRoom = new ArrayList<>();
	 String classify;
	
	public void input(Scanner scanner) {
		if (listRoom.isEmpty()) {
			boolean finish = true;
			System.out.println("\t    +--- Nhập thông tin  ---+");
			do {
				try {
					
					Information in4 = new Information();
					in4.input(scanner);
					listRoom.add(in4);
					System.out.print("\t Bạn muốn nhập tiếp k? Y/N: ");
					String check = scanner.nextLine();
					if (check.equalsIgnoreCase("Y")) {
						finish = true;
					}else {
						finish = false;
					}
				} catch (Exception e) {
					finish = false;
				}
	
			} while (finish);
			
	
		}
	
	}
	
	public void output() {
		if (!listRoom.isEmpty()) {
			
			System.out.println("\t *---Thông tin khách hàng---* ");
			for(int i = 0; i < listRoom.size(); i++) {
				System.out.println("\t >>> Khách: "+(i+1));
				if (listRoom.get(i).getClassify() == 1) {
					System.out.println("\t    - Loại phòng: Loại A");
				}else if(listRoom.get(i).getClassify() == 2) {
					System.out.println("\t    - Loại phòng: Loại B");
				}
				else if(listRoom.get(i).getClassify() == 3) {
					System.out.println("\t    - Loại phòng: Loại C");
				}
				System.out.println("\t - Số ngày thuê: "+listRoom.get(i).getDateOfHire());		
				System.out.println("\t - Tên: "+listRoom.get(i).getName());
				System.out.println("\t - Tuổi: "+listRoom.get(i).getAge());		
				System.out.println("\t - Số CMND: "+listRoom.get(i).getCmnd());		
			}

			
		}else {
			System.out.println("\t Sai dữ liệu!");
		}
		
		
	}
	
	public void deleteByCmnd(Scanner scanner) {
		if (!listRoom.isEmpty()) {
			try {
				
	
				Information assignCMND = null;
				
				
				System.out.print("\t  - Nhập cmnd cần xoá: ");
				int	searchCMND = scanner.nextInt();
				
				System.out.println(" ");

				for (Information list : listRoom) {
					if (list.getCmnd() == searchCMND) {
						assignCMND = list;
						break;
					}
				}
				if (assignCMND != null) {
					listRoom.remove(assignCMND);
					System.out.println("\t    >> Danh sách khách sau khi xoá cmnd: " + searchCMND);
					output();
				} else {
					System.out.println("\t --> Không có thông tin số cmnd: " + searchCMND);
				}
			} catch (Exception e) {
				System.out.println("\t  --> Lỗi dữ liệu!");
			}
			
		}else {
			System.out.println("\t Sai dữ liệu!");
		}
		
		
	}
	
	public void bill(Scanner scanner) {
		if (!listRoom.isEmpty()) {
			try {
				
				System.out.print("\t  - Nhập cmnd cần tính tiền: ");
				int	searchCMND = scanner.nextInt();
				
				System.out.println(" ");
				Hotel hotel = new Hotel();
				for (int i = 0; i < listRoom.size(); i++) {
					if (listRoom.get(i).getCmnd() == searchCMND) {
						if (listRoom.get(i).getClassify() == 1) {
							System.out.println("\t    >> Bill có số cmnd: " + searchCMND+ " là: "+hotel.billTypeA());
						}else if(listRoom.get(i).getClassify() == 2) {
							System.out.println("\t    >> Bill có số cmnd: " + searchCMND+ " là: "+hotel.billTypeB());
						}
						else if(listRoom.get(i).getClassify() == 3) {
							System.out.println("\t    >> Bill có số cmnd: " + searchCMND+ " là: "+hotel.billTypeC());
						}
					}else {
						System.out.println("\t --> Không có thông tin số cmnd " + searchCMND);
					}
				}
				
							
				
			} catch (Exception e) {
				System.out.println("\t  --> Lỗi dữ liệu!");
			}
			
			
			
		}else {
			System.out.println("\t Sai dữ liệu!");
		}
		
		
	}
	
	
}
