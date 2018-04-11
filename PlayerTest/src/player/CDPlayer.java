package player;

public class CDPlayer implements Player {
	
	public void play() {
		System.out.println("CDPlayer를 시작합니다.");
	}
	
	public void stop() {
		System.out.println("CDPlayer를 멈춥니다.");
	}
	
	public void cleaning() {
		System.out.println("CDPlayer를 청소합니다.");
	}
	
}
