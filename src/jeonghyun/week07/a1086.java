package jeonghyun.week07;

import java.util.Scanner;

public class a1086 {

	public static void main(String[] args) {
		// 그림 파일 저장용량 계산하기
		
		Scanner sc = new Scanner(System.in);
		
		double w = sc.nextInt();
		double h = sc.nextInt();
		double d = sc.nextInt();
		
		double cal = (w*h*d)/8/1024/1024;
		System.out.printf("%.2f MB", cal);
		
		

	}

}
