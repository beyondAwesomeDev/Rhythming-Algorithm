package jeonghyun.week03;

import java.util.Scanner;

public class a1025 {

	public static void main(String[] args) {
		//정수 1개 입력받아 나누어 출력하기
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] ch = a.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			System.out.print("[" + ch[i]);
			for(int j=ch.length-1;j>i;j--) {   // j>i => 입력을 받는 자리 숫자
				System.out.print("0");
			}
			System.out.print("]\n");
		}
		

	}

}
