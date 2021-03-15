package jeonghyun.week12;

public class p2016 {

	// 프로그래머스 - 2016년
	static String solution(int a, int b) {
		String answer = "";
		int totalDay = 0;
		int day = 0;

		for (int i = 1; i < a; i++) {
			// 31일로 끝나는 달
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				day = 31;
			// 윤달 (2월)
			else if (i == 2)
				day = 29;
			// 나머지 30일로 끝나는 달
			else
				day = 30;

			totalDay += day;
		}

		// 현재 월에 날짜(일수)를 더함
		totalDay += b;

		System.out.println("totalDay: " + totalDay + ", totalDay % 7: " + (totalDay % 7));
		switch (totalDay % 7) {
		case 0:
			answer = "TUE";
			break;
		case 1:
			answer = "WED"; //금
			break;
		case 2:
			answer = "THU";
			break;
		case 3:
			answer = "FRI";
			break;
		case 4:
			answer = "SAT";
			break;
		case 5:
			answer = "SUN";
			break;
		case 6:
			answer = "MON";
			break;
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(3, 2) + ", ans: WED");

	}

}
