package sowon.week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1919 {
  //sol memory 11472 runtime 76
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String words1 = br.readLine();
    String words2 = br.readLine();
    
    int answer = 0;
    
    // 알파벳 26글자 (알파벳의 개수 기록)
    // 127 아스키코드 전체 for String 
    int[] alpha = new int[26];
    
    // str1에서 사용된 알파벳 수 기록
    for(int i=0;i<words1.length();i++){
      alpha[words1.charAt(i)-97]++;          
    }
    
    // str2에서 사용된 알파벳은 alpha배열에서 뺄셈 
    for(int i=0;i<words2.length();i++) {
        alpha[words2.charAt(i)-97]--;
    }
    
    for(int i=0; i<alpha.length;i++){
      answer += Math.abs(alpha[i]); // 위에 해당하는 값을 전부 절대값으로 합하기          
    }
    
    System.out.println(answer);

  }

}
/*
input
aabbcc
xxyybb

output
8
 */
