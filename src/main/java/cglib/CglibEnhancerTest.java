package cglib;

import net.sf.cglib.proxy.Enhancer;
import aop.Performer;
import aop.Pianist;

public class CglibEnhancerTest {
	
	public static void main(String[] args) {
		
		 Enhancer enhancer = new Enhancer();
		 enhancer.setSuperclass(Pianist.class);
	     enhancer.setCallback(new LogInterceptor());
	     
	     Performer proxy = (Pianist)enhancer.create();
	     proxy.perform();
	}

}
