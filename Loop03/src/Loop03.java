import java.util.Scanner;
public class Loop03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력: ");
		int n = sc.nextInt();
		
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.printf(" ");
			}
			
			for(int j=1;j<=n+1-i;j++) {
				
				System.out.printf("*");
			}
			
			System.out.println();
		}*/
		
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.printf(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}*/
		
		
		/*for(int i=1; i<=n ; i++) {
				
			for(int j=1;j<=n;j++) {
				
				if(i<=j) {
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}
				
			}
			System.out.println();
			
		}*/
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j >= n+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
