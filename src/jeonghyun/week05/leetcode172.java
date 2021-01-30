package jeonghyun.week05;

public class leetcode172 {

	public static int trailingZeroes(int n) {
		int ans = 0;
		// 5! 10! 15! 20! =>1
		// 25! +2; => 5! (1) + 5! (1) =>2
		// 30! =>1
		while(n>0) {
			n = n/5;
			ans += n;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int n = 25;
		System.out.println(trailingZeroes(n));
	}
}
