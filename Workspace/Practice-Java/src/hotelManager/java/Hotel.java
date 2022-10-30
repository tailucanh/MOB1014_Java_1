package hotelManager.java;



public class Hotel extends Information{
	private int typeOfRoom;
	
	
	public Hotel() {
	
	}



	
	public int billTypeA() {
		return getDateOfHire()*500;
	}
	
	public int billTypeB() {
		return getDateOfHire()*300;
	}
	
	public int billTypeC() {
		return getDateOfHire()*100;
	}
	
	
	
	public int getTypeOfRoom() {
		return typeOfRoom;
	}

	public void setTypeOfRoom(int typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}


	

}
