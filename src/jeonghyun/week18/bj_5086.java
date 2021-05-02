package jeonghyun.week18;

import java.util.Scanner;

public class bj_5086 {

	// 백준 5086 - 배수와 약수
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int a;
		 int b;
		 
		 while(true) {
			 a = sc.nextInt();
			 b = sc.nextInt();
			 
			 if(a==0 && b==0)
				 break;
			 
			 // 첫 번째 숫자가 두 번째 숫자의 약수
			 if(b % a == 0)
				 System.out.println("factor");
			 
			 // 첫 번째 숫자가 두 번째 숫자의 배수
			 else if(a % b == 0)
				 System.out.println("multiple");
			 
			 // 첫 번째 숫자가 두 번째 숫자의 약수, 배수 모두 아님
			 else
				 System.out.println("neither");
		 }

	}

}
