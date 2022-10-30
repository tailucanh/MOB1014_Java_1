package collegeAdmissions.java;

public class BlockA extends Information{

	public BlockA() {

	}


	public BlockA(String id, String fullName, String address, String priority, String examBlock) {
		super(id, fullName, address, priority, examBlock);
		
	}
	
	
	public void input() {
		super.input();
		super.setExamBlock("A");
	}
	

	
	
	
}
