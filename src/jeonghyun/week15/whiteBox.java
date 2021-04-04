package jeonghyun.week15;

import java.util.Scanner;

public class whiteBox {

	// 백준 - 1100번 하얀 칸
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    final int size = 8;
	    // 체스판
	    char[][] chessBoard = new char[size][size];
	    // 하얀 칸 위의 말 개수
	    int num = 0;

	    String str = "";
	    
	    for (int i = 0; i < size; i++) {
	      str = sc.nextLine();
	      
	      for (int j = 0; j < size; j++) {
	        chessBoard[i][j] = str.charAt(j);

	        // (i + j)를 2로 나눈 나머지가 0인 경우 => 하얀 칸이다.
	        if ((i + j) % 2 == 0 && chessBoard[i][j] == 'F') {
	            num++;
	        }
	      }
	    }

	    System.out.println(num);
	    
	  }
	

	}


