package sowon.week04;

public class _0171ExcelSheetColumnNumber {
  public static int titleToNumber(String s) {
    int sum = 0; int temp = 0;
    for(int i=s.length()-1; i>=0; i--){
      sum += Math.pow(26, temp++)*(s.charAt(i)-'A'+1);
    }
    return sum;
  }

  public static void main(String[] args) {
    String s = //"A"; //=>1
              // "AB"; //=>28
               "ZY"; //=>701
    System.out.println(titleToNumber(s));
  }
}
