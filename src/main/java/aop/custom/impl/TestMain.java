package aop.custom.impl;

import aop.Performer;
import aop.Pianist;

public class TestMain {

	public static void main(String[] args) throws Exception {
		
		//切面
		String pointcutRegx = "perform";
		AudienceAuto notify = new AudienceAuto();	
		SideCut<AudienceAuto> sidecut = 
			new SideCut<AudienceAuto>(pointcutRegx, notify);
		
		//interface
		Class<Performer> interfaceClass = Performer.class;
		
		//real
		Performer real = new Pianist();
		
		InterfaceHandle<Performer, AudienceAuto> handle = new InterfaceHandle<Performer, AudienceAuto>(
				real, sidecut, interfaceClass);
		//proxy
		Performer performerProxy = handle.getProxy();
		performerProxy.perform();
	}

}
