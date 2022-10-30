package polymorphism_nhieuDang;

public class Car extends Vehicle_PhuongTien{
	
	@Override   // ghi đè
	public void go() {
		System.out.println("Xe ô tô đang chuyển động.");
	}
	
}
