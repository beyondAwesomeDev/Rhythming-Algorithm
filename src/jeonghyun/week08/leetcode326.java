package jeonghyun.week08;

public class leetcode326 {
	
	 public static boolean isPowerOfThree(int n) {
		 
		 if(n == 0) {
			 return false;
		 }
		 
		 if(n == 1) { 
			 return true;
		 }
		 
		 while(n>=3) {
			 if(n == 3) return true;
			 if(n % 3 == 0) {
				 n = n/3;
			 }else {
				 return false;
			 }
			
		 }
		 return false;
		 
		 
    // 구글링 했을때 가장 많이나오는 코드 (return n==1; 부분이 어렵고 런타임이 긺)
	//	 if(n == 0) return false;
	//	 while(n % 3 == 0) {
	//		 n /= 3;
	//	 }
		 // return n == 1;
		 
		
		 
		 
	    }
	
	

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(9)+", ans: true");
	    System.out.println(isPowerOfThree(45)+", ans: false");

	}

}
