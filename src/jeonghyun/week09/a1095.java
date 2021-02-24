package jeonghyun.week09;

import java.util.ArrayList;
import java.util.Scanner;

public class a1095 {

	public static void main(String[] args) {
		// 출석 번호를 n번 무작위로 불렀을 때, 가장 빠른 번호를 출력해 보자.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int numbers = 0;
		int min = 0;
		for(int i=0;i<num;i++) {
			numbers = sc.nextInt();
			
			if(i == 0) {
				// i가 0이면 최소값을 numbers에 대입
				min = numbers;
			}else if(min>numbers) {
				// or, 최소값이 numbers보다 클 때 최소값에 numbers를 대입
				min = numbers;
			}
		}
		System.out.println(min);
	}

}
