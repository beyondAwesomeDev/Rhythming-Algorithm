package sowon.week05;

import java.util.ArrayList;
import java.util.List;

public class _0202HappyNumber {
  public static boolean isHappy(int n) {
    int sum = 0, remain = 0;
    List<Integer> cycle = new ArrayList<Integer>();
    while(n != 1){
      if(cycle.contains(n)) return false;
      cycle.add(n);
      while (n > 0) {
        remain = n % 10;
        sum += remain * remain;
        n /= 10;
      }
      n = sum;
      sum = 0;
    }
    return true;
  }

  public static void main(String[] args) {
    int n = 19;
    System.out.println(isHappy(n));
  }
}
