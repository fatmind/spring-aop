package proxy.manual;

import proxy.ItemService;
import proxy.ItemServiceImp;

public class TestMain {


	public static void main(String[] args) {
		ItemService itemService = new ItemServiceImp();
		ItemService itServiceProxy = new ItemServiceProxy(itemService);
		itServiceProxy.getSingleItem(0);
	}

}
