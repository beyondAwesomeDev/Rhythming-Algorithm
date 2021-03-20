package jeonghyun.week13;

import java.util.Scanner;

public class numbersOfNum {

	// 백준 - 2577번 숫자의 개수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		// 10으로 나눈 나머지는 1의 자리 수
		int[] count = new int[10];
		int number = A * B * C;
		// 나머지를 구해서 0~9 인덱스를 가지는 배열에 카운트를 더함
		// 실제 숫자는 10으로 나누기 (while문 반복 진행)
		while (number > 0) {
			count[number % 10]++;
			number /= 10;
		}
		
		for(int i=0;i<count.length;i++) {
			System.out.println(count[i]);
		}

	}

}
