package aop.custom.annotation.auto.aspect;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogIntercept {

	@Pointcut("@annotation(aop.custom.annotation.auto.aspect.LogTager)")
	public void handle(){};
	
	@Around("handle()")
	public Object monitorCostTime(ProceedingJoinPoint procee) throws Throwable {
		
		System.out.println(procee.getTarget());
		System.out.println(procee.getThis());
		System.out.println(procee.getSignature().getName());
		
		long startTime = System.currentTimeMillis();
		
		Method sourceMethod = procee.getSignature().getClass().getMethod("getMethod");
		sourceMethod.setAccessible(true);
		Method m = (Method)sourceMethod.invoke(procee.getSignature());
		LogTager logTager = m.getAnnotation(LogTager.class);
		Object res = procee.proceed(procee.getArgs());
		System.out.println(logTager.logName() + ", costTime = " + (System.currentTimeMillis() - startTime));

		return res;
	}
	
	/*
	 * monitorCostTime(ProceedingJoinPoint procee) 正确，与<aop>配置应该是同样道理 ，为什么呢 ？
	 * 参加：aop.custom.annotation.pojo.StatisticalAdvice
	 */
	
}
