package aop;

public class Pianist implements Performer {

	public void perform() {
		System.out.println(" ..... ");
		System.out.println("wonderful music");
		System.out.println(" ..... ");
	}
	
	public void play(String music, Long duration) {
		System.out.println("music = " + music + ", duration = " + duration);
	}

}
