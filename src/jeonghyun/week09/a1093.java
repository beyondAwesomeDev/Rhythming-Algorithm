package jeonghyun.week09;

import java.util.Scanner;

public class a1093 {

	public static void main(String[] args) {
		// 출석 번호를 n번 무작위로 불렀을 때, 각 번호(1 ~ 23)가 불린 횟수를 각각 출력해보자.
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 학생들 번호 23번까지 배열로
		int[] stu = new int[24];
		
		// 출석번호를 n번동안 무작위로 불렀을 때의 반복문
		for(int i=0;i<num;i++) {
			int n = sc.nextInt();
		    stu[n-1] += 1;
		}
		
		// 1~23번까지의 출석번호 (22번의 반복문)
		for(int i=0;i<23;i++) {
			System.out.println(stu[i] + " ");
		}
		
		
 		
		
		
		

	}

}
