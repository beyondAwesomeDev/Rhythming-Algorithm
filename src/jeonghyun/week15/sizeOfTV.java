package jeonghyun.week15;

import java.util.Scanner;

public class sizeOfTV {

	// 백준 - 1297번 TV 크기
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        
	        int diagonal = sc.nextInt(); // 대각선 길이
	        int height = sc.nextInt();    // 높이 비율
	        int width = sc.nextInt();    // 너비 비율
	        
	        // 대각선 비율
	        double d = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2)); 
	        
	        int h = (int) Math.floor(height * (diagonal / d));
	        int w = (int) Math.floor(width * (diagonal / d));
	        
	        System.out.println(h + " " + w);

	}

}
