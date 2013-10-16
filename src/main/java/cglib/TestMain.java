package cglib;

import aop.Pianist;

import net.sf.cglib.proxy.Enhancer;

public class TestMain {
	
	public static void main(String[] args) {
		
		 Enhancer enhancer = new Enhancer();
		 enhancer.setSuperclass(Pianist.class);
	     enhancer.setCallback(new LogInterceptor());
	     
	     Pianist proxy = (Pianist)enhancer.create();
	     proxy.perform();
	}

}
