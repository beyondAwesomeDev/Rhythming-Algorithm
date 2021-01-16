package jeonghyun.week03;

public class leetcode125 {
	
	public static boolean isPalindrome(String s) {
        String ss = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");  //replace, replaceAll(정규표현식도 가능) 차이
        int left = 0;
        int right = s.length() -1; 
        
        System.out.println(ss);
        
        for(int i=0; i<ss.length()/2; i++){
              if(ss.charAt(i) != ss.charAt(ss.length()-i-1)){
                return false;
              }
            }
        return true;

//        return new StringBuilder().append(s).reverse().toString()
//                .replaceAll("[^a-zA-Z0-9]", "").toLowerCase()
//                .equals(s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()) ? true: false;
          
        }



	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama!!"; //=> t
        //"race a car" //=> f
         System.out.println(isPalindrome(s));


	}
	}

