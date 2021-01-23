package jeonghyun.week04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class leetcode136 {
	public int singleNumber(int[] nums) {
		Set<Integer> box = new HashSet<>();
		for(int i=0; i<nums.length;i++) {
			if(box.contains(nums[i])) {
				box.remove(nums[i]);
			}else {
				box.add(nums[i]);
			}
		}
		return box.stream().findFirst().get();
		
		
		
	}
	
	// 또는 비트연산자 사용
	/*
	 * int val=0; // -1 
	 * for(int i=0;i<nums.length;i++) { 
	 * // val^=nums[i]; val =
	 * val^nums[i]; 
	 * } 
	 * return val;
	 */
}


   
	
	
	
	
	//테스트 메서드
	/*
	 * public static void main(String[] args) { int[] nums =// {2, 2, 1};
	 * //{4,1,2,1,2}; //{1}; //{-1,-1,-2}; //=> -2 //{1,3,1,-1,3};
	 * {-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,
	 * 101,-997,40,-527,-784,-283,354}; //=> 354
	 * System.out.println(singleNumber(nums));
	 * 
	 * }
	 * 
	 * }
	 */
