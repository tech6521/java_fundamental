
public class EnhanceForTest {
	public static void main(String[] args) {
		int [] a = new int[] {10,20,30,40,50};
		
		//기본 for문
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		//확장 for문
		for(int i : a) {
			System.out.println(i);
		}
	}

}
