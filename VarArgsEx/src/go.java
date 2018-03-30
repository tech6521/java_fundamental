import java.util.Scanner;

public class go {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		System.out.printf("학생은 몇명입니까? :");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] guk = new int[n];
		int[] su = new int[n];
		int[] en = new int[n];
		double[] sum = new double[n];
		double[] avg = new double[n];
		String[] table = new String[7];
		int[][] student = new int[n][7];
		
		table[0] = "순번";
		table[1] = "이름";
		table[2] = "국어점수";
		table[3] = "수학점수";
		table[4] = "영어점수";
		table[5] = "합계";
		table[6] = "평균";
			
		for(int i=0;i<table.length;i++) {
			 System.out.printf(table[i] + "    ");
		}
		
		System.out.println();
		
		for(int i=0;i<student.length;i++) {
			student[i][0] = i+1;
			student[i][i] = 1;
			System.out.println(student[i][i]);
		}
		
		
		
		
		
		
		
		
		System.out.println("****성적 출력 프로그램****");
		
		for(int i=0;i<=3;i++) {
		System.out.println();
		}
		
		
		for(int i=0;i<n;i++) {
			System.out.println("이름을 입력하세요");
			name[i] = sc.next();
			
			if(guk[i] > 100 || su[i] > 100 || en[i] > 100) {
				System.out.println("다시입력해주세요");
			}else {
				System.out.println();
				System.out.println(name[i] + "님의 국어점수를 입력해주세요");
				guk[i] = sc.nextInt();
				
				System.out.println(name[i] + "님의 수학점수를 입력해주세요");
				su[i] = sc.nextInt();
				
				System.out.println(name[i] + "님의 영어점수를 입력해주세요");
				en[i] = sc.nextInt();
			}
		
			sum[i] = (double) guk[i] + su[i] + en[i];
			avg[i] = sum[i]/3;
		}
		
		
		
		for(int i=0;i<n;i++) {
			System.out.println(name[i] + "의 성적은");
			
			System.out.println("국어: " + guk[i] + "입니다.");
			System.out.println("수학: " + su[i] + "입니다.");
			System.out.println("영어: " + en[i] + "입니다.");
			System.out.println("합계: " + sum[i] + " 평균: " + avg[i] + " 입니다.");
		}
		
		
		
		
		
	}
	
	
}
