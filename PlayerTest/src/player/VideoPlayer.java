package player;

public class VideoPlayer implements Player {
	
	private int id;
	private static int count = 0;
	
	public VideoPlayer() {
		id = ++count;
	}
	
	
	@Override
	public void play() {
		System.out.println("������ �÷����մϴ�.");
	}
	
	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}
	
	public void printInfo() {
		System.out.println("������ȣ�� [" + id + "] �Դϴ�.");
	}

}
