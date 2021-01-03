package jeonghyun.week02;

import java.util.Scanner;

public class a1019 {

	public static void main(String[] args) {
		//년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
		Scanner sc = new Scanner(System.in);
	    String input = sc.next();
	    
	    // 입력받은 값을 .으로 분리해줌
	    String arr[] = input.split("\\.");
	    // 배열의 값을 차례대로 가져옴
	    int year = Integer.valueOf(arr[0]);
	    int month = Integer.valueOf(arr[1]);
	    int day = Integer.valueOf(arr[2]);
	    
	    System.out.printf("%4d.%02d.%02d", year,month,day);
	    		
	}

}
