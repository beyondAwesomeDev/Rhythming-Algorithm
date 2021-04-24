package jeonghyun.week17;

import java.util.ArrayList;
import java.util.Scanner;

public class bj_2465 {
	
    // 백준 2465번 - 줄 세우기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 학생 수
		int N = sc.nextInt();
		
		// 줄
		ArrayList<Integer> List = new ArrayList<>();
		
		List.add(-1);
		
		// 학생 수 만큼 번호 넣기
		for(int i=1;i<=N;i++) {
			int num = sc.nextInt();
			List.add(i-num, i);
		}
		
		for(int i=1;i<=N;i++) {
			System.out.println(List.get(i));
		}
		
		

	}

}
