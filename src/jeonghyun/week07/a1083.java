package jeonghyun.week07;

import java.util.Scanner;

public class a1083 {

	public static void main(String[] args) {
		// 3 6 9 게임을 하던 영일이는 3 6 9 게임에서 잦은 실수로 계속해서 벌칙을 받게 되었다.
		// 3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			if(i % 3 == 0) {
				System.out.println("X");
			}else if(i % 3 != 0) {
				System.out.println(i + " ");
			}
		}


	}

}
