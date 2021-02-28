package jeonghyun.week10;

import java.util.Scanner;

public class a1099 {

	public static void main(String[] args) {
		// 미로 상자의 구조가 0(갈 수 있는 곳), 1(벽 또는 장애물)로 주어지고,
		// 먹이가 2로 주어질 때, 성실한 개미의 이동 경로를 예상해보자.
		
		Scanner sc = new Scanner(System.in);

		int[][] plate = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				plate[i][j] = sc.nextInt();
			}
		}
		
		
		// 오른쪽이나 아래쪽으로만 움직 일 수 있음 (x+1) or (y+1)
		
		int x = 1;
		int y = 1;

		while (x < 10 && y < 10) {

			if (plate[1][1] == 2) {
				plate[1][1] = 9;
				break;
			} else {
				plate[1][1] = 9;
			}
			// 맨 아래 가장 오른쪽에 도착한 경우, 더 이상 움직일 수 없는 경우, 먹이를 찾은 경우 END
			// (2,2) 부터 시작
			if (x < 10 && y+1 < 10 && plate[x][y+1] == 0) {
				plate[x][y+1] = 9;
				y++;
			} 
			else if (x < 10 && y+1 < 10 && plate[x][y+1] == 2) {
				plate[x][y+1] = 9;
				break;
			} 
			else if (x+1 < 10 && y < 10 && plate[x+1][y] == 0) {
				plate[x+1][y] = 9;
				x++;
			} 
			else if (x+1 < 10 && y < 10 && plate[x+1][y] == 2) {
				plate[x+1][y] = 9;
				break;
			} 
			else {
				break;
			}
			
		}
		
		
		for (int n = 0; n < 10; n++) {
			for (int m = 0; m < 10; m++) {
				System.out.printf("%d ", plate[n][m]);
			}
			System.out.println();
		}
		
	
	

	}

}
