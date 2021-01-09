package jeonghyun.week03;

import java.util.Scanner;

public class a1027 {

	public static void main(String[] args) {
		// 년월일 입력 받아 형식 바꿔 출력하기
		Scanner sc = new Scanner(System.in);
		String birth = sc.next();
		String[] bsplit = birth.split("\\.");
		
		System.out.printf("%s-%s-%s", bsplit[2],bsplit[1],bsplit[0]);
		

	}

}
