package test;

import java.util.Scanner;

public class max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		
		int[] arr1 = {60, 50, 70, 80, 90};
		
		
		int tmp=0;
		
	
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] < arr1[i+1]) {
				tmp = arr1[i];
				arr1[i]= arr1[i+1];
				arr1[i+1] = tmp;
			}
				System.out.println(arr1[i]);
			}
		}
		
	}


