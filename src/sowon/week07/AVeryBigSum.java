package sowon.week07;

public class AVeryBigSum {
  static long aVeryBigSum(int n, long[] ar) {
    long sum = 0;
    for(long l : ar){
      sum += l;
    }
    return sum;
  }
}
