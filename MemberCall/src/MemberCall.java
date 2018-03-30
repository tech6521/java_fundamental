
	
public class MemberCall {
	int iv = 10;
	static int cv = 20;

	
	int iv2 = cv;
	//static int cv2 = iv //에러, 클래스 변수는 인스턴스 변수를 사용할 수 없음.
	static int cv2 = new MemberCall().iv; // 이처럼 객체를 생성해야 사용가능 익명 인스턴스(일회용 인스턴스)
			
		static void staticMethod1() {
		System.out.println(cv);
	//	System.out.println(iv); 
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	 void instanceMethod1() {
		 System.out.println(cv);
		 System.out.println(iv);
	 }
	 
	
	 
	 static void staticMethod2() {
		 staticMethod1();
		// instanceMethod1();
		 MemberCall c = new MemberCall();
		 c.instanceMethod1();
	 }
	 
	 void instanceMethod2() {
		 staticMethod1();
		 instanceMethod1();
	 }
	 
	 public static void main(String[] args) {
		MemberCall c = new MemberCall();
		staticMethod1();
		int a = c.iv;
		
		System.out.println(a);
	 }
	
}
