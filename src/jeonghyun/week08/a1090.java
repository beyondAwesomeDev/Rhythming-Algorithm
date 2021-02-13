package jeonghyun.week08;

import java.util.Scanner;

public class a1090 {

	public static void main(String[] args) {
		// 시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)가 입력될 때
		// n번째 수를 출력하는 프로그램을 만들어보자.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		
		long num = 0;
		
		num = (long)(a*Math.pow(r, n-1));   // math.pow => 제곱함수
		System.out.println(num);            // ex) math.pow(2,4) => 16 (2는 밑, 4는 지수)
		
		
		
		

	}

}
