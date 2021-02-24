package jeonghyun.week09;

public class hk_appleandorange {
	
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		// s <-> t 사이에 떨어진 사과와 오렌지의 개수 구하기
		
		int numOfapples = 0;
		int numOforanges = 0;
		
		// 사과가 떨어진만큼(length만큼) 반복
		for (int i = 0; i < apples.length; i++) {
		      apples[i] += a;  // 사과가 떨어진 a의 위치를 더해줌
		      // 사과의 개수가 s보다 크고 t보다 작을 때 (s와 t위치의 사이에 있을 때)
		      if (apples[i] >= s && apples[i] <= t) {
		        numOfapples++;
		      }
		    }
		
		
		// 오렌지
		for (int j = 0; j < oranges.length; j++) {
		      oranges[j] += b;  // 오렌지가 떨어진 b의 위치를 더해줌
		      if (oranges[j] >= s && oranges[j] <= t) {
		        numOforanges++;
		      }
		    }
		    System.out.println(numOfapples + " " + numOforanges);
		  }


	public static void main(String[] args) {
		countApplesAndOranges(5, 15, 3, 2, new int[]{-2, 2, 1}, new int[]{5, -6});
	    System.out.print(", ans: 1 1\n");

	}

}
