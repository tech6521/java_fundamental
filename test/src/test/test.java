package test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("정수입력 :");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=9;j++) {
				
				System.out.printf(i + "*" + j + "=" + (i*j));
				System.out.print(" ");
				
			}
			System.out.println();
		}
	}

}
