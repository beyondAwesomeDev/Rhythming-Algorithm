package jeonghyun.week08;

import java.util.Scanner;

public class a1089 {

	public static void main(String[] args) {
		// 시작 값(a), 등차(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때
		// n번째 수를 출력하는 프로그램을 만들어보자.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //시작값
		int d = sc.nextInt(); //등차
		int n = sc.nextInt(); //정수
		
		int num = a + (n-1)*d;    
		
		System.out.println(num);

	}

}
