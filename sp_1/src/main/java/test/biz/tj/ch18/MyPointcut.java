package test.biz.tj.ch18;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class MyPointcut extends StaticMethodMatcherPointcut {
	// 아래는First.class의 one()의 실행 전/후 충고가 적용된다.
	public boolean matches(Method method, Class<?> cls) {
		return ("one".equals(method.getName()) && cls == First.class);
	}
}