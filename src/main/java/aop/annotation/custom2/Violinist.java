package aop.annotation.custom2;

import aop.Performer;


public class Violinist implements Performer {
	
	@LogAnnotation(logName="Violinist")
	public void perform() {
		System.out.println("violinist is performing ... ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	}

	public void play(String music, Long duration) {
		// TODO Auto-generated method stub
		
	}
	
}
