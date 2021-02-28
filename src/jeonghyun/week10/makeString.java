package jeonghyun.week10;

public class makeString {
	
	// 프로그래머스 - 문자열 다루기 기본
	public boolean solution(String s) {
		boolean answer = true;
		
		// 문자열의 길이는 4 혹은 6
		if(s.length() == 4 || s.length() == 6) {
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				// 길이는 1 이상 8 이하
				if(ch < '0' || ch > '9')
					return false;
			}
			return true;
			
		} else
			
			return false;
    }

	


}
