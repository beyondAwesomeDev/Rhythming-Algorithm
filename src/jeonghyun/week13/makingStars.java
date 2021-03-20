package jeonghyun.week13;

import java.util.Scanner;

public class makingStars {

	// 백준 - 2438번 별 찍기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1행부터 N행까지의 출력을 위해
		int N = sc.nextInt();
		
		// i는 행을 의미
		for(int i=1;i<=N;i++) {
			// 내부 for문의 j는 i만큼 반복
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			// 한 행의 출력이 끝나면 줄바꿈을 해주기 위해
			System.out.println();
		}

	}

}
