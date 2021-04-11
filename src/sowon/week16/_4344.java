package sowon.week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4344 {
  public static void main(String[] args) throws IOException {
    //sol memory 13288 time 116
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //테스트 케이스 개수
    int cntCase = Integer.parseInt(br.readLine());
    StringTokenizer st;

    for(int i=0; i<cntCase; i++){
      st = new StringTokenizer(br.readLine(), " ");
      int cntStudent = Integer.parseInt(st.nextToken());
      int[] score =  new int[cntStudent];
      int avg = 0;
    double ratio = 0.0;

      //배열에 성적 넣기
      for(int j=0; j<cntStudent; j++){
        if(!st.hasMoreTokens()) break;
        score[j] = Integer.parseInt(st.nextToken());
        avg += score[j];
      }

      //평균값(소수점 넷째자리에서 반올림)
      avg = avg/cntStudent;

      //평균을 넘는 학생의 비율
      for(int k=0; k<cntStudent; k++){
        if(score[k] > avg){
          ratio++;
        }
      }

      ratio = (ratio/cntStudent)*100.00;
      System.out.printf("%.3f", ratio);
      System.out.println("%");
    }
  }
}
