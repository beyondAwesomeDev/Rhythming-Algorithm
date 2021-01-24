package jeonghyun.week05;

import java.util.Scanner;

public class a1072 {

	public static void main(String[] args) {
		// 정수 입력받아 계속 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		
		// 배열 입력
		for(int i=0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		
		// 배열 출력
		for(int i=0;i<a;i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}
