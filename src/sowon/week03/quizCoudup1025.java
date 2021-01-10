package sowon.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class quizCoudup1025 {

  public static void main(String[] args) throws IOException {
    // sol1 => memory 12572 time 114
    /*
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    String[] str = Integer.toString(n).split("");

    for(int i=0; i<str.length; i++){
        System.out.printf("[%s", str[i]);
            for(int j=str.length-1; j>i; j--){
                System.out.printf("0");
        }
        System.out.printf("]\n");
    }
     */

    // sol2 => memory 11388 time 81
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    String[] num = st.nextToken().split("");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("[%s", num[i]);
      for (int j = num.length - 1; j > i; j--) {
        System.out.printf("0");
      }
      System.out.printf("]\n");
    }
  }
}
