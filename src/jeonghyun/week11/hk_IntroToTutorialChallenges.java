package jeonghyun.week11;

import java.util.Scanner;

public class hk_IntroToTutorialChallenges {

	static int introTutorial(int V, int[] arr) {
		int i=0;
		for (i = 0; i < arr.length; i++) {
			if (V == arr[i])
				break;
		}
		return i;	
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt(); // 4
		int len = sc.nextInt(); // 6

		// 배열은?
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(introTutorial(V, arr)+", ans: 1");
	}

}
