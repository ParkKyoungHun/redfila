package test.biz.tj.ch09;

import org.springframework.stereotype.Service;

@Service
public class Programmer implements Emp{

	public void gotoOffice() {
		System.out.println("프로그래머 출근합니다.");
	}

	public void getoffWork() {
		System.out.println("프로그래머 퇴근합니다.");
	}

}
