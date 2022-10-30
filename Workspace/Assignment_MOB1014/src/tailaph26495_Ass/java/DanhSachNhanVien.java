package tailaph26495_Ass.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;



public class DanhSachNhanVien {

	private ArrayList<NhanVien> listNhanViens = new ArrayList<>();

	
	public void input(Scanner scanner) {
	
			try {
				System.out.println("\t    *---Phân loại nhân viên---* ");
				System.out.println("\t\t1. Nhân viên hành chính.\n\t\t2. " + "Nhân viên tiếp thị.\n\t\t3. "
						+ "Trưởng phòng.\n\t\t ( Bấm ENTER để kết thúc.)");
				int i = 1;

				do {
					System.out.print("\t    >>> Chọn kiểu nhân viên: ");
					String classify = scanner.nextLine();

					System.out.println("\t >> Nhân viên: " + i);
					if (classify == null || classify.equals("")) {
						System.out.println("\n\t    -> Kết thúc nhập dữ liệu!");
						break;
					}

					switch (classify) {
					case "1":
						NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
						nvhc.input(scanner);
						listNhanViens.add(nvhc);
						break;
					case "2":
						NhanVienTiepThi nvtt = new NhanVienTiepThi();
						nvtt.input(scanner);
						listNhanViens.add(nvtt);
						break;
					case "3":
						TruongPhong tp = new TruongPhong();
						tp.input(scanner);
						listNhanViens.add(tp);
						break;
					default:
						System.out.println("\t  --> Hãy chọn đúng loại!");
					}
					i++;

				} while (true);
			} catch (Exception e) {
				System.out.println("\t  --> Bạn đã nhập sai dữ liệu!");
			}
	

	}

	
	public void output() {
		int i = 1;
		if (!listNhanViens.isEmpty()) {
			for (NhanVien nv : listNhanViens) {
				System.out.println("\t        >> Nhân viên: " + i);
				if (nv instanceof NhanVienHanhChinh) {
					nv.output();
				} else if (nv instanceof NhanVienTiepThi) {
					nv.output();
				} else if (nv instanceof TruongPhong) {
					nv.output();
				}
				i++;
				System.out.println(" ");
			}
		} else {
			System.out.println("\t  --> Chưa có dữ liệu nhập vào!");
		}

	}

	
	public void timNvTheoID(Scanner scanner) {
		if (!listNhanViens.isEmpty()) {
			try {
				boolean check = false;
				String searchId = null;
				NhanVien assignId = null;
				do {
					try {
						System.out.print("\t - Nhập mã cần tìm: ");
						searchId = scanner.nextLine();
						if (searchId.isEmpty() || searchId.equals(" ")) {
							System.out.println("\t  -> Hãy nhập mã!");
							check = true;
						} else {
							check = false;
						}

					} catch (Exception e) {
						check = true;
					}
				} while (check);

				System.out.println(" ");

				for (NhanVien listNv : listNhanViens) {
					if (listNv.getId().equalsIgnoreCase(searchId)) {
						assignId = listNv;
						break;
					}
				}
				if (assignId != null) {
					System.out.println("\t  >> Thông tin nhân viên có mã " + searchId);
					assignId.output();
				} else {
					System.out.println("\t --> Không có thông tin nhân viên mã " + searchId);
				}
			} catch (Exception e) {
				System.out.println("\t  --> Lỗi dữ liệu!");
			}

		} else {
			System.out.println("\t  --> Chưa có dữ liệu nhập vào!");
		}

	}

	
	public void xoaNvTheoMa(Scanner scanner) {
		if (!listNhanViens.isEmpty()) {
			try {
				boolean check = false;
				String searchID = null;
				NhanVien assignId = null;
				do {
					try {
						System.out.print("\t  - Nhập mã cần xoá: ");
						searchID = scanner.nextLine();
						if (searchID.isEmpty() || searchID.equals(" ")) {
							System.out.println("\t  --> Hãy nhập mã!");
							check = true;
						} else {
							check = false;
						}
					} catch (Exception e) {
						check = true;
					}
				} while (check);

				System.out.println(" ");

				for (NhanVien listNv : listNhanViens) {
					if (listNv.getId().equalsIgnoreCase(searchID)) {
						assignId = listNv;
						break;
					}
				}
				if (assignId != null) {	
					listNhanViens.remove(assignId);
					System.out.println("\t    >> Danh sách nhân viên sau khi xoá mã " + searchID);
					output();
				} else {
					System.out.println("\t --> Không có thông tin nhân viên mã " + searchID);
				}

			} catch (Exception e) {
				System.out.println("\t  --> Lỗi dữ liệu!");
			}

		} else {
			System.out.println("\t  --> Chưa có dữ liệu nhập vào!");
		}
	}

	
	public void capNhatThongTinTheoID(Scanner scanner) {
		if (!listNhanViens.isEmpty()) {
			
			boolean check = false;
			String searchId = null;
			NhanVien nvTemp = null;
			do {
				try {
					System.out.print("\t  >> Nhập mã cần cập nhật: ");
					searchId = scanner.nextLine();
					if (searchId.isEmpty() || searchId.equals(" ")) {
						System.out.println("\t  --> Hãy nhập mã!");
						check = true;
					} else {
						check = false;			
					}
					
				} catch (Exception e) {
					check = true;
				}
			} while (check);
			for (NhanVien listNv : listNhanViens) {
				if (listNv.getId().equalsIgnoreCase(searchId)) {
					nvTemp = listNv;
					break;
				}
			}
			if (nvTemp != null) {								
				if (nvTemp instanceof NhanVienHanhChinh) {
					nvTemp.input(scanner);	
				}else if(nvTemp instanceof NhanVienTiepThi) {
					nvTemp.input(scanner);
				}else if(nvTemp instanceof TruongPhong) {
					nvTemp.input(scanner);
				}
					
				System.out.println("\t    >> Danh sách nhân viên sau khi cập nhật mã "+searchId);
				output();
				
			}else {
				System.out.println("\t --> Không có thông tin nhân viên mã " +searchId);				
			}	
				
		} else {
			System.out.println("\t  --> Chưa có dữ liệu nhập vào!");
		}
	}

	
	public void timNvTheoKhoangLuong(Scanner scanner) {
		if (!listNhanViens.isEmpty()) {
			try {
				double min = 0;
				double max = 0;
				boolean check = false;
				
				do {
					try {
						System.out.print("\t  - Nhập khoảng lương nhỏ nhất: ");
						String assignMin = String.valueOf(min);
						assignMin = scanner.nextLine();
						
						String checkMin = "\\d{1,50}";
						
						if (assignMin.isEmpty() || assignMin.equals(" ")) {
							System.out.println("\t -> Hãy nhập khoảng lương min!");
							check = true;
						}else if(!assignMin.matches(checkMin)) {
							System.out.println("\t  -> Nhập đúng khoảng lương!");
							check = true;
						}else if(Double.valueOf(assignMin) < 0) {
							System.out.println("\t -> Hãy nhập khoảng lương > 0!");
							check = true;
						}else {
							check = false;
							min = Double.valueOf(assignMin);
						}
								
					} catch (Exception e) {
						check = true;
					}
				} while (check);
				
				
				do {
					try {
						System.out.print("\t  - Nhập khoảng lương lớn nhất: ");
						String assignMax = String.valueOf(max);
						assignMax = scanner.nextLine();
						
						String checkMax = "\\d{1,50}";
						
						if (assignMax.isEmpty() || assignMax.equals(" ")) {
							System.out.println("\t -> Hãy nhập khoảng lương max!");
							check = true;
						}else if(!assignMax.matches(checkMax)) {
							System.out.println("\t  -> Nhập đúng khoảng lương!");
							check = true;
						}else if(Double.valueOf(assignMax) < 0 || Double.valueOf(assignMax) < min) {
							System.out.println("\t -> Hãy nhập khoảng lương > 0 và > min!");
							check = true;
						}else {
							check = false;
							max = Double.valueOf(assignMax);
						}
								
					} catch (Exception e) {
						check = true;
					}
				} while (check);
					
				System.out.println(" ");
				
				ArrayList<NhanVien> arrTemp = new ArrayList<>();
				
				for(NhanVien listNv : listNhanViens) {
					if (listNv.getSalary() >= min && listNv.getSalary() <= max) {
						arrTemp.add(listNv);
					}
				}
				if (!arrTemp.isEmpty()) {
					listNhanViens.retainAll(arrTemp);
					System.out.println("\t    >> Danh sách nhân viên trong khoảng lương [ "+min+","+max+" ]");
					output();
				}else {
					System.out.println("\t  --> Không tìm ra nhân viên trong khoảng lương [ "+min+","+max+" ]");
				}
				
			} catch (Exception e) {
					System.out.println("\t --> Lỗi dữ liệu!");
			}

		} else {
			System.out.println("\t  --> Chưa có dữ liệu nhập vào!");
		}
	}

	
	public void xapXepNvTheoHoTen(Scanner scanner) {
		if (!listNhanViens.isEmpty()) {	
			try {
				boolean check = false;
				String arrangeName = null;
				do {
					try {			
						System.out.print("\t  -> Bạn muốn xắp xếp theo họ hay tên: ");
						arrangeName = scanner.nextLine();
						
						if (arrangeName.isEmpty() || arrangeName.equals(" ")) {
							
							System.out.println("\t --> Hãy chọn!");
							check = true;
						}else if (arrangeName.equalsIgnoreCase("ho") || arrangeName.equalsIgnoreCase("họ")) {
							
							check = false;
							Collections.sort(listNhanViens,new Comparator<NhanVien>() {
								@Override
								public int compare(NhanVien o1, NhanVien o2) {
									
									return o1.getSurName().compareTo(o2.getSurName());
								}
							});
							
							System.out.println("\t    >> Danh sách nhân viên sau khi xắp xếp theo họ ");
							output();
							
						}else if(arrangeName.equalsIgnoreCase("ten") || arrangeName.equalsIgnoreCase("tên")){
							
							check = false;
							Collections.sort(listNhanViens,new Comparator<NhanVien>() {
								@Override
								public int compare(NhanVien o1, NhanVien o2) {
									
									return o1.getFirstName().compareTo(o2.getFirstName());
								}
							});
							
							System.out.println("\t    >> Danh sách nhân viên sau khi xắp xếp theo tên ");
							output();
						}else {
							System.out.println("\t   --> Chọn \"Họ\" hoặc \"Tên\"");
							check = true;
						}
				
					} catch (Exception e) {
						check = true;
					}
				} while (check);
				
			} catch (Exception e) {
				System.out.println("\t   -> Sai dữ liệu!");
			}
			
		} else {
			System.out.println("\t  --> Chưa có dữ liệu nhập vào!");
		}
	}

	
	public void xapXepNvTheoThuNhap(Scanner scanner) {
		if (!listNhanViens.isEmpty()) {
			try {
				boolean check = false;
				String arrangeThuNhap = null;
				do {
					try {
						System.out.print("\t  -> Bạn muốn xắp xếp thu nhập theo  (1.Cao -> Thấp) hay (2.Thấp -> Cao): ");
						arrangeThuNhap = scanner.nextLine();
						
						if (arrangeThuNhap.isEmpty() || arrangeThuNhap.equals(" ")) {
							
							System.out.println("\t --> Hãy chọn!");
							check = true;

						}else if(arrangeThuNhap.equals("1")) {
							check = false;
							
							Collections.sort(listNhanViens, new Comparator<NhanVien>() {

								@Override
								public int compare(NhanVien nv1, NhanVien nv2) {
				
									return Double.compare(nv1.tongThuNhap(), nv2.tongThuNhap());
								}
						
							});
							Collections.reverse(listNhanViens);
							System.out.println("\t    >> Danh sách nhân viên sau khi xắp xếp theo thu nhập từ cao -> thấp ");
							output();
							
						}else if(arrangeThuNhap.equals("2")) {
							check = false;
							
							Collections.sort(listNhanViens, new Comparator<NhanVien>() {

								@Override
								public int compare(NhanVien nv1, NhanVien nv2) {
				
									return Double.compare(nv1.tongThuNhap(), nv2.tongThuNhap());
								}
						
							});
							System.out.println("\t    >> Danh sách nhân viên sau khi xắp xếp theo thu nhập từ thấp -> cao ");
							output();
							
						}else {
							System.out.println("\t   --> Chọn \"1\" hoặc \"2\"");
							check = true;
						}
						
					} catch (Exception e) {
						check = false;
					}
				} while (check);
				
			} catch (Exception e) {
				System.out.println("\t   -> Sai dữ liệu!");
			}


			
			
		} else {
			System.out.println("\t  --> Chưa có dữ liệu nhập vào!");
		}
	}

	
	public void xuat5NvThuNhapCaoNhat() {
		if (!listNhanViens.isEmpty()) {
			
			Collections.sort(listNhanViens, new Comparator<NhanVien>() {

				@Override
				public int compare(NhanVien nv1, NhanVien nv2) {

					return Double.compare(nv1.tongThuNhap(), nv2.tongThuNhap());
				}
		
			});
			Collections.reverse(listNhanViens);
			System.out.println("\t    >> Danh sách 5 nhân viên thu nhập cao nhất ");
			for(int i = 0; i < 5 && i < listNhanViens.size() ; i++) {
				System.out.println("\t        >> Nhân viên: " +(i+1));
				listNhanViens.get(i).output();
			}
			
			
		} else {
			System.out.println("\t  --> Chưa có dữ liệu nhập vào!");
		}
	}

	
}






