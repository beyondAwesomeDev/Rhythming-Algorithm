package sowon.week02;

public class quizCodeup1019 {

  public static void main(String[] args) {
    // sol 1 => Memory 12388 runtime 83
    // The dot "." is a special character in java regex engine, so you have to use "\\." to escape
    /*
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] arr = s.split("\\.");
    
    arr[0] = arr[0].length() >= 4 ? arr[0] : "00" + arr[0];
    arr[1] = arr[1].length() >= 2 ? arr[1] : "0" + arr[1];
    arr[2] = arr[2].length() >= 2 ? arr[2] : "0" + arr[2];

    System.out.println(arr[0] + "." + arr[1] + "." + arr[2]);
  
    //System.out.println(Arrays.toString(s));
    sc.close();
    */
    
    //sol2 => Memory 12536 runtime 93
    /*
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String[] arr = a.split("\\.");
    int A = Integer.valueOf(arr[0]);
    int B = Integer.valueOf(arr[1]);
    int C = Integer.valueOf(arr[2]);
    System.out.printf("%04d.%02d.%02d", A, B, C);
    sc.close();
    */
  }

}
