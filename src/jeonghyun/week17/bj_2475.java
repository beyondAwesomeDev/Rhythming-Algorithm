package jeonghyun.week17;

import java.util.Scanner;

public class bj_2475 {
	
	// 백준 2475번 - 검증수
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		for(int i=0;i<5;i++) {
			int a = sc.nextInt();
			
			result += Math.pow(a, 2);
		}
		
		System.out.println(result % 10);

	}

	
}
