package jeonghyun.week06;

import java.util.HashSet;
import java.util.Set;

public class leetcode217 {
	
	public static boolean containsDuplicate(int[] nums) {
		// 중복값 있으면 true, 없으면 false
		
		// false일 경우
		if(nums.length == 0 || nums == null) {
		return false;
		}
	
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(set.contains(nums[i])) {
				return true;
			}else {
				set.add(nums[i]);
				
			}
			
		}
		
	
		return false;
	
	
	}

	public static void main(String[] args) {
		int nums[] = {1,1,2,3};  // => true
		//int nums[] = {1,2,3,4}; // => false
		
		System.out.println(containsDuplicate(nums));

	}

}
