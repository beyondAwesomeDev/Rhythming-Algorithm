package jeonghyun.week14;

import java.util.Scanner;

public class sortInside {

	// 백준 - 1427번 소트인사이드
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] counting = new int[10];
		
		int num = sc.nextInt();
		
		while(num != 0) {
			counting[num % 10]++;
			num /= 10;
		}
		
		for(int i=9;i>=0;i--) {
			while(counting[i]-- > 0) {
				System.out.println(i);
			}
		}

	}

}
