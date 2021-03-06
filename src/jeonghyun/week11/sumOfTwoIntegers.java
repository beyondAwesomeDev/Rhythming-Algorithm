package jeonghyun.week11;

public class sumOfTwoIntegers {
	
	    // 프로그래머스 - 두 정수의 합
	    public long solution(int a, int b) {
	    	long answer = 0;
	    	
	    	if(a < b) {
	    		for(int i=a;i<=b;i++) {
	    			answer += i;
	    		}
	    	}else if(a > b) {
	    		for(int i=b;i<=a;i++) {
	    			answer += i;
	    		}
	    	}else {
	    		answer += a;
	    	}
	    	
	    	return answer;
	    	
	    }
	

	public static void main(String[] args) {
		
		
		

	}

}
