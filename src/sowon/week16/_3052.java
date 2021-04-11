package sowon.week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _3052 {
    public static void main(String[] args) throws IOException {
      // sol1. BufferedReader와 리스트로 풀기
      // memory 11460 runtime 76
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      // 나머지값이 들어 갈 리스트 생성
      List<Integer> list = new ArrayList<>();

      // 리스트에 나머지값 넣기
      for(int i = 0; i< 10; i++) {
        int reminder = Integer.parseInt(br.readLine()) % 42;
        if (!list.contains(reminder)) {
          list.add(reminder);
        }
      }

      System.out.println(list.size());
  }
}
