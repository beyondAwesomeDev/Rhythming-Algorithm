package jeonghyun.week09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class a1094 {

	public static void main(String[] args) {
		// 출석 번호를 n번 무작위로 불렀을 때, 부른 번호를 거꾸로 출력해 보자.
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 배열 list에 순서대로 기록
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<num;i++) {
			int n = sc.nextInt();
			list.add(n);
		}
		
		// 입력받은 번호(부른 번호)를 거꾸로 
		Collections.reverse(list);
		
		// list의 reverse를 길이만큼 반복해서 출력
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i) + " ");
		}
		

	}

}
