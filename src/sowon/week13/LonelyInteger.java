package sowon.week13;

import java.util.Arrays;

public class LonelyInteger {
  static int lonelyinteger(int[] a) {
    // 반복되지 않는 요소 찾아서 출력하는 문제

    if (a.length == 1) {
      return a[0];
    }

    //배열 a 정렬하기
    Arrays.sort(a);

    int ans = 0;
    for (int i = 1; i < a.length; i++) {
      //오름차순 정렬을 했기때문에 앞의 모든 숫자가 2개씩 존재한다면 답은 제일 마지막 요소이다.
      if (i == a.length - 1) {
        ans = a[i];
        //오른차순 정렬을 했기때문에 현재요소의 왼쪽 요소와 오른쪽 요소가 현재요소와 다르다면 그 값이 답이다.
      } else if ((a[i] != a[i - 1]) && (a[i] != a[i + 1])) {
        ans = a[i];
        break;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(lonelyinteger(new int[]{1,2,3,4,3,2,1})+", ans: 4");
  }
}
