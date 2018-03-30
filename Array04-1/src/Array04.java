//import java.util.Random;
//import java.util.Scanner;
import java.util.*;

public class Array04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random(10);
		
		
		System.out.println("*** 최댓값, 최솟값 구하는 프로그램 ***");
		
		int [] a = new int[10];
		
		
		// 1번 방법 - 점수를 직접 입력
		for(int i=0;i<a.length;i++) {
			System.out.println((i+1) +"번째 점수 입력:");
			a[i] = sc.nextInt();
		}
		
		// 2번 방법 - 정수를 난수로 생성
		/*System.out.print("[");
		for(int i=0; i<a.length;i++) {
			a[i] = r.nextInt(20);
			System.out.print(a[i] + ", ");
		}
		System.out.println("]");*/
		
		
		int max = a[0], min = a[0];
				
		for(int i=1;i<a.length;i++) {
			if (max < a[i]) {
				max = a[i];
			}
			
			if(min > a[i]) {
				min = a[i];
			}
		}	
			
		System.out.println(max);
		System.out.println(min);
			
	}

}
