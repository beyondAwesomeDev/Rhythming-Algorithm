package jeonghyun.week14;

import java.util.Scanner;

public class maxValue {

	// 백준 - 2562번 최댓값
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		int i;
		int count = 0;
		int max = 0;
		
		for(i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
				// index는 0부터 시작이라서 +1을 해줌
				count = i+1;  
			}
		}
		
		System.out.println(max);
		System.out.println(count);
 
	}

}
