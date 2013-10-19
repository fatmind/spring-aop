package aop.custom.annotation.pojo;

public class AuctionService {
	
	@Statistical(key="xiaopang")
	public void getAuction(int id) {
		System.out.println("return good auction ...");
	}

}
