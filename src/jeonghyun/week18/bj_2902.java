package jeonghyun.week18;

import java.util.Scanner;

public class bj_2902 {
	
    // 백준 2902번 - KMP는 왜 KMP일까?
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String ans = "";
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='A' && a.charAt(i)<='Z') 
				ans += a.charAt(i);
		}
			
			System.out.println(ans);
		
		

	}

}
