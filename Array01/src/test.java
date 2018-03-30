import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("****성적처리프로그램****");
		System.out.println("학생은 몇명입니까?");
		int n = sc.nextInt();
		
		String[] name= new String[n];
		int[] num = new int[n];
		
		
		for(int i=0;i<name.length;i++) {
			
			System.out.printf(i+1 + "번째" + "학생이름: ");
			name[i] = sc.next();
			System.out.println();
			
			
		}
		for(int i=0;i<name.length;i++) {
		System.out.println(name[i]);
		}
		
	
	}

}
