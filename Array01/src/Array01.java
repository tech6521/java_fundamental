import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.print("1번 학생 점수 : ");
		int s1 = sc.nextInt();
		sum += s1;
		System.out.println("1번의 학생의 점수는" + s1 + "입니다.");
		
		System.out.print("2번 학생 점수 : ");
		int s2 = sc.nextInt();
		sum += s2;
		System.out.println("1번의 학생의 점수는" + s2 + "입니다.");
		
		System.out.print("3번 학생 점수 : ");
		int s3 = sc.nextInt();
		sum += s3;
		System.out.println("1번의 학생의 점수는" + s3 + "입니다.");
		
		System.out.print("4번 학생 점수 : ");
		int s4 = sc.nextInt();
		sum += s4;
		System.out.println("1번의 학생의 점수는" + s4 + "입니다.");
		
		System.out.print("5번 학생 점수 : ");
		int s5 = sc.nextInt();
		sum += s5;
		System.out.println("1번의 학생의 점수는" + s5 + "입니다.");
		
		System.out.println("5명의 합계?" + sum);
		System.out.println("5명의 평균?" + (double)sum/5);
		
	}

}
