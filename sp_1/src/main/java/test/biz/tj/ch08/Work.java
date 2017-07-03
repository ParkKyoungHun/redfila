package test.biz.tj.ch08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Work {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ioc8.xml");
		Working dev = (Working) context.getBean("working");
		dev.work();
	}
}
