package sowon.week11;

import java.util.Arrays;
import java.util.stream.Stream;

public class quizprogrammersthesmallestnum {
  static int[] solution(int[] arr) {
    // 제일 작은 수 제거한 배열을 리턴하는 문제
    
    //sol1
    /*
    if (arr.length <= 1) {
      System.out.println(Arrays.toString(new int[] {-1}));
      return new int[] {-1};
    }

    // 배열에서 가장 작은 수 찾기
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }

    // 찾은 가장 작은 수만 빼고 정답배열에 넣기
    // int idx = 0;
    int[] answer = new int[arr.length - 1];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != min) {
        // answer[idx] = arr[i];
        answer[i] = arr[i];
        // idx++;
      }
    }

    System.out.println(Arrays.toString(answer));
    return answer;
     */
    // 기존
    String[] strArr = {"aaa", "bbb", "ccc"};
    
    // 스트림 생성
    Stream<String> strStream1 = Arrays.stream(strArr);
    
    // 스트림 출력
    strStream1.sorted().forEach(System.out::println);

    // sol2
    if (arr.length <= 1) return new int[] {-1};
    int min = Arrays.stream(arr).min().getAsInt();
    return Arrays.stream(arr).filter(i -> i != min).toArray();
    
  }

  public static void main(String[] args) {
    // System.out.println(solution(new int[] {4, 3, 2, 1}) + ", ans: [4,3,2]");
    System.out.println(solution(new int[] {4, 1, 2, 3}) + ", ans: [4,2,3]");
//    System.out.println(solution(new int[] {10}) + ", ans: [-1]");
  }
}
