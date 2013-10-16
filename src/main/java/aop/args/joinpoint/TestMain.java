package aop.args.joinpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.Performer;

public class TestMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("aop/args/joinpoint/app-args-joinpoint.xml");
		
		Performer performer = (Performer)context.getBean("performer");
		performer.play("白毛女", 6000L);
	}

}
