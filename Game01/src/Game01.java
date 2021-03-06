import java.util.Scanner;

public class Game01 {
	public static void	main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = {"가위", "바위", "보"};
		int[] score = new int[3]; //가위바위보 승패비김 수를 저장
		String retry;
		
		System.out.println("*** 가위바이보 게임 ****");
		do {
			System.out.print("유저입력(0-가위/1-바위/2-보) : ");
			int user = sc.nextInt();
			int com = (int) (Math.random()*3);
			
			System.out.println("유저는 " + s[user] + "이고, 컴퓨터는" + s[com] + "입니다.");
			
			int result = (user - com + 3) % 3;
			switch(result) {
			case 1:
				System.out.println("user가 승리하였습니다");
				++score[1];
				break;
			case 2:
				System.out.println("user가 패배하였습니다. com이 승리하였습니다.");
				++score[2];
				break;
			case 0:
				System.out.println("user와 com이 비겼습니다.");
				++score[0];
				break;
			}
			System.out.println("한번더 하시겠습니까?(y/n) :");
			retry = sc.next();
		} while(retry.equalsIgnoreCase("y"));
		
		System.out.println("유저의 승률 :" + score[1] + "승" + score[2] + "패" + score[0] + "무승부");
		
	sc.close();
	}
}
