import java.util.Scanner;
public class Loop01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("**** 정사각형 만드는 프로그램 ****");
		System.out.println("정수 입력:");
		int n = sc.nextInt();
		/*//for문
		for( int i=1;i<=n;i++) {	
			
			for(int j=1;j<=n;j++) {
			System.out.print("* ");
			}
			System.out.println();
		}*/
		
		
		//while문
		/*int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}*/
		
		//do while문
		
		int i=1;
		do {
			int j=1;
			do {
				System.out.print("* ");
				j++;
			}while(j<=n);
			
			System.out.println();
			i++;
		}while(i<=n);
		
		sc.close();
	}

}
