import java.util.Scanner;

public class MethodTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] height = new int[3];
		int[] weight = new int[3];
		int[] age = new int[3];
		
		for(int i=0; i<height.length;i++) {
			System.out.println("----" + (i+1) + "번째 학생 ----");
			System.out.print("신장 : ");
			height[i] = sc.nextInt();
			System.out.print("체중 : ");
			weight[i] = sc.nextInt();
			System.out.printf("나이 : ");
			age[i] = sc.nextInt();
		}
		
		int maxHeight = height[0];
		if(maxHeight < height[1]) { maxHeight = height[1]; }
		if(maxHeight < height[2]) { maxHeight = height[2]; }
		
		int maxweight = weight[0];
		if(maxweight < weight[1]) { maxweight = weight[1]; }
		if(maxweight < weight[2]) { maxweight = weight[2]; }
		
		
		int maxage = age[0];
		if(maxage < age[1]) { maxage = age[1]; }
		if(maxage < age[2]) { maxage = age[2]; }
		
		
		System.out.println("신장의 최댓값 : " + maxHeight);
		System.out.println("체중의 최댓값 : " + maxweight);
		System.out.println("나이의 최댓값 : " + maxage);
		
			sc.close();
		
	}
}


