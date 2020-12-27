package sowon.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class quizCodeup1014 {
  public static void main(String[] args) throws IOException {

    // 풀이1 : char로 받아서 출력
    // 메모리 12480 시간 93
    // Scanner sc = new Scanner(System.in);
    // char x = sc.next().charAt(0);
    // char y = sc.next().charAt(0);
    //
    // sc.close();
    // System.out.printf("%c %c", y, x);


    // 풀이2 : String으로 받아서 출력
    // 메모리 12376 시간 96

    // Scanner sc = new Scanner(System.in);
    // String x = sc.next();
    // String y = sc.next();
    // sc.close();
    // System.out.println(y+" "+x);

    // 풀이3 : BufferedReader사용
    // 메모리 :11140 시간:66
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    String[] anz = {st.nextToken(), st.nextToken()};
    System.out.println(anz[1] + " " + anz[0]);

    // 회고 https://sowon-dev.github.io/2020/12/27/201227al-c1014/
  }

}
