package jeonghyun.week07;

import java.util.Scanner;

public class a1082 {

	public static void main(String[] args) {
		// A, B, C, D, E, F 중 하나가 입력될 때,
		// 1부터 F까지 곱한 16진수 구구단의 내용을 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		// 문자 a를 16진수로 변환
		int num = Integer.parseInt(a, 16);
		
		for(int i=1;i<16;i++) {
			System.out.printf("%x*%x=%x\n", num, i, (num*i));
		}                     // %x => 16진수로 출력

	}

}
