package jeonghyun.week06;

import java.util.Scanner;

public class a1078 {

	public static void main(String[] args) {
		// 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구하기
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int sum = 0;
		for(int i=0;i<=a;i++) {
			if(i%2 == 0) {
				sum = sum+i;
				
			}
		}
		
		System.out.println(sum);

	}

}
