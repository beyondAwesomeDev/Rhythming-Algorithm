package jeonghyun.week18;

import java.util.Scanner;

public class bj_5717 {

	// 백준 5717 - 상근이의 친구들
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0)
				break;
			
			System.out.println(a + b);
		}
		
		sc.close();

	}

}
