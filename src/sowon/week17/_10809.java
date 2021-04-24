package sowon.week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809 {
  public static void main(String[] args) throws IOException {

    //memory 11496 runtime 80
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //알파벳 배열생성 후 초기화값 -1
    int[] arr = new int[26];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = -1;
    }

    String s = br.readLine();
    for(int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if(arr[ch - 'a'] == -1) {
        arr[ch - 'a'] = i;
      }
    }

    for(int val : arr) {    // 배열 출력
      System.out.print(val + " ");
    }
  }
}
