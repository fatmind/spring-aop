package aop.custom.annotation.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext app = 
			new ClassPathXmlApplicationContext("aop/custom/annotation/pojo/custom-annotation-pojo.xml");
		AuctionService auctionService = (AuctionService)app.getBean("auctionService");
		auctionService.getAuction(110);
	}

}
