package jeonghyun.week14;

public class hk_XORStrings {

	public static String stringsXOR(String s, String t) {
        String res = new String("");
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i))
                res += "0";
            else
                res += "1";
        }
        
        return res;
    }
	
	public static void main(String[] args) {
		

	}

}
