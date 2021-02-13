package jeonghyun.week08;

import java.util.Scanner;

public class a1092 {

	public static void main(String[] args) {
		// 3명이 다시 모두 함께 방문해 문제를 풀어보는 날(동시 가입/등업 후 며칠 후?)을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int day = 1;
		
		// a,b,c의 조건이 모두 충족되는 날 일 때 (=a,b,c의 최소공배수)
		while(day % a != 0 || day % b != 0 || day % c != 0) {
			day++;
			
		}
		System.out.println(day);
	

	}

}
