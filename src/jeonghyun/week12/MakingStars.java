package jeonghyun.week12;

import java.util.Scanner;

public class MakingStars {
	
	// 프로그래머스 - 직사각형 별찍기
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
     
        // a와 b를 행과 열로 나누어 이중for문으로 별찍기
        for(int i=0;i<b;i++) {
        	for(int j=0;j<a;j++) {
        		System.out.print("*");
        	}
        
        System.out.println();
	
        }
	

}

}