package sowon.week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2455
// 지능형 기차

public class quiz7_2455 {
  public static void main(String[] args) throws IOException {
    //sol memory 11484 runtime 80
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] ppl = br.readLine().split(" ");
    int getOutppl = Integer.parseInt(ppl[0]);
    int getInppl = Integer.parseInt(ppl[1]);
    int Totalppl = getInppl; //현재 기차에 있는 사람의 수
    int max = getInppl; //기차안 사람수의 최대값
    
    for(int i=0; i<3; i++){
      String[] pplFromSecondLine = br.readLine().split(" ");
      getOutppl = Integer.parseInt(pplFromSecondLine[0]);
      getInppl = Integer.parseInt(pplFromSecondLine[1]);
      Totalppl = Totalppl + getInppl - getOutppl;
      
      if(Totalppl > max){
        max = Totalppl;
      }
    }
    System.out.println(max);
  }
}
/*
input
0 32
3 13
28 25
39 0

output
42
*/
