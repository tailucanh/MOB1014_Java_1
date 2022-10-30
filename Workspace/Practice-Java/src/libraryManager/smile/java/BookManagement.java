package libraryManager.smile.java;


import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
	
	
	private ArrayList<Document> listDocuments = new ArrayList<>();
	
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("\t   >>> Phân loại <<<");
			System.out.println("\t     1. Sách.\n\t     2.Tạp chí.\n\t     3.Báo.");
			do {		
				System.out.print("   --> Thêm loại: ");
				String kindOfBook = scanner.nextLine();
				
				if (kindOfBook == null || kindOfBook.equals("")) {
					break;
				}
				int iKindOfBook = Integer.parseInt(kindOfBook);
				switch (iKindOfBook) {
					case 1: 
						Books books = new Books();
						books.input();
						listDocuments.add(books);
						break;
					case 2: 
						Journal journals = new Journal();
						journals.input();
						listDocuments.add(journals);
						break;
					case 3: 
						Newspaper spapers = new Newspaper();
						spapers.input();
						listDocuments.add(spapers);
						break;
								
					default:
						System.out.println("  --> Nhập đúng loại !");
				}	
			} while (true);
		} catch (Exception e) {
				System.out.println("  --> Kiểm tra lại!");	
		}finally {
			System.out.println("  --> Kết thúc nhập dữ liệu!");
		}
		
	}
	
	
	public void output() {
		for(Document library : listDocuments) {
			if(library instanceof Books) {
				library.output();
			}else if(library instanceof Journal) {
				library.output();
			}else if(library instanceof Newspaper) {
				library.output();
			}
		}
	}
	
	public void deleteDocument() {

		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("   - Nhập tên mã cần xoá: ");
			String removeID = scanner.nextLine();
			for(int i = 0; i < listDocuments.size(); i++) {
				if (listDocuments.get(i).getId().equalsIgnoreCase(removeID)) {
					listDocuments.remove(i);
				}
			}
			System.out.println("\t  *-- Danh sách sau khi xoá --* ");
			output();
			
			
		} catch (Exception e) {
			System.out.println("   --> Sai dữ liệu!");
		} finally {
			System.out.println("  --> Kết thúc xoá tài liệu!");
		}
	}
	
	
	public void searchByType() {
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("  - Nhập tài liệu cần tìm kiếm (1.Sách, 2.Tạp chí , 3.Báo): ");
			String checkDocument = scanner.nextLine();
			for(Document library : listDocuments) {
				if(checkDocument.equals("1") || checkDocument.equalsIgnoreCase("sách")){
					if(library instanceof Books) {
						library.output();
					}
				
				}else if(checkDocument.equals("2") || checkDocument.equalsIgnoreCase("tạp chí")){
					if(library instanceof Journal) {
						library.output();
					}
					
				}else if(checkDocument.equals("3") || checkDocument.equalsIgnoreCase("báo")){
					if(library instanceof Newspaper) {
						library.output();
					}
					
				}
			}

		} catch (Exception e) {
			System.out.println("  -> Sai dữ liệu!");
		} finally {
			System.out.println("  --> Kết thúc tìm kiếm.");
		}
		
	}
	
	
}












