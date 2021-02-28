package jeonghyun.week10;

import java.util.Arrays;

public class participantCompletion {
	
	// 프로그래머스 - 완주하지 못한 선수
	public String solution(String[] participant, String[] completion) { 
		
		String answer = ""; 
		// (참가자 뛰는 순서대로) 정렬
		Arrays.sort(participant); 
		Arrays.sort(completion); 
		int i; 
		// participant과 completion을 계속 비교, 값이 같지 않은 것이 나왔을 때
		for(i = 0; i < completion.length; i++){ 
			if(!participant[i].equals(completion[i])){ 
				return participant[i]; 
				
			} 
		} 
		
		// 완주하지 못한 선수
		return participant[i]; 
		
	
	}

	


}
