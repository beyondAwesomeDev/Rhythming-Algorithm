package sowon.week12;

import java.time.LocalDate;

// https://programmers.co.kr/learn/courses/30/lessons/12901
public class quiz2016year {
  static String solution(int a, int b) {
    // 2016년 a월 b일은 무슨 요일일까요?

    /*sol1 평균 1.31ms, 52.9MB => 점수 989(+9)
    String answer = "";
    // Date d = new Date(2016, a, b); //deprecated
    // 자바8에서 제대로 날짜,시간 사용하려면 LocalDate, LocalTime, LocalDateTime
    LocalDate d = LocalDate.of(2016, a, b);
    
    answer = d.getDayOfWeek().toString();
    switch (answer) {
      case "MONDAY":
        answer = "MON";
        break;
      case "TUESDAY":
        answer = "TUE";
        break;
      case "WEDNESDAY":
        answer = "WED";
        break;
      case "THURSDAY":
        answer = "THU";
        break;
      case "FRIDAY":
        answer = "FRI";
        break;
      case "SATURDAY":
        answer = "SAT";
        break;
      default:
        answer = "SUN";
        break;
    }
     */
    
    //sol2 switch문 안쓰고 substring으로
    /*
    String answer = "";
    LocalDate d = LocalDate.of(2016, a, b);
    answer = d.getDayOfWeek().toString().substring(0, 3);
    return answer;
    */
    
    //sol3 한 줄 코드
    return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
  }

  public static void main(String[] args) {
    System.out.println(solution(5, 24) + ", ans: TUE");
  }

}
