package aop.custom.annotation.auto.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"aop/custom/annotation/auto/aspect/custom-annotation-aspectj.xml");
		
		Violinist violinist = (Violinist)context.getBean("violinist");
		violinist.perform(10);
	}

}
