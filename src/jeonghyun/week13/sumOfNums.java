package jeonghyun.week13;

import java.util.Scanner;

public class sumOfNums {

	// 백준 - 11720번 숫자의 합
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Scanner 클래스의 메소드로는 숫자를 한 자리씩 끊어서 입력받을 수 없음
		// (붙어있는 숫자 == 하나의 숫자로 입력됨) => 문자열로 입력받아서 한 글자씩 처리
		
		int n = sc.nextInt();  // n은 숫자로 받고,
		String input = sc.next(); // 그 후 문자열의 길이(=n)만큼 한 글자씩 숫자로 변경해서 더해줌
		
		int result = 0;
		for(int i=0;i<n;++i) {
			result += input.charAt(i) - '0';
		}              // char 형에 +또는- 연산자를 사용할 경우 char형이 int형으로 반환되어 계산됨!!
		
		System.out.println(result);

	}

}
