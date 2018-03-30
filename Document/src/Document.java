class DocumentTest {
	static int count = 0;
	String name;
	
	DocumentTest() {
		this("제목없음" + ++count);
	}
	
	DocumentTest(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}

public class Document {
	public static void main(String[] args) {
		
		DocumentTest d1 = new DocumentTest();
		DocumentTest d2 = new DocumentTest("자바.txt");
		DocumentTest d3 = new DocumentTest();
		DocumentTest d4 = new DocumentTest();
	}

}
