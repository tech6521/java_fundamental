import java.util.Scanner;

public class Array2Dtest05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행(열) 수 입력 : ");
		int n = sc.nextInt();
		
		int[][] a = new int[n][n];
		int k = 1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j] = k++;
			}
		}
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
				
		
	}

}
