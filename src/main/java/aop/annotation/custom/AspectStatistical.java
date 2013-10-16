package aop.annotation.custom;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * 1. 未获取参数
 * 2. 实际调用方法
 * @author bohan.sj
 *
 */

@Aspect
public class AspectStatistical {
	
	@Around("handle()")
	public void incrOne(Statistical statistical) {
		String type = statistical.type();
		if("memory".equals(type)) {
			System.out.println("data from memory");
		}else {
			System.out.println("data from tair");
		}
	}
	
}
