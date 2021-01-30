package jeonghyun.week06;

import java.util.Scanner;

public class a1076 {

	public static void main(String[] args) {
		// 알파벳(a~z => 97개) 1개 입력받아 알파벳 출력하기
		Scanner sc = new Scanner(System.in);
		
		char a = sc.nextLine().charAt(0);  // => 아스키코드 변환
		
		int b = (int)a;
		
		for(int i=97;i<=b;i++) {
			System.out.print((char)i + " ");
		}
		
		
		

	}

}
