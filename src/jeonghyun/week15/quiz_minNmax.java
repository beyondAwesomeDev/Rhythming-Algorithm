package jeonghyun.week15;

import java.util.Scanner;

public class quiz_minNmax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		int max = -1000000;
		int min = 1000000;
		
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
	//		System.out.println(arr[i]);
			if(arr[i] > max) {
				max = arr[i];
				
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(num);
   System.out.print(min + " " + max);
	}

}
