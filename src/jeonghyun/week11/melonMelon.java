package jeonghyun.week11;

public class melonMelon {
	
	// 프로그래머스 - 수박수박수박수
	public String solution(int n) {
        String answer = "";
        
        for(int i=1;i<=n;i++) {
        	
        	if(i % 2 == 1) {
        		answer = answer + "수";
        	}else {
        		answer = answer + "박";
        	}
        }
        
        
        return answer;
    }

	public static void main(String[] args) {
		

	}

}
