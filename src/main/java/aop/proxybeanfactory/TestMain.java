package aop.proxybeanfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.Performer;

/**
 * 背后逻辑参考
 * http://blog.csdn.net/shuangyue/article/details/8633249
 * @author fatmind
 */
public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("aop/proxybeanfactory/app-basic.xml");
		Performer piano = (Performer)context.getBean("performer");
		piano.perform();
	}

}
