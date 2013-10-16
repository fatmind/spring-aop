package proxy.auto;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import proxy.ItemService;


public class ItemServiceProxyAuto {

	public ItemService proxy;
	public ItemService realService;

	@SuppressWarnings("unchecked")
	public ItemServiceProxyAuto(ItemService itemService) {
		try {
			this.realService = itemService;
			Class clazz = Proxy.getProxyClass(ItemService.class.getClassLoader(), ItemService.class);
			Constructor c = clazz.getConstructor(InvocationHandler.class);
			proxy = (ItemService) c.newInstance(new ItemServiceHandel());
			/*
			 * 简便写法
			proxy = (ItemService)Proxy.newProxyInstance(ItemService.class.getClassLoader(), new Class[]{ItemService.class}, new ItemServiceHandel());
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ItemService getItemService() {
		return this.proxy;
	}

	class ItemServiceHandel implements InvocationHandler {

		public Object invoke(Object proxy, Method method, Object[] args)
				throws Throwable {
			Object res = null;
			String methodName = method.getName();
			if ("getSingleItem".equals(methodName)) {
				long startTime = System.currentTimeMillis();
				res = method.invoke(realService, args);
				long costTime = System.currentTimeMillis() - startTime;
				System.out.println("cost time : " + costTime);
			}
			return res;
		}
	}

}
