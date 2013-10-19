package aop.proxybeanfactory;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class Audience implements MethodBeforeAdvice, AfterReturningAdvice {

	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("basic : please turn off your phone");
		
	}

	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("basic : goog goog goog");
	}

}
