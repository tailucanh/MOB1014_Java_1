package polymorphism_nhieuDang;

public class Bicycle extends Vehicle_PhuongTien{
	
	@Override   // ghi đè
	public void go() {
		System.out.println("Xe đạp đang chuyển chạy.");
	}
}
