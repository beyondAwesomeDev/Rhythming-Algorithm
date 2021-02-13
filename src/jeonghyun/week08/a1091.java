package jeonghyun.week08;

import java.util.Scanner;

public class a1091 {

	public static void main(String[] args) {
		// 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때,
		// n번째 수를 출력하는 프로그램을 만들어보자.
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long m = sc.nextLong();
		long d = sc.nextLong();
		long n = sc.nextLong();
		
		for(int i=1;i<n;i++) {
			a = (a*m) + d;
		}
		
		System.out.println(a);
		
		


	}

}
