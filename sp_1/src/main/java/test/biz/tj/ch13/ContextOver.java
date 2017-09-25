package test.biz.tj.ch13;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ContextOver {
	public static void main(String[] args) {
		GenericXmlApplicationContext father = new GenericXmlApplicationContext();
		father.load("ch13/father.xml");
		father.refresh();
		GenericXmlApplicationContext son = new GenericXmlApplicationContext();
		son.load("ch13/son.xml");
		son.setParent(father);
		son.refresh();
		Exam e = (Exam)son.getBean("target4");
		System.out.println(e.getVal1());
		System.out.println(e.getVal2());
	}
}
