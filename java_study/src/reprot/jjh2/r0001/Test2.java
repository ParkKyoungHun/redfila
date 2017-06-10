/** <a href="http://www.cpupk.com/decompiler">Eclipse Class Decompiler</a> plugin, Copyright (c) 2017 Chen Chao. **/
package reprot.jjh2.r0001;

public class Test2 {
	int a = 0;
	int b = 0;
	int c = 0;

	public void printLoop() {
		for (int i = this.a; i <= this.b; ++i) {
			if (i % this.c == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + ",");
			}
		}

	}

	public void printLoopReverse() {
		for (int i = this.a; i >= this.b; --i) {
			if (i % this.c == this.b) {
				System.out.println(i);
			} else {
				System.out.print(i + ",");
			}
		}

	}

	public static void main(String[] args) {
		Test2 t02 = new Test2();
		t02.a = 100;
		t02.b = 1;
		t02.c = 30;
		//안됩니다.
		t02.printLoopReverse();
		System.out.println();
	}
}