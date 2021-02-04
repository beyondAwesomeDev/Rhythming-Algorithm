package jeonghyun.week07;

import java.util.Scanner;

public class a1081 {

	public static void main(String[] args) {
		// 1부터 n까지, 1부터 m까지 숫자가 적힌
		// 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력하기
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.println(i + " " + j);
			}
		}

	}

}
