package aop.autoproxycreator.beanname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.Performer;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("aop/autoproxycreator/beanname/aop-autocreator-beanname.xml");
		Object obj = app.getBean("pianist");
		Performer performer = (Performer)obj;
		performer.play("蓝莲花", 60L);
		
		/*
		 *  Note : Pianist pianist = (Pianist)obj;
		 *  
		 *  因为Pianist实现Performer, 因此spring默认采用jdk-proxy代理
		 *  仅能转化为Performer类型
		 */

	}
}
