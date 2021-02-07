package sowon.week07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class quizCodeUp1084 {

  public static void main(String[] args) throws IOException {
    //중첩포문 메모리  48312 시간 315 <---> 단일포문: 메모리 :49864 kb 수행 시간:406 ms
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String[] rgb = br.readLine().split(" ");
    int r = Integer.parseInt(rgb[0]);
    int g = Integer.parseInt(rgb[1]);
    int b = Integer.parseInt(rgb[2]);
    int cnt = r*g*b;
    
    for(int i=0; i<r; i++){
      for(int j=0; j<g; j++){
        for(int k=0; k<b; k++){
          bw.write(i+" "+j+" "+k+"\n");
        }
        
      }
    }
    
    bw.write(String.valueOf(cnt));
    bw.flush();
    bw.close();
    br.close();
  }

}
