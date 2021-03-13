package jeonghyun.week12;

public class BringMiddleString {
	
	// 프로그래머스 - 가운데 글자 가져오기
	public String solution(String s) {
        String answer = "";
        
        // 가운데 길이가 홀수이면 한 글자, 짝수이면 가운데 두 글자를 반환
        // => 홀수인 경우와 짝수인 경우를 나누어서 정리 (짝수면 두 글자, 홀수면 한 글자가 나오도록)
        
        // 짝수일 경우 2개가 나와야함으로 substring을 써주는 것이 좋음
        if(s.length() % 2 == 0) {  // 짝수일때
        	answer = s.substring(s.length()/2-1, s.length()/2+1);
        }else { // 홀수일때
        	answer = s.substring(s.length()/2, s.length()/2+1);
        }
        
        return answer;
    }

	// substring는 substring(int a1) / substring(int a1, int a2) 의 방식으로 나뉨
	// 전자는 a1부터 끝까지 / 후자는 a1부터 a2까지 가져옴
	// cf1) indexOf(int n / String str)은 n이나 str이 있는 인덱스를 반환해주는 함수
	// cf2) charAt(int n)은 n번째 위치의 값을 반환해주는 함수
	
	public static void main(String[] args) {
		

	}

}
