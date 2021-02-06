package sowon.week07;

public class PlusMinus {
  static void plusMinus(int[] arr) {
    //주어진 n개의 숫자 중 양수, 음수, 0의 비율을 구하는 문제이다. 총 비율의 합은 1이다.
    int cntPlus = 0;
    int cntMinus = 0;
    for(int a : arr){
      if(a > 0){
        cntPlus++;
      }else if( a < 0){
        cntMinus++;
      }
    }
    System.out.printf("%.6f%n", (double) cntPlus/arr.length);
    System.out.printf("%.6f%n", (double) cntMinus/arr.length);
    System.out.printf("%.6f%n", (double) (arr.length-cntPlus-cntMinus)/arr.length);
  }
}
