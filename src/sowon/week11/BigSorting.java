package sowon.week11;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class BigSorting {
  void solve(Scanner in, PrintWriter out) {
    String a[] = new String[in.nextInt()];
    for (int i = 0; i < a.length; i++) {
      a[i] = in.next();
    }
    Arrays.sort(a, (left, right) -> {
      if (left.length() != right.length()) {
        return left.length() - right.length();
      } else {
        return left.compareTo(right);
      }
    });
    for (String s : a) {
      out.println(s);
    }
  }

  void run() {
    try (
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
    ) {
      solve(in, out);
    }
  }
  public static void main(String[] args) {
    new BigSorting().run();
/* sample input
6
31415926535897932384626433832795
1
3
10
3
5
 */

  }

}
