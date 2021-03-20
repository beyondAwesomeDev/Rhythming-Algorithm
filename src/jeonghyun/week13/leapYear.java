package jeonghyun.week13;

import java.util.Scanner;

public class leapYear {

	// 백준 - 2753번 윤년
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int year = sc.nextInt();
		 
		 // 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
		 if(year % 4 == 0) {
			 if(year % 400 == 0) {
				 System.out.println("1");
			 }else if(year % 100 == 0) {
				 System.out.println("0");
			 }else System.out.println("1");
		 }else System.out.println("0");
		 

	}

}
