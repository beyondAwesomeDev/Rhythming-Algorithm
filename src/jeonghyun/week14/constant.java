package jeonghyun.week14;

import java.util.Scanner;

public class constant {

	// 백준 - 2908번 상수
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 세 자리 수 입력
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 입력받은 수 = 세자리수, 일의자리가 100의자리, 100의자리는 1의 자리로
		a = (a % 10) * 100 + ((a % 100) / 10) * 10 + (a / 100);
		// (a%10)*100 => a를 10으로나누고 나머지(1의자리 추출) => 100을 곱해서 더해주면 100의 자리로감
		// ((a % 100) / 10) * 10 => a를 100으로 나누고 나머지
		// (a/100) => a를 100으로 나누고 몫만 가져옴, 100의자리수 추출됨, 그대로 더하면 1의 자리수로 감
		
		
		b = (b % 10) * 100 + ((b % 100) / 10) * 10 + (b / 100);
		
		// a와 b를 비교해서 더 큰 값 출력
		System.out.println(a>b? a: b);
		

	}

}
