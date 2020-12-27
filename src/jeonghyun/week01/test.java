package jeonghyun.week01;

/*Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Example 3:

Input: haystack = "", needle = ""
Output: 0*/

public class test {
	
	    public int strStr(String haystack, String needle) {
	        
	    	// needle과 haystack의 값이 공백이면 0을 리턴 
	    	 if(needle.equals("") && haystack.equals(""))
		            return 0;
	    	 
		        // haystack의 값에서 needle의 index 추출 (없는 값일 경우 -1 리턴)
		        return haystack.indexOf(needle);
		        
		        //또는 삼항연산자로 풀이 가능
		        //return  needle != null && !needle.trim().isEmpty() ? haystack.indexOf(needle) : 0;
	    }
	}