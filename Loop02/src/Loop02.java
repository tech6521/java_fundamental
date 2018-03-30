import java.util.Scanner;

public class Loop02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 :");
		int n =sc.nextInt();
		
		//1번
	/*for(int i=0;i<=n;i++) {
		for(int j=0;j<=i;j++) {
			
			System.out.printf("* ");
			}
		System.out.println();
		
	}*/
		//2-1
		/*for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				
				System.out.printf("* ");
				}
			System.out.println();
		}*/
		
		//2-2
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				
				System.out.printf("* ");
				}
			System.out.println();
		}*/
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		
		
		
		sc.close();
	}

}
