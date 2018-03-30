import java.util.Scanner;
public class Break02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0;
		while(true) {
			System.out.println("정수 입력(0을 입력하면 종료) : ");
			num = sc.nextInt();
		if(num==0) {
			break;
		}
			sum+=num;  //sum = sum+num
			
		}
		System.out.println("입력한값의 합 :" + sum);
		}
	}


