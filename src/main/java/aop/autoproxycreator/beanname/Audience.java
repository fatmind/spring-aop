package aop.autoproxycreator.beanname;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Audience implements MethodInterceptor {

	public Object invoke(MethodInvocation arg) throws Throwable {
		System.out.println("please turn off your phone"); 
		Method m = arg.getMethod();
		Object res = m.invoke(arg.getThis(), arg.getArguments());
 		System.out.println("goog goog goog"); 
		return res;
	}

}
