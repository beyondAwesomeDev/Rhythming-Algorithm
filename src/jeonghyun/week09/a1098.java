package jeonghyun.week09;

import java.util.Scanner;

public class a1098 {

	public static void main(String[] args) {
		// 격자판의 세로(h), 가로(w), 막대의 개수(n), 각 막대의 길이(l),
		// 막대를 놓는 방향(d:가로는 0, 세로는 1)과
		// 막대를 놓는 막대의 가장 왼쪽 또는 위쪽의 위치(x, y)가 주어질 때,
		// 격자판을 채운 막대의 모양을 출력하는 프로그램을 만들어보자.
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int H = sc.nextInt(); 
		int W = sc.nextInt();
		// 0은 입력되지 않음, 1부터 입력되서 최대 100*100까지 배열
		int[][] arr = new int[H+1][W+1];
		// 반복되는 횟수 입력받기 => 막대의 갯수
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			// 길이
			int L = sc.nextInt(); 
			// 방향
			int D = sc.nextInt(); 
			// X, Y 좌표
			int X = sc.nextInt(); 
			int Y = sc.nextInt();
			
			// 가로가 0일떄
			if(D == 0) {
				for(int j=0;j<L;j++) {
					arr[X][Y+j] = 1;
				}
			}else if(D == 1) {  // 가로가 1일때
				for(int j=0;j<L;j++) {
					arr[X+j][Y] = 1;
				}
			}
			
		}
		// 출력하기
		for(int i=1;i<=H;i++) {
			for(int j=1;j<=W;j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
