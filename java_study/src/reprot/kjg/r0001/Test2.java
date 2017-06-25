package reprot.kjg.r0001;

public class Test2 {

	int a = 0;
	int b = 0;
	int c = 0;

	public void printLoop() {
		int n = 0;
		for (int i = a; i <= b; i++) {
			n++;
			if (n % c == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + ",");
			}
		}
	}

	public void printLoopReverse() {
		int n = 0;
		for (int i = a; i >= b; i--) {
			n++;
			if (n % c == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + ",");
			}
		}
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.c = 10;

		t2.a = 1;
		t2.b = 100;
		t2.printLoop();

		t2.a = 100;
		t2.b = 1;
		t2.printLoopReverse();
		//±ÂÀâ
	}

}