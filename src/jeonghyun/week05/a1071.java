package jeonghyun.week05;

import java.util.Scanner;

public class a1071 {

	public static void main(String[] args) {
		// 0 입력될 때까지 무한 출력하기1
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		while(true) {   // 갯수를 모를 때 => for X, while 반복문 사용
			a = sc.nextInt();
			if(a == 0)   break;
			System.out.println(a);
		}
		

	}

}
