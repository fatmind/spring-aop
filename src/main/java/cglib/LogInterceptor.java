package cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class LogInterceptor implements MethodInterceptor {

	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("cglib : turn off your call phone");
		Object res = proxy.invokeSuper(obj, args);
		System.out.println("cglib : good good good");
		return res;
	}

}
