package jeonghyun.week12;

public class GCDnGCM {

	// 프로그래머스 - 최대공약수와 최소공배수
	public int[] solution(int n, int m) {
        int[] answer = new int[2]; // 배열의 길이는 2로 지정
      
        // 최대공약수 => 두 수의 최대로 나눌 수 있는 수
        // 최소공배수 => 두 수의 최대로 나눌 수 있는 수 * 나머지 2개
        
        
        // n>m 일 때와 n<m일 때로 나눠서 진행해야 될듯...?
        if(n < m) {
        	for(int i=1;i<m;i++) {
        		// n, m을 나눴을 때 나머지가 0이면 그 수는 최대공약수
        		// 최소공배수는 (두 수의 곱)/최대공약수
        		if(n % i == 0 && m % i == 0) {
        			answer[0] = i; // 최대공약수를 대입하고,
        			answer[1] = (m*n) / i; // 최소공배수를 구하는 연산을 대입
        		}
        	}
        }else {
        	for(int i=1;i<n;i++) {
        		if(n % i == 0 && m % i == 0) {
        			answer[0] = i;
        			answer[1] = (m*n) / i;
        		}
        	}
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {


	}

}
