package aop.annotation.custom;

public class AuctionServiceImpl {
	
	@Statistical(key="", type="memory")
	public String getAuction(int id) {
		if(id > 0) {
			return null;
		}
		return "";
	}

}
