package jeonghyun.week18;

import java.util.Scanner;

public class bj_5988 {

	// 백준 5988 - 홀수일까 짝수일까
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T!= 0) {
			String[] str = sc.next().split("");
			
			int num = Integer.parseInt(str[str.length - 1]);
			
			if(num % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
			
			T--;
		}


		

	}

}
