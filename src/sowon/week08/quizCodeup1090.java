package sowon.week08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class quizCodeup1090 {

  public static void main(String[] args) throws IOException {
    //sol1. memory: 11268 runtime 66
    // 입력값: 10 10 10, 출력값: 10000000000
    // 입력값: 2 3 7, 출력값: 1458
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] arn = br.readLine().split(" ");
    long a = Long.parseLong(arn[0]); //시작 값
    int r = Integer.parseInt(arn[1]); //등비
    int n = Integer.parseInt(arn[2]); //n번째
    
    //n이 7이라면 7번 반복하면 된다. 이때 a를 첫번째로 카운트하니까 i<=7이 아닌 i<7이 되어야한다.
    for(int i=1; i<n; i++){
      a *= r;
      //System.out.printf("i: %d, a: %d %n", i, a);
    }
    System.out.println(a);
    
    
    //sol2. memory 14908 runtime 113
    /*
    Scanner sc =  new Scanner(System.in);
    String[] nums = sc.nextLine().split(" ");
    sc.close();
    
    int a = Integer.parseInt(nums[0]);
    int r = Integer.parseInt(nums[1]);
    int n = Integer.parseInt(nums[2]);
    
    long sum=0;
    for(int i=0; i<n ; i++){
        sum = (long) (a*Math.pow(r, i));
    }
    System.out.println(sum);
    */
    
    //sol3 memory 14280 runtime 112
    /*
    Scanner sc =  new Scanner(System.in);
    String[] nums = sc.nextLine().split(" ");
    sc.close();
    
    long a = Long.parseLong(nums[0]);
    int r = Integer.parseInt(nums[1]);
    int n = Integer.parseInt(nums[2]);
    
    for(int i=1; i<n; i++){
      a *= r;
    }
    System.out.println(a);
    */
  }

}
