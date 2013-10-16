package aop.custom.impl;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AudienceAuto {

	@Pointcut("execution(* *.perform(..))")
	public void performance(){}
	
	@Before("performance()")
	public void before() {
		System.out.println("please turn off your phone");
		
	}
	@AfterReturning("performance()")
	public void afterReturning() {
		System.out.println("goog goog goog");
	}

}
