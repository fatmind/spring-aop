package aop.autoproxycreator.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.Performer;

/**
 * 实现参考 ：http://blog.csdn.net/shuangyue/article/details/8633264
 * @author fatmind
 */
public class TestMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("aop/autoproxycreator/aspect/aop-autocreator-aspect.xml");
		
		Performer performer = (Performer)context.getBean("performer");
		performer.perform();
	}

}
