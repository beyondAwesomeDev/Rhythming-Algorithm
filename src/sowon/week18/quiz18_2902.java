package sowon.week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2902
// KMP는 왜 KMP일까?
public class quiz18_2902 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // sol1 charArray로 풀기
    // memory 11440 runtime 76

    char[] name = br.readLine().toCharArray();
    String shortName = "";
    for (char c : name) {
      if (c >= 65 && c <= 90) {
        shortName += c;
      }
    }
    System.out.println(shortName);
    
    // sol2 StringTokenizer로 잘라서 풀기
    // momory 11584 runtime 80
    /*
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine(), "-");
    while (st.hasMoreTokens()) {
      bw.write(st.nextToken().charAt(0));
    }
    bw.flush();
    */
  }
}
/*
input 
Knuth-Morris-Pratt

output 
KMP
 */
