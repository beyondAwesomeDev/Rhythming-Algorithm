package sowon.week10;

public class quizTheNumberofpandyinString {
  static boolean solution(String s) {
    //sol1. score 1004, 평균 통과 (0.02ms, 51.8MB)
    
    int cntP = 0;
    int cntY = 0;
    for(char c : s.toCharArray()){
      if(c == 'p' || c =='P'){
        cntP ++;
      }
      if(c == 'y' || c == 'Y'){
        cntY ++;
      }
    }
 
    return cntP == cntY;
    
    //sol2 int cnt를 하나로 가져기기 + toUpperCase 사용하기, 평균 통과 (0.04ms, 53.9MB)
    /*
    int cnt = 0;
    for(char c : s.toUpperCase().toCharArray()){
      if(c == 'P'){
        cnt ++;
      }
      if(c == 'Y'){
        cnt --;
      }
    }
 
    return cnt == 0 ? true : false;
    */
    
    //sol3. 람다식 코드 통과 (3.37ms, 53.3MB)
    /*
    s = s.toUpperCase();
    return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    */
  }

  public static void main(String[] args) {
    System.out.println(solution("pPoooyY")+". ans: true");
    System.out.println(solution("Pyy")+". ans: false");
  }

}
