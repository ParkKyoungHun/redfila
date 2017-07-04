package test.biz.tj.ch14;

import org.springframework.aop.framework.ProxyFactory;

public class HelloMain {
	
	public static void main(String[] args) {
		IPrintMsg target = new PrintMsg();
		// Proxy 빈껍데기 생성
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new MyAroundAdvice()); // 충고 add
		pf.setTarget(target); // 타겟 add
		PrintMsg proxy = (PrintMsg) pf.getProxy();
		proxy.hello();
	}
}
