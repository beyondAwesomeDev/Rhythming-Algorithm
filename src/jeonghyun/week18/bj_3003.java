package jeonghyun.week18;

import java.util.Scanner;

public class bj_3003 {

	// 백준 3003 - 킹, 퀸, 룩, 비숍, 나이트, 폰
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 기존 세트가 갖추고 있는 기물의 개수를 배열에 저장
		int[] arr = {1,1,2,2,2,8};
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = arr[i] - sc.nextInt();
			
			System.out.print(arr[i] + " ");
		}

	}

}
