package aop.annotation.custom2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.Performer;

public class TestMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("aop/annotation/custom2/app-custom-annotation.xml");
		
		//Violinist violinist = (Violinist)context.getBean("violinist");
		//violinist.perform();
		
		Performer performer = (Performer)context.getBean("violinist");
		performer.perform();
	}

}
