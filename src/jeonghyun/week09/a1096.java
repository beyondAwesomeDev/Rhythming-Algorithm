package jeonghyun.week09;

import java.util.Scanner;

public class a1096 {

	public static void main(String[] args) {
		// 바둑판(19 * 19)에 n개의 흰 돌을 놓는다고 할 때,
		// n개의 흰 돌이 놓인 위치를 출력하는 프로그램을 작성해보자.
		
		Scanner sc = new Scanner(System.in);
		
		int white = sc.nextInt();
		
		// 2차원 배열 생성
		int[][] wb = new int[19][19];
		// 흰돌, 검은돌 중첩 반복문
		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++) {
				wb[i][j] = 0;
			}
		}
		
		for(int i=0;i<white;i++) {
			int x;
			int y;
			String inputXY = sc.nextLine();
			String[] xySplit = inputXY.split(" ");
			x = Integer.parseInt(xySplit[0])-1;
			y = Integer.parseInt(xySplit[1])-1;
			wb[x][y] = 1;
			
			
		}
		
		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++) {
				System.out.println(wb[i][j] + " ");
			}
			System.out.println("");
		}
		
		

	}

}
