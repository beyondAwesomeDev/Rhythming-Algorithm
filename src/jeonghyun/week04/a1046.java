package jeonghyun.week04;

import java.util.Scanner;

public class a1046 {

	public static void main(String[] args) {
		// 정수 3개 입력받아 합과 평균 출력하기
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		double avg = (a + b + c)/3;
		//System.out.println("합 : " + a+b+c + "\n평균 : " + avg);
		System.out.printf("%d\n%.1f", a+b+c, avg);
		

	}

}
