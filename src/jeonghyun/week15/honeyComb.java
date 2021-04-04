package jeonghyun.week15;

import java.util.Scanner;

public class honeyComb {

	// 백준 - 2292번 벌집
	public static void main(String[] args) {
		
		// 벌집 방의 개수는 6배씩 늘어나는것을 알 수 있음
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int count = 1;  // 겹 수 (== 최수 루트)
		int range = 1;  // 범위 (최소값 기준)
		
		if(num == 1) {
			System.out.print(1);
		}else {
			while(range <= num) {  // 범위가 num보다 커지기 직전까지 반복
				range = range + (6 * count);  // 다음 범위의 최소값으로 초기화
				count++;  
			}
			
			System.out.println(count);
		}

	}

}
