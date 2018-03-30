import java.util.Scanner;

public class DoWhile03 {
	public static void main(String[] args) {
		int month;
		String retry;
		Scanner sc = new Scanner(System.in);
		
	do {
		
		do {
		System.out.println("계절을 표시합니다. 월 입력(1-12)");
		month = sc.nextInt();
		} while(month < 1 || month > 12);
		switch(month) {
		case 3:	case 4:	case 5:
			System.out.println("봄입니다.");
			break;
		case 6:	case 7: case 8:
			System.out.println("여름입니다.");
			break;
		case 9:	case 10: case 11:
			System.out.println("가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울입니다.");
			break;
		}
		
		
		System.out.println("다시한번 입력하시겠습니까?(1-Y/2-N)");
		retry = sc.next();
	}while(retry.equalsIgnoreCase("y"));
	
	System.out.println("계절 판별 프로그램을 종료합니다.");
}
		
}
