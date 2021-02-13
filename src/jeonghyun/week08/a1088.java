package jeonghyun.week08;

import java.util.Scanner;

public class a1088 {

	public static void main(String[] args) {
		// 1부터 입력한 정수까지 1씩 증가시켜 출력하는 프로그램을 작성하되,
		// 3의 배수인 경우는 출력하지 않도록 만들어보자.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=0;i<=a;i++) {
			if(i%3==0) {  // 3의 배수는 건너뛰기
				continue;
			}else {
				System.out.println(i);
			}
		}

	}

}
