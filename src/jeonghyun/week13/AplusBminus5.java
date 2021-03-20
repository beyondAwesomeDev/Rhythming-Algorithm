package jeonghyun.week13;

import java.util.Scanner;

public class AplusBminus5 {

	// 백준 - 10952번 A + B - 5
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			// A와 B가 둘 다 0일 경우 반복문 종료
			if(A == 0 && B == 0) {
				break;
			}
			
			// 아닐 경우, A와 B를 더해줌
			System.out.println(A+B);
		}

	}

}
