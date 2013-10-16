package aop.annotation.custom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext app = 
			new ClassPathXmlApplicationContext("aop/annotation/custom/aop-annotation-custom.xml");
		AuctionServiceImpl auctionService = (AuctionServiceImpl)app.getBean("auctionService");
		auctionService.getAuction(0);
	}

}
