package methodTest07;

public class methodTest07 {
	
	static int x = 700; // 전역 변수(global Variable);
	static int y = 900;
	
	public static void printX() {
		System.out.println("3번 x = " + x);
	}
	
	public static void main(String[] args) {
		System.out.println("1번 x = " + x);
		
		int x =800; //지역변수 (local Variable);
		
		System.out.println("2번 x = " + x);
		
		printX();
		
		System.out.println("4번 x = " + methodTest07.x);
		
		System.out.println("5번 y = " + y);
	}

}
