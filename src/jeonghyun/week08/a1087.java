package jeonghyun.week08;

import java.util.Scanner;

public class a1087 {

	public static void main(String[] args) {
		// 1, 2, 3 ... 을 순서대로 계속 더해나갈 때,
		// 그 합이 입력한 정수보다 작을 동안만 계속 더하는 프로그램을 작성해보자.
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int sum = 0;
		for(int i=0;i<=a;i++) {
			sum += i;
			if(sum >= a) {   // 합이 입력된 정수보다 작거나 같을 동안에만 더하기
				break;
			}
		}
		System.out.println(sum);
		
	}

}
