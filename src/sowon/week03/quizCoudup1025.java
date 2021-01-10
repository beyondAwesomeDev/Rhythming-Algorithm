package sowon.week03;

import java.io.IOException;
import java.util.Scanner;

public class quizCoudup1025 {

  public static void main(String[] args) throws IOException {
    //sol1 => memory 12572 time 114
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
    
    //sol2 =>
    /*
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    System.out.printf("[%1d]\n[%1d]", st.countTokens(), st);
    */
  }

}
