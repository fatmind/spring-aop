package aop.custom.annotation.auto.aspect;

public class Violinist  {
	
	@LogTager(logName="Violinist")
	public void perform(int sessionId) throws Exception {
		System.out.println("violinist is performing ... sessionId = " + sessionId);
	}

	
}
