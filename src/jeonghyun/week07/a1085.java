package jeonghyun.week07;

import java.util.Scanner;

public class a1085 {

	public static void main(String[] args) {
		// 소리 파일 저장용량 계산하기
		
		Scanner sc = new Scanner(System.in);
		
		double h = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double s = sc.nextInt();
		
		double cal = (h*b*c*s)/8/1024/1024;
		
		System.out.printf("%.1f MB", cal);
		

	}

}
