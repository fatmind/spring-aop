package proxy.manual;

import proxy.ItemService;

public class ItemServiceProxy implements ItemService {

	private ItemService itemService;
	
	public ItemServiceProxy(ItemService itemService) {
		this.itemService = itemService;
	}
	
	public void getSingleItem(int itemId) {
		long startTime = System.currentTimeMillis();
		itemService.getSingleItem(itemId);	
		long costTime = System.currentTimeMillis() - startTime;
		log("cost time : " + costTime);
	}

	private void log(String message) {
		System.out.println(message);
	}
}
