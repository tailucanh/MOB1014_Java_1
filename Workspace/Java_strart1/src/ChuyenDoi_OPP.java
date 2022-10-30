
public class ChuyenDoi_OPP {

	public static void main(String[] args) {
		// Trao đổi các đối tượng cho nhau trong OPP
		
		ChuyenDoi_OPP_1 garage = new ChuyenDoi_OPP_1();
		ChuyenDoi_OPP_2 car = new ChuyenDoi_OPP_2("BMW");
		ChuyenDoi_OPP_2 car1 = new ChuyenDoi_OPP_2("Lambo");
		ChuyenDoi_OPP_2 car2 = new ChuyenDoi_OPP_2("Tesla");
		
		garage.park(car);
		garage.park(car1);
		garage.park(car2);
	}

}
