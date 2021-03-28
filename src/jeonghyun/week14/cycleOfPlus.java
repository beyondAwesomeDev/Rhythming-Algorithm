package jeonghyun.week14;

import java.util.Scanner;

public class cycleOfPlus {

	// 백준 - 1110번 더하기사이클
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// 입력 수가 10미만이면 n에 10을 곱함
		if(n < 10) n*= 10;
		
		int left = 0;
		int right = 0;
		int cnt = 0;
		int sum = n;
		
		while(true) {
			// left는 두 자리수 중 첫번째 (=10의자리수) => 10으로 나눔
			left = sum / 10;
			// right는 10으로 나눴을때 나머지 (=1의자리수)
			right = sum % 10;
			sum = left + right;
			
			sum = right * 10 + sum % 10;  //10이상의 수가 나왔을때 마지막 자리 수로 해야하기 때문
			cnt++;
			if(sum == n) break;
		}
		
		System.out.println(cnt);

	}

}
