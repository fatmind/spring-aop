package aop.autoproxycreator.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	@Pointcut("execution(* *.perform(..))")
	public void handle(){}
	
	@Before("handle()")
	public void before(JoinPoint joinPoint) {
		System.out.println("annotation : please turn off your phone");
		
	}
	
	/*
	 * Note: 可不定义pointcut声明，如下
	 */
	@AfterReturning("execution(* *.perform(..))")
	public void afterReturning() {
		System.out.println("annotation : goog goog goog");
	}

}
