package collegeAdmissions.java;

public class BlockC extends Information{
	
	public BlockC() {

	}

	public BlockC(String id, String fullName, String address, String priority, String examBlock) {
		super(id, fullName, address, priority, examBlock);

	}
	public void input() {
		super.input();
		super.setExamBlock("C");
	}

	
	
	
}
