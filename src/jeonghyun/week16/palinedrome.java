package jeonghyun.week16;

import java.util.Scanner;

public class palinedrome {

	// 백준 - 1259번 팰린드롬 수
	public static void main(String[] args) {

		// 팰린드롬 : 어떤 단어를 뒤에서부터 읽어도 똑같다면 그 단어를 팰린드롬이라고 함
		
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            
            if (n == 0) {
                sc.close();
                return;
            }
            
            int original = n;
            int reverse = 0;
            
            while(n > 0) {
                reverse = reverse * 10 + n % 10;
                n /= 10;
            }
            
            if (original == reverse) System.out.println("yes");
            else System.out.println("no");
            
        }

	}

}
