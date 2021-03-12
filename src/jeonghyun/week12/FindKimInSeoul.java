package jeonghyun.week12;

public class FindKimInSeoul {

	// 프로그래머스 - 서울에서 김서방 찾기
	public String solution(String[] seoul) {
        String answer = "";
        
       // String Kim = "Kim";
        
        for(int i=0;i<seoul.length;i++) {
        	if(seoul[i].equals("Kim")) {  // 숫자가 아닌 문자의 비교는 .equals
        		answer = "김서방은" + i + "에 있다";
        		break;  // Kim을 찾은 후
        	}
        }
        
        return answer;
    }
	
	
	
	
	public static void main(String[] args) {
		

	}

}
