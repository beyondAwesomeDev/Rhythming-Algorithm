package sowon.week04;

import java.util.Scanner;

public class quizCodeup1046 {

  public static void main(String[] args) {
    //sol1 수행 시간:110 ms / 메모리 :14536 kb
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    sc.close();
    
    int sum = n1+n2+n3;
   
    //sum, avg
    System.out.printf("%d%n%.1f", sum, (double) sum/3);
    
  }

}
