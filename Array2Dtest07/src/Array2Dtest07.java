import java.util.Scanner;

public class Array2Dtest07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("*** ���� ó�� ���α׷� ***");
		System.out.printf("�л� �� �Է�:");
		
		int n = sc.nextInt();
		int [][] a = new int[n][7];
		String[] subject = {"", "����", "����", "����"}; 
		String[] title = {"NO", "KOR", "ENG", "NAT", "SUM", "AVG", "RANK"};
		
		
		// �л����� �� ���� ���� �Է�
		
		for(int i=0;i<a.length;i++) {
					System.out.println("---" + (i+1) + "��° �����Է� ---");
					a[i][0] = i+1;
					
			for(int j=1;j<4;j++) {
				System.out.print(subject[j] + " ���� �Է� :");
				a[i][j] = sc.nextInt();
			}
		}
		
		
		//�л��� ������ ����� ����ϴ� �κ�.
		for(int i=0;i<n;i++) {
				int sum = 0;
			for(int j=1;j<4;j++) {
				sum = sum + a[i][j];
				
				
			}
			a[i][4] = sum;
			a[i][5] = sum / 3;
		}
		
		
		//�л��� ������ ����ϴ� �κ�
		int rank=1;
		
		for(int i=0; i<n;i++) {
			for(int j=1; j<5;j++) {
				if(a[i][4] < a[j][4]) {
					++rank;
				}
			}
			a[i][6] = rank;
		}
		
		// �л��� ��ü ����� ����ϴ� �κ�
		
		System.out.println("---- �л� ���� ��� ----");
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