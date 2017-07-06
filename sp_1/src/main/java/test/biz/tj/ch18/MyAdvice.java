package test.biz.tj.ch18;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAdvice implements MethodInterceptor {
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println(invocation.getMethod().getName());
		Object o = invocation.proceed();
		System.out.println("... SimpleAdvice의 충고가 적용됨 ...");
		return o;
	}
}
