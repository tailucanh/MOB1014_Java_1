package collegeAdmissions.java;

public class BlockB extends Information{

	public BlockB() {

	}

	public BlockB(String id, String fullName, String address, String priority, String examBlock) {
		super(id, fullName, address, priority, examBlock);

	}
	public void input() {
		super.input();
		super.setExamBlock("B");
	}

	
}
