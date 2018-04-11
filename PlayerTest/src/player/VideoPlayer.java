package player;

public class VideoPlayer implements Player {
	
	private int id;
	private static int count = 0;
	
	public VideoPlayer() {
		id = ++count;
	}
	
	
	@Override
	public void play() {
		System.out.println("비디오를 플레이합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("비디오를 멈춥니다.");
	}
	
	public void printInfo() {
		System.out.println("제조번호는 [" + id + "] 입니다.");
	}

}
