package sowon.week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quizCodeup1095 {
  public static void main(String[] args) throws IOException {
    //sol1 메모리 32368 시간 404
    /*
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt(); //총 출석 길이

    int numbers = 0;
    int min = 0;
    for (int i = 0; i < count; i++) {
        numbers = sc.nextInt(); //부른 출석번호를 하나씩 넣는다.
        if (i == 0) {
            min = numbers; //초기화
        } else if (min > numbers) {
            min = numbers;
        }
    }
    System.out.println("ans: "+min);
    */
    
    //sol2 메모리 13588 시간 91
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 출석길이
    int cnt = Integer.parseInt(br.readLine());    
    
    // 부른 출석 번호
    String[] nums = br.readLine().split(" ");

    int[] numsToInt = new int[cnt];
    for (int i = 0; i < cnt; i++) {
      numsToInt[i] = Integer.parseInt(nums[i]);
    }

    int minNum = numsToInt[0];
    for (int i = 0; i < cnt; i++) {
      if(minNum >= numsToInt[i]){
        minNum = numsToInt[i];
      }
    }
    System.out.println(minNum);
  }
}
