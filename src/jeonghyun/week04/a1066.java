package jeonghyun.week04;

import java.util.Scanner;

public class a1066 {

	public static void main(String[] args) {
		// 정수 3개 입력받아 짝/홀 출력하기
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("a는 짝수");
		}else {
			System.out.println("a는 홀수");
		}
		if(b % 2 == 0) {
			System.out.println("b는 짝수");
		}else {
			System.out.println("b는 홀수");
		}
		if(c % 2 == 0) {
			System.out.println("c는 짝수");
		}else {
			System.out.println("c는 홀수");
		}
		

	}

}
