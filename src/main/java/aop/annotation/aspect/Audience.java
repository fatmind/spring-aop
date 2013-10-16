package aop.annotation.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	@Pointcut("execution(* *.perform(..))")
	public void handle(){}
	
	@Before("handle()")
	public void before() {
		System.out.println("annotation : please turn off your phone");
		
	}
	@AfterReturning("handle()")
	public void afterReturning() {
		System.out.println("annotation : goog goog goog");
	}

}
