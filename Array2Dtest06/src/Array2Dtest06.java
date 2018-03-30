import java.util.Scanner;

public class Array2Dtest06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[4][5];
		String retry = null;
		do {
			System.out.printf("행운의 수(1~45) :");
			int user = sc.nextInt();
			
			
			
			//2차원 배열에 난수를 생성해서 대입 및 출력
			for(int i=0; i<a.length;i++) {
				for(int j=0; j<a[i].length;j++) {
					a[i][j] = (int) (Math.random() * 45) + 1;
					if(user == a[i][j]) {
						System.out.printf("%5d", a[i][j]);
					} else {
						System.out.printf("%5d", a[i][j]);
					}
					
				}
				
				System.out.println();
			}
			
			// 행운의 수와 2차원 배열의 값(난수)를 비교
			int count = 0;
			
				for(int i=0; i<a.length;i++) {
					for(int j=0; j<a[i].length;j++) {
						if(user == a[i][j]) {
							++count;
						}
					}
				}
				
				//결과를 출력
				switch(count) {
				default: 
					System.out.println("울트라 대박인 복입니다.");
					
					break;
				case 4: 
					System.out.println("대박인 날입니다.");
					break;
					
				case 3: 
					System.out.println("운수 대통인 날입니다.");
					break;
					
				case 2: 
					System.out.println("운이 좋은날입니다.");
					break;
					
				case 1: 
					System.out.println("괜찮은 날입니다.");
					break;
					
				case 0: 
					System.out.println("보통 날입니다.");
					break;
				}
				
				System.out.println("맞추신 갯수는" + count + "입니다.");
				System.out.println();
				System.out.print("한번더 하시겠습니까?(y/n) :");
				
				retry = sc.next();
	} while(retry.equalsIgnoreCase("y"));
		
		
		sc.close();
		
	}
}



