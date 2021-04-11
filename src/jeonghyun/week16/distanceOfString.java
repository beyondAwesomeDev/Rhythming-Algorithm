package jeonghyun.week16;

import java.util.Scanner;

public class distanceOfString {

	// 백준 1230번 - 문자열 거리
	public static void main(String[] args) {
		
		// 두 개의 문자열을 비교하여 최소의 차이를 구하기
		
		Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        int result = a.length();

        for(int i=0;i<b.length()-a.length()+1;i++){
        	// a와 b의 길이 차이
            int tmp=0;

            for(int j=0;j<a.length();j++){
                if(a.charAt(j)!=b.charAt(j+i)){
                    tmp++;
                }
            }
            if(result > tmp){
                result = tmp;
            }
        }

        System.out.println(result);
    }

}
