import java.util.Scanner;

public class gogo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n =new int[5];
		int sum=0;
		float avg=0;
		System.out.println("Test Data");
		

		for(int i=0;i<5;i++) {
			System.out.println("input the " + i+1 + " number: ");
			n[i] = sc.nextInt();
			sum = sum + n[i];
		}
			avg = sum/5;

			System.out.println("the sum of 5 no is : " + sum);
			System.out.println("the Average is : " + avg);	

	}
	
	
	}
	
	
