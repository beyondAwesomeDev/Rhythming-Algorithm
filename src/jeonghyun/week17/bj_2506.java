package jeonghyun.week17;

import java.util.Scanner;

public class bj_2506 {
	
    // 백준 2506번 - 점수 계산
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int count = 0;
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			if(arr[i] == 1) {
				count ++;  // 연속된 수 체크하면서, 연속되는 경우에는 count를 하나씩 더해주어
				sum += count;  // sum에 더해줌
			}else {
				// 연속된 값 체크시, 연속되지 않을 경우 0으로 초기화하여 검색
				count = 0;  
			}
		}
		
		System.out.println(sum);

	}

}
