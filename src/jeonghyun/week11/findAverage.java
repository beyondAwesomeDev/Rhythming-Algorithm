package jeonghyun.week11;

public class findAverage {
	
	// 프로그래머스 - 평균값 구하기
	public double solution(int[] arr) {
        double answer = 0;
        
        for (int i = 0; i < arr.length; i++) {
    		answer += arr[i];
    	}
        
    	answer /= arr.length;
        
        return answer;
    }
	
	

	public static void main(String[] args) {
		

	}

}
