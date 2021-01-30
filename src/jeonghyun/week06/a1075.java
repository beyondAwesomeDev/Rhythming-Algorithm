package jeonghyun.week06;

import java.util.Scanner;

public class a1075 {

	public static void main(String[] args) {
		// 정수 1(1~100)개 입력받아 카운트다운 출력하기2
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		for(int i=a-1;i>=0;i--) {
			System.out.println(i);
		}
		

	}

}
