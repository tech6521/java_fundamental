package holGame;

import java.util.*;

public class holGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int user=0;
		double money = 0; //배팅금액
		double userMoney =0; //사용자 금액
		double cho=0; //충전금액
		
		
		
		
		
		String retry;
		
		do {
		
			while(cho<10000) {
				System.out.printf("충전금액(10000단위로 충전가능합니다.):");
				cho = sc.nextInt();
				
				if(cho < 10000) {
					System.out.println("10000원 이상으로 충전해주세요");
				} 
			}
		
			
			userMoney = cho + userMoney;
		
		
		do {
		System.out.println("****** 홀짝게임 ******");
		
		System.out.printf("배팅할 금액을 입력하세요:");
		money = sc.nextInt();
		userMoney = userMoney-money;
		
		System.out.printf("*0=홀,1=짝 너의선택은?");
		user = sc.nextInt();
		
		
		for(int i=0;i<=5;i++) {
			System.out.println(".");
		}
		
		
		int com = (int) (Math.random()*2); //홀짝 랜덤으로 돌리는것
		System.out.println("**************************");
		System.out.println("요번회차는?" + com + "입니다(0= 홀,1= 짝)");
		System.out.println("**************************");
		
		if(user==com) {
			userMoney = userMoney + (money*1.97);
			System.out.println("적중하셨습니다. 축하드립니다.");
		} else {
			System.out.println("미적중 다음에 딸 거에요");
		}
		
		
		
		System.out.println("남은 금액:" + userMoney);
		
		System.out.println("한번 더 하시겠습니까?(y/n) : ");
		retry = sc.next();
		} while(retry.equalsIgnoreCase("y"));
		
		System.out.println("충전하시겠습니까?(y/n) : ");
		retry = sc.next();
		}while(retry.equalsIgnoreCase("y"));
		
		System.out.println("수고하셨습니다. 홀짝게임을 종료합니다.");
		
		sc.close();
	}

}
