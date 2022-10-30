package polymorphism_nhieuDang;

public class Boat_thuyen extends Vehicle_PhuongTien {
	
	@Override   // ghi đè
	public void go() {
		System.out.println("Thuyền đang đi.");
	}

}
