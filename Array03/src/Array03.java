import java.util.Scanner;
public class Array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ******학생 성적 처리 프로그램(배열 활용)*******");
		System.out.printf("학생 수 입력 :");
		int n = sc.nextInt();
		
		
		int[] st = new int[n];
		int sum=0;
		
		for(int i=0;i<st.length;i++) {
			System.out.printf((i+1) + "번째 학생 점수 :");
			st[i] = sc.nextInt();
			sum+=st[i];
			System.out.println(i+1 + "번의 학생의 점수는" + st[i] + "입니다.");
		}
		System.out.println(st.length + "명 점수의의 합계: " + sum);
		System.out.println(st.length + "명의 점수의 평균: " + (double)sum/st.length);
	}

}
