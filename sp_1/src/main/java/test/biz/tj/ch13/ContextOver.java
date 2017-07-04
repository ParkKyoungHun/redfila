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
		Exam target1 = (Exam) son.getBean("target1");
		Exam target2 = (Exam) son.getBean("target2");
		String target3 = (String) son.getBean("father2");
		System.out.println(target1.getVal1());
		System.out.println(target2.getVal2());
		System.out.println(target3);
	}
}
