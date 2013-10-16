package aop.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.Performer;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("aop/basic/app-basic.xml");
		Performer piano = (Performer)context.getBean("performer");
		piano.perform();
	}

}
