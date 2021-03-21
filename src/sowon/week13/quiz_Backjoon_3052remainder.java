package sowon.week13;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz_Backjoon_3052remainder {
  public static void main(String[] args) {
    // https://www.acmicpc.net/problem/3052

    Scanner sc = new Scanner(System.in); 
    int[] nums = new int[10];
    
    ArrayList<Integer> numList = new ArrayList<>();    
    for(int i=0;i<10;i++) { 
        int num = sc.nextInt();
        nums[i] = num % 42;
    }
    
    for(int num:nums) {
      if(!numList.contains(num)) {
          numList.add(num);  
      }
  }
  
  System.out.println(numList.size());
  }//end of main()

}

/* Input, output: 10
1
2
3
4
5
6
7
8
9
10 
 */
/* Input, output: 1
42
84
252
420
840
126
42
84
420
126
*/