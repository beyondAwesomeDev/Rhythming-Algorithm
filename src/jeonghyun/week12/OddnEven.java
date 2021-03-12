package jeonghyun.week12;

public class OddnEven {
	
	// 프로그래머스 - 짝수와 홀수
	public String solution(int num) {
        String answer = "";
        
        if(num % 2 == 0) {
        	answer = "Even";
        }else {
        	answer = "Odd";
        }
        
        return answer;
        
        // 삼항연산자로 풀이할 경우
        // return num % 2 == 0? Even : Odd;
    }

	public static void main(String[] args) {
		

	}

}
