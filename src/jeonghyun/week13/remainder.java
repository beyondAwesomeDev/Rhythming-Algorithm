package jeonghyun.week13;

import java.util.ArrayList;
import java.util.Scanner;

public class remainder {

	
	// 백준 - 3052번 나머지
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 10개 (배열 10개 생성)
		int[] nums = new int[10];
		ArrayList<Integer> numList = new ArrayList<>();
		
		for(int i=0;i<10;i++) {  // 반복문 10번 돌리기 위해
			int num = sc.nextInt();
			// 42로 나눈 나머지 구해서 nums배열에 넣기
			nums[i] = num % 42;
		}
		
		for(int num:nums) {
			// numList에 포함되는 수가 아니면 => add로 넣어줌
			if(!numList.contains(num)) {
				numList.add(num);  
			}
		}
		
		System.out.println(numList.size());
		
		
		// 또는,
		
		// Scanner sc = new Scanner(System.in);
		// int[] num = new int[10];
		
		// int a = 42;
		// int count = 10;
		
		// for(int i=0;i<10;i++){
		//   int n = sc.nextInt();
		//   num[i] = n % a;
		//  }
		
		// for(int i=0;i<num.length;i++){
		//    number[num[i]]++;  => num값을 number의 num값 배열에 넣어줘서 1씩 증가시킴
		//   }                   => 값이 있으면 1, 없으면 0이 됨
		
		//     for(int i=0;i<number.length;i++) {
		//       if(number[i] != 0) {  => number를 전체 순회해서 1인 값이 있으면 
		//    } count++;                  count에 1씩 증가시켜줌
		//    }
	
	
		
		// System.out.println(count);
		
		
		

	}

}
