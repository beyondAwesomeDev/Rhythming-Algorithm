package jeonghyun.week06;

import java.util.Scanner;

public class a1079 {

	public static void main(String[] args) {
		// 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		char a = sc.next().charAt(0);
		
		if(a == 'q') {
			System.out.println(a);
			break;
		}
		System.out.println(a);
		

	}
		
	}
	
}
