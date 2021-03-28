package sowon.week14;

import java.util.Scanner;

public class quizBackjoon1110 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // 입력 수가 10미만이면 n에 10을 곱함
    if (n < 10)
      n *= 10;

    int 첫째자리수 = 0;
    int 둘째자리수 = 0;
    int cnt = 0;
    int sum = n;

    while (true) {
      첫째자리수 = sum / 10;
      둘째자리수 = sum % 10;
      sum = 첫째자리수 + 둘째자리수;

      sum = 둘째자리수 * 10 + sum % 10; // 10이상의 수가 나왔을때 마지막 자리 수로 해야하기 때문
      cnt++;
      if (sum == n)
        break;
    }

    System.out.println(cnt);
  }
}
/*
 * input-output 26-4 55-3 1-60 0-1
 */
