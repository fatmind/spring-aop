package aop.annotation.custom2;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogIntercept {

	@Pointcut("@annotation(aop.annotation.custom2.LogAnnotation)")
	public void handle(){};
	
	@Around("handle()")
	@SuppressWarnings({"unchecked", "rawtypes"})
	public Object monitorCostTime(ProceedingJoinPoint procee) throws Throwable {
		
		System.out.println(procee.getTarget());
		System.out.println(procee.getThis());
		
		long startTime = System.currentTimeMillis();
		
		System.out.println(procee.getSignature().getName());
		
		Class clazz = procee.getTarget().getClass();
		Object[] args = procee.getArgs();
		Class[] params = new Class[args.length];
		for(int i=0; i<args.length; i++) {
			params[i] = args[i].getClass();
		}
		Method method = clazz.getMethod(procee.getSignature().getName(), params);
		LogAnnotation log = method.getAnnotation(LogAnnotation.class);
		
		System.out.println("------ " + log.logName() + " -------");
		Object res = procee.proceed();
		long costTime = System.currentTimeMillis() - startTime;
		System.out.println("log = " + log.logName() + ", costTime = " + costTime);
		return res;
	}
	
	
}
