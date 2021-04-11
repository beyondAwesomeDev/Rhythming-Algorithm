package jeonghyun.week16;

import java.util.Scanner;

public class sumOfFraction {

	// 백준 1735번 - 분수의 합
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        int a1 = sc.nextInt(); // 분자1
        int b1 = sc.nextInt(); // 분모1
 
        int a2 = sc.nextInt(); // 분자2
        int b2 = sc.nextInt(); // 분모2
        
 
        int a3 = a1 * b2 + a2 * b1;
        int b3 = b1 * b2;
 
        int gcd = getGCD(a3, b3);
 
        System.out.println(a3 / gcd + " " + b3 / gcd);
 
    }
 
    public static int getGCD(int n, int m) {
        if (n % m == 0)
            return m;
        else
            return getGCD(m, n % m);

	}

}
