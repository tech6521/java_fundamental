import java.util.Scanner;

public class Array2Dtest07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("*** 성적 처리 프로그램 ***");
		System.out.printf("학생 수 입력:");
		
		int n = sc.nextInt();
		int [][] a = new int[n][7];
		String[] subject = {"", "국어", "영어", "수학"}; 
		String[] title = {"NO", "KOR", "ENG", "NAT", "SUM", "AVG", "RANK"};
		
		
		// 학생별로 세 과목씩 성적 입력
		
		for(int i=0;i<a.length;i++) {
					System.out.println("---" + (i+1) + "번째 점수입력 ---");
					a[i][0] = i+1;
					
			for(int j=1;j<4;j++) {
				System.out.print(subject[j] + " 과목 입력 :");
				a[i][j] = sc.nextInt();
			}
		}
		
		
		//학생의 총점과 평균을 계산하는 부분.
		for(int i=0;i<n;i++) {
				int sum = 0;
			for(int j=1;j<4;j++) {
				sum = sum + a[i][j];
				
				
			}
			a[i][4] = sum;
			a[i][5] = sum / 3;
		}
		
		
		//학생의 석차를 계산하는 부분
		int rank=1;
		
		for(int i=0; i<n;i++) {
			for(int j=1; j<5;j++) {
				if(a[i][4] < a[j][4]) {
					++rank;
				}
			}
			a[i][6] = rank;
		}
		
		// 학생의 전체 결과를 출력하는 부분
		
		System.out.println("---- 학생 성적 출력 ----");
		for(int i=0; i<title.length;i++) {
			System.out.printf("%6s", title[i]);
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%6d", a[i][j]);
			}
			System.out.println();
		}
	}

}
