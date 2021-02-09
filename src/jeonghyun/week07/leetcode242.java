package jeonghyun.week07;

import java.util.Arrays;

public class leetcode242 {
	
    public static boolean isAnagram(String s, String t) {
    	
    	// 문자열 길이 같은지
    	if(s.length() != t.length()) {
    		return false;
    	}
    	
    	// 알파벳 개수 카운팅, 다른 알파벳 있으면 제거
    		char[] a = s.toCharArray();  
    		char[] b = t.toCharArray(); 
    		
    		Arrays.sort(a);
    		Arrays.sort(b);
    		
    		
    		for(int i=0;i<s.length();i++) {
    			if (a[i] != b[i]) {
    				return false;
    			}
    			
    		}
    		
    		return true;
    		
    		
        
    }
	
	
	
	public static void main(String[] args) {
		System.out.println(isAnagram("rat","car")); //=>false

	}

}
