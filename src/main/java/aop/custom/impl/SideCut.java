package aop.custom.impl;

/**
 * 切面
 * @author bohan.sj
 * @param <I>
 * @param <N>
 */
public class SideCut<N> {
	
	private String pointcutRegx;
	private N notify;
	
	public SideCut(
			String pointcutRegx, 
			N notify) {
		this.pointcutRegx = pointcutRegx;
		this.notify = notify;
	}


	public String getPointcutRegx() {
		return pointcutRegx;
	}

	public void setPointcutRegx(String pointcutRegx) {
		this.pointcutRegx = pointcutRegx;
	}

	public N getNotify() {
		return notify;
	}

	public void setNotify(N notify) {
		this.notify = notify;
	}
	
	
}
