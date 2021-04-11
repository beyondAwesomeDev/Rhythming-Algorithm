package jeonghyun.week16;

import java.util.Scanner;

public class plug {

	// 백준 2010번 - 플러그
	public static void main(String[] args) {
		
		// 플러그에 다른 플러그를 꼽기 위해 한 개의 자리가 없다고 쳐야함
		
       int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
			int num = sc.nextInt();
			sum += num;
		}
		
		System.out.println(sum-(cnt-1));

	}

}
