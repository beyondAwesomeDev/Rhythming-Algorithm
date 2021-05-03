package jeonghyun.week18;

import java.util.Arrays;
import java.util.Scanner;

public class quiz_bj_11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int leng = sc.nextInt();  // length
		String[] num = sc.next().split("");  // 숫자
		
	//	System.out.println(leng);
//		System.out.println(Arrays.toString(num));
		
		int sum = 0;
	
		
		  for(int i=0;i<leng;i++) { 
			  sum += Integer.parseInt(num[i]); 
			  }
		 
		
		System.out.println(sum);
	

	}

}
