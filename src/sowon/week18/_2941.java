package sowon.week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2941 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine();
    int cnt = 0;
    // sol2 memory 11484 runtime 80
    int len = word.length();
    for (int i = 0; i < len; i++) {

      char alphabet = word.charAt(i);
      if (alphabet == 'c' && i < len - 1) {
        if (word.charAt(i + 1) == '=' || word.charAt(i + 1) == '-') {
          i++;
        }
      }
      else if (alphabet == 'd' && i < len - 1) {
        if (word.charAt(i + 1) == '-') {
          i++; //d-인 경우 조건문의 word길이에서 1를 빼줘야한다
        }
        else if (word.charAt(i + 1) == 'z' && i < len - 2) {
          if (word.charAt(i + 2) == '=') {
            i += 2; //dz-인경우 조건문의 word길이에서 2를 빼줘야한다
          }
        }
      }
      else if ((alphabet == 'l' || alphabet == 'n') && i < len - 1) {
        if (word.charAt(i + 1) == 'j') {
          i++;
        }
      }
      else if ((alphabet == 's' || alphabet == 'z') && i < len - 1) {
        if (word.charAt(i + 1) == '=') {
          i++;
        }
      }
      cnt++;
    }
    System.out.println(cnt);
  }
}
