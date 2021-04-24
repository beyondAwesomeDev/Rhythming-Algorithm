package jeonghyun.week16;

import java.util.Scanner;

public class makingAnagram {
	
    // 백준 1919번 - 애너그램 만들기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        int answer = 0;
        
        // 알파벳 26글자 (알파벳의 개수 기록)
        // 127 아스키코드 전체 for String 
        int[] alpha = new int[26];
        
        // str1에서 사용된 알파벳 수 기록
        for(int i=0;i<str1.length();i++){
          alpha[str1.charAt(i)-97]++;          
        }
        
        // str2에서 사용된 알파벳은 alpha배열에서 뺄셈 
        for(int i=0;i<str2.length();i++) {
            alpha[str2.charAt(i)-97]--;
        }
        
        for(int i=0; i<alpha.length;i++){
          answer += Math.abs(alpha[i]); // 위에 해당하는 값을 전부 절대값으로 합하기          
        }
        
        System.out.println(answer);

	}

}
