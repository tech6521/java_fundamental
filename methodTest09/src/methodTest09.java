import java.util.Arrays;
import java.util.Scanner;


public class methodTest09 {
	
	// 1번 방법 - 1개를 찾으면 바로 리턴하는 검색메소드 (2개 검색 불가)
	public static int linearSearch(int[] x, int k) {
			for(int i=0;i<x.length;i++) {
				if(k == x[i]) {
					return i;
					
				}
			}
			return -1;
	}
	
	// 2번 방법 - 2개 이상 찾았을때도 가능한 검색 메소드
	public static int linearSearch2(int[] x, int k) {
		int count=0;
		for(int i=0; i<x.length;i++) {
			if(x[i] == k) {
				System.out.print((i+1) + "번째 ");
				++count;
			}
		}
		return count;
	}
	
	
	//검색한 값의 갯수
	public static int serch(int[] x, int k, int sum) {
		for(int i=0;i<x.length;i++) {
			if(k == x[i]) {
				sum++;
			}
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("--- 선향 검색 프로그램 ---");
		System.out.print("배열의 갯수 입력 :");
		int n = sc.nextInt();
		
		
		
		
		
		System.out.print("검색할 값 입력   :");
		int key = sc.nextInt();
		
		int [] a = new int[n];
		
		for(int i=0; i<n;i++) {
			a[i] = (int) (Math.random()*10) + 1;
		}
		
		System.out.println(Arrays.toString(a));
		
		
		
		
		//1번 방법으로 메소드 활용
		/*int findIdx = linearSearch(a, key);
		
		if(findIdx == -1) {
			System.out.println("검색값은 존재하지않습니다.");
		} else {
			System.out.println("검색한 값은" + (findIdx+1) + "번째 있습니다.");
		}
		System.out.println();
		
		sum = serch(a, key, sum);
		
		System.out.println("검색한 값은 " + sum + "개 있습니다.");*/
		
		
		//2번 방법으로 메소드 활용(2개 이상검색)
		int count = linearSearch2(a, key);
		if(count ==0) {
			System.out.println("검색한 값은 존재하지 않습니다.");
		}else {
			System.out.println("있습니다.\n검색한 값이" + count + "개 있습니다.");
		}
		
		
		
		sc.close();
	}

}
