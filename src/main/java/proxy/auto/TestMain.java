package proxy.auto;

import proxy.ItemService;
import proxy.ItemServiceImp;

public class TestMain {

	public static void main(String[] args) {
		ItemService realService = new ItemServiceImp();
		ItemServiceProxyAuto itemServiceProxyAuto = new ItemServiceProxyAuto(realService);
		ItemService itemService = itemServiceProxyAuto.getItemService();
		itemService.getSingleItem(0);
	}

}
