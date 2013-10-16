package aop.custom.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class InterfaceHandle<I, N> implements InvocationHandler {
	
	private I proxy;
	private I real;
	private SideCut<N> sidecut;
	private N notify;
	
	public InterfaceHandle(I real, SideCut<N> configuration, Class<I> interfacClass) throws Exception {
		this.real = real;
		this.sidecut = configuration;
		Class clazz = Proxy.getProxyClass(interfacClass.getClassLoader(), interfacClass);
		Constructor constructor = clazz.getConstructor(InvocationHandler.class);
		proxy = (I)constructor.newInstance(this);
		notify = sidecut.getNotify();
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		String methodName = method.getName();
		if(methodName.equals(sidecut.getPointcutRegx())) {
			
			MethodBeforeAdvice methodBefore = (MethodBeforeAdvice)notify;
			methodBefore.before(method, args, real);
	
			Object obj = method.invoke(real, args);
			
			AfterReturningAdvice methodReturn = (AfterReturningAdvice)notify;
			methodReturn.afterReturning(obj, method, args, real);
		}
		return null;
	}
	
	public I getProxy() {
		return this.proxy;
	}

}
