package jeonghyun.week16;

import java.util.Scanner;

public class making1 {

	// 백준 1463번 - 1로 만들기
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        // 먼저 배열을 만들어 계산 횟수를 1씩 증가시킴
        int[] cnt = new int[x + 1];
        
        // x가 1이거나 0일 경우 연산의 수는 0번이므로 2번부터 시작해도 상관 없음
        
        // 1을 빼주는것, 2로 나누는 것, 3으로 나누는것 중 어느 계산이 빠른지 확인하면서
        // 계산횟수 배열에 최소값을 계속 넣어줌
        for(int i=2;i<=x;i++) {
        	cnt[i] = cnt[i-1] + 1;
        	
        	if(i % 2 == 0 && cnt[i] > cnt[i / 2] + 1)
        		cnt[i] = cnt[i / 2] + 1;
        	
        	if(i % 3 == 0 && cnt[i] > cnt[i / 3] + 1)
        		cnt[i] = cnt[i / 3] + 1;
        }
        
        System.out.println(cnt[x]);

	}

}
