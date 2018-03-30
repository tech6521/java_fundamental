import java.util.Scanner;

public class MethodTest04 {
	
	//메소드 정의
	public static void drowStar(int n) {
		
			//for문
			/*for(int i=1; i<=n; i++) {
				System.out.print("* ");
			}
			System.out.println();*/
			
			//while문
			/*int i = 1;
			while(i<=n) {
				System.out.print("* ");
				i++;
			}*/
			
			// do ~ while문
			int i=1;
			do {
				System.out.print("* ");
				i++;
			}
			while(i<=n);
			
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" -- 메소드로 나누어 별표 뽑기 -- ");
		System.out.print("정수입력 :");
		int n = sc.nextInt();
		
		//방법1 - 메소드로 나누지 않았을때
		/*for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		//방법2 - 메소드로 나누었을때
		for(int i=1; i<=n; i++) {
			drowStar(i);
			System.out.println();
		}
		
		sc.close();
	}

}
