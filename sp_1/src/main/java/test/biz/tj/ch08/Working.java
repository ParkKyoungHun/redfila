package test.biz.tj.ch08;

public class Working {
	Emp emp;

	public Working(Emp emp){
		this.emp = emp;
	}
	
	void work() {
		emp.gotoOffice();
		System.out.println("일을 합니다...");
		emp.getoffWork();
	}
}
