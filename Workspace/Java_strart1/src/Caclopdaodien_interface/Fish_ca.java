package Caclopdaodien_interface;

public class Fish_ca implements Prey_conmoi,Predator_DvAnthit{
	
	//Áp dụng nhiều dao diện trong 1 lớp
	
	@Override
	public void sanBat() {
		System.out.println("Cá lớn đang ăn cá bé");
		
	}

	@Override
	public void chayTron() {
		System.out.println("Con cá này đang trạy trốn");
		
	}
	
	
	
	
}
