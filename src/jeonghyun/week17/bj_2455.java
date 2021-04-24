package jeonghyun.week17;

import java.util.Scanner;

public class bj_2455 {

	// 백준 2455번 - 기능형 기차
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int people = 0;
		int ans = 0;
		
		for(int i=0;i<4;i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			// 탑승자는 더해주고 하차하는 사람은 빼주기
			people += end;
			people -= start;
			
			if(ans < people)
				ans = people;
		}
	
		System.out.println(ans);

	}

}
