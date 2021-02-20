package jeonghyun.week09;

import java.util.Scanner;

public class a1097 {

	public static void main(String[] args) {
		// 바둑판(19 * 19)에 흰 돌(1) 또는 검정 돌(0)이 모두 꽉 채워져 놓여있을 때,
		// n개의 좌표를 입력받아 십(+)자 뒤집기한 결과를 출력하는 프로그램을 작성해보자.
		
		Scanner sc = new Scanner(System.in);
		
		// 2차원 배열 생성
		int[][] arr = new int[19][19];
		
		// 배열에 입력값 넣기
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j] = sc.nextInt();
				
			}
		}
		
		// 십자 뒤집기의 count
		int count = sc.nextInt();
		
		// 1 -> 0, 0 -> 1
		for(int n=0;n<count;n++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			
			//[10, i]가 0 -> 1, 1 -> 0
			for(int i=0;i<arr.length;i++) {
				if(arr[x][i] == 0) {
					arr[x][i] = 1;
				}else {
					arr[x][i] = 0;
				}
			}
			
			//[j,12]가 0 > 1, 1 -> 0
			for(int j=0;j<arr.length;j++) {
				if(arr[j][y] == 0) {
					arr[j][y] = 1;
				}else {
					arr[j][y] = 0;
				}
			}
		}
		sc.close();
		
		// 정답 출력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.printf("%d", arr[i][j]);
				
			}
			System.out.println();
		}

	}

}
