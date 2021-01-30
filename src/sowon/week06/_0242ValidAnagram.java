package sowon.week06;

import java.util.Arrays;

public class _0242ValidAnagram {
  public static boolean isAnagram(String s, String t) {
    //Anagram 애너그램 : 철자를 바꾼 어구
    //Runtime 2 ms Memory 39.7 MB
    if (s.length() != t.length()) {
      return false;
    }
    char[] str1 = s.toCharArray();
    char[] str2 = t.toCharArray();
    Arrays.sort(str1);
    Arrays.sort(str2);
    return Arrays.equals(str1, str2);
  }

  public static void main(String[] args) {
    System.out.println(isAnagram("anagram","nagaram")); //=>true
    System.out.println(isAnagram("rat","car")); //=>false
  }
}
