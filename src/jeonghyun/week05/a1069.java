package jeonghyun.week05;

import java.util.Scanner;

public class a1069 {

	public static void main(String[] args) {
		// 평가 입력받아 다르게 출력하기
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		
		switch(a) {
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
			default:
				System.out.println("what?");
		}
		
		

	}

}
