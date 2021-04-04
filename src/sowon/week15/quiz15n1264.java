package sowon.week15;

// https://www.acmicpc.net/problem/1264 
// 모음의 개수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz15n1264 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //sol memory 11888 runtime 88    
    String pattern = "/[aeiouAEIOU]/"; //정규식패턴
    int cnt = 0;
    String line;
    
    while(true){
      line = br.readLine();
      if(line.equals("#")){
        break;
      }
      
      String[] words = line.split("");
      for(int i =0; i<words.length; i++){
        if(pattern.contains(words[i])){
          cnt++;
        }
      }
      System.out.println(cnt);
      cnt = 0;
    }
    
  }

}
/*
input
How are you today?
Quite well, thank you, how about yourself?
I live at number twenty four.
#

output
7
14
9
 */
