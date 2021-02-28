package jeonghyun.week10;

public class pandy {

	// 프로그래머스 - 문자열 내 p와 y의 개수
	boolean solution(String s) {
		
		boolean answer = true;
		int cnt = 0;
		char ch = ' ';
		
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			// s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True
			if(ch == 'p' || ch== 'P')
				cnt++;
			else if (ch == 'y' || ch == 'Y')
				cnt--;
		}
		// 다르면 False를 return
		if(cnt != 0)
			return false;
		return true;
    }

}
