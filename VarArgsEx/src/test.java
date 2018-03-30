import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
			System.out.println("밑변의 길이를 입력하세요");
			int n = sc.nextInt();
			
			for(int i=0;i<n-3;i++) {
					for(int z=1;z<(n-i)-3;z++) {
						System.out.printf(" ");
					}
				for(int j=1;j<=(i*2)+1;j++) {
					System.out.printf("*");
				}
				System.out.println();
			}
	}
}

