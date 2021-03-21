package sowon.week09;

public class SherlockandSquares {
	static int squares(int a, int b) { // 3 4 5 6 7 8 9 => 2
		// 주어진 수의 범위안에 제곱근(square integer)을 구하는 문제
		//sol1
	    // 예시 Math.sqrt(9) = 3.0
		int start = (int) Math.sqrt(a);  
		int end = (int) Math.sqrt(b); 
//		System.out.println("a: "+a+", b: "+b+", Math.sqrt(a): "+start+", Math.sqrt(b): "+end + ", Math.pow(start, 2):" + Math.pow(start, 2));

		// 예시 Math.pow(3, 2) = 9.0  (3*3)
		start = (Math.pow(start, 2) >= a) ? start-1 : start;

//		System.out.println("start: "+start+", end: "+end);
		return end - start;
		
		// sol2. one line code
		// floor -> 내림 (바닥으로 floor)
		// ceil  -> 올림 (천장으로 ceiling)
		// round -> 반올림 (반올림 round)
//		return (int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a)) + 1;
	}

	public static void main(String[] args) {
		System.out.println(squares(24, 49) + ", ans: 3");
		System.out.println(squares(3, 9) + ", ans: 2");
		System.out.println(squares(17, 24) + ", ans: 0");
		System.out.println(squares(100, 1000) + ", ans: 22");
		System.out.println(squares(9, 16) + ", ans: 2");
		System.out.println(squares(11, 734) + ", ans: 24");
		System.out.println(squares(228, 919) + ", ans: 15");
		System.out.println(squares(71, 188) + ", ans: 5"); //9 10 11 12 13
		System.out.println(squares(270, 303) + ", ans: 1");
		System.out.println(squares(312, 701) + ", ans: 9");
		System.out.println(squares(251, 325) + ", ans: 3");
		System.out.println(squares(418, 954) + ", ans: 10");
		System.out.println(squares(407, 597) + ", ans: 4");
		System.out.println(squares(4, 4) + ", ans: 1");
	}

}
