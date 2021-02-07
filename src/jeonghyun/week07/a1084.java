package jeonghyun.week07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class a1084 {

	public static void main(String[] args) throws IOException{
		// 빨강(r), 초록(g), 파랑(b) 각각의 빛의 개수가 주어질 때,
		// (빛의 강약에 따라 0 ~ n-1 까지 n가지의 빛 색깔을 만들 수 있다.)

		// 주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과
		// 총 가짓 수를 계산해보자.
		
		/* Scanner 사용
		 * Scanner sc = new Scanner(System.in); int a = sc.nextInt(); int b =
		 * sc.nextInt(); int c = sc.nextInt();
		 * 
		 * //개수 int count = 0;
		 * 
		 * for(int i=0;i<a;i++) { 
		 *    for(int j=0;i<b;j++) { 
		 *        for(int k=0;k<c;k++) {
		 *                System.out.printf("%d, %d, %d\n", i, j, k); 
		 *                
		 *                count += 1; 
		 *          } 
		 *      } 
		 *  }
		 * System.out.println(count);
		 */
		
		// BufferReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 한 줄씩 읽어서 출력
		String[] a = br.readLine().split(" ");
		
		int count = 0;
		for(int i=0;i<Integer.valueOf(a[0]);i++) {
			for(int j=0;j<Integer.valueOf(a[1]);j++) {
				for(int k=0;k<Integer.valueOf(a[2]);k++) {
					bw.write(i + " " + j + " " + k + " " + "\n");
					
			}
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();   // 스트림을 비움
		bw.close();
		
		
	}

}

