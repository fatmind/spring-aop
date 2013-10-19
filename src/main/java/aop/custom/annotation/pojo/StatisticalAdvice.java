package aop.custom.annotation.pojo;

import org.aspectj.lang.ProceedingJoinPoint;


public class StatisticalAdvice {
	
	/*
	 * 若写为 incrOne(ProceedingJoinPoint joinpoint) 错误, 原理未知
	 * 参考 : http://stackoverflow.com/questions/8574348/error-type-referred-to-is-not-an-annotation-type
	 */
	
	public void incrOne(ProceedingJoinPoint joinpoint, Statistical statistical) {
		
		System.out.println(statistical.key() + " invoke ++ ");
		try {
			joinpoint.proceed(joinpoint.getArgs());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println(statistical.key() + " invoke -- ");
		
	}
	

	/*
	 *  //FIXME 错误，但是如何传递参数呢  ? 
	 *  
	 *  1. pointcut="@annotation(statistical) && args(id)", 对于方法  clear(Statistical statistical, int id), 但无法通用
	 * 
	public void clear(Joinpoint joinpoint, Statistical statistical) {
		System.out.println("clear all ...");
	}
	*/
	
	public void clear(Statistical statistical) {
		System.out.println("clear all ...");
	}
	
}
