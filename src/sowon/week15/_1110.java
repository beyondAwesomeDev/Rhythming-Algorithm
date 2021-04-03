package sowon.week15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1110 {
  public static void main(String[] args) throws Exception {
    //sol1. memory 11500 runtime 84

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int tens = 0; //십의 자리의 수
    int units = 0; //일의 자리의 수
    int sum = n;
    int cnt = 0;

    while(true){
      tens = sum/10;
      units = sum%10;
      sum = tens + units;

      sum = units*10 + sum%10;
      cnt++;
      if(n == sum){
        break;
      }
    }
    System.out.println(cnt);
  }
}
/*
input 26 output 4
 */