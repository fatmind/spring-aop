package aop.args.joinpoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	@Pointcut("execution(* *.play(..))")
	public void play(){}
	
	@Before("play()")
	public void before(JoinPoint  joinpoint) {
		Object[] args = joinpoint.getArgs();
		System.out.println("args : " + args[0] + ", " + args[1]);
		System.out.println("please turn off your phone");
		
	}

}
