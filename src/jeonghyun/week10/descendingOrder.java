package jeonghyun.week10;

import java.util.Arrays;
import java.util.Collections;

public class descendingOrder {
	
	// 프로그래머스 - 문자열 내림차순으로 배치하기
	public class DescendingString {

	    public String solution(String s) {
	        String answer = "";
	        String[] sArray = s.split("");
	        // 문자열 s를 오름차순으로 정렬
	        Arrays.sort(sArray);

	        // 문자열 내림차순 배치
	        Collections.reverse(Arrays.asList(sArray));

	        answer = String.join("", sArray);

	        return answer;
	    }
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
