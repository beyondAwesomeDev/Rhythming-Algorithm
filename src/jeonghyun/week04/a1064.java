package jeonghyun.week04;

import java.util.Scanner;

public class a1064 {

	public static void main(String[] args) {
		// 정수 3개 입력받아 가장 작은 수 출력하기(삼항연산)
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a<b?a:b)<c?(a<b?a:b):c);
		
		

	}

}
