package jeonghyun.week03;

import java.util.Scanner;

public class a1026 {

	public static void main(String[] args) {
		//시분초 입력받아 분만 출력하기
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		String[] arr = time.split("\\:");
		int min = Integer.parseInt(arr[1]);
		
		if(min <= 9) 
			System.out.printf("%1d", min);
		else
			System.out.printf("%d", min);

	}

}
