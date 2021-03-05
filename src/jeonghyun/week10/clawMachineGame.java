package jeonghyun.week10;

import java.util.Stack;

public class clawMachineGame {
	
	// 프로그래머스 - 크레인 인형뽑기 게임
	public int solution(int[][] board, int[] moves) {
	    int answer = 0;
	    
        // stack은 바구니 역할
	    Stack<Integer> stack = new Stack<>();
	    stack.push(0);  // 0을 먼저 넣음 -> 맨 위 값과 비교하기 위해(0의 초기값이 없으면 오류남)

	    for (int move : moves) {  // 움직이는 길이많음 반복
	      for (int j = 0; j < board.length; j++) {
	    	  
	        if (board[j][move - 1] != 0) {  // 0이면 인형이 없는 것 => PASS
	          // 0이 아닌 경우는 바구니(stack)과 같은지 비교	
	          if (stack.peek() == board[j][move - 1]) {
	            stack.pop();  // 같으면 인형이 터짐
	            answer += 2;
	          // stack과 다르면 push  
	          } else {
	           stack.push(board[j][move - 1]);
	          }
	          board[j][move - 1] = 0;
	          break;
	        }
	      }
	    }
	    return answer;
	  }

	

}
