package aop.annotation.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.Performer;

public class TestMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("aop/annotation/aspect/app-annotation-aspect.xml");
		
		Performer performer = (Performer)context.getBean("performer");
		performer.perform();
	}

}
