package jeonghyun.week11;

import java.util.ArrayList;
import java.util.List;

public class noSameNumber {
	
	// 프로그래머스 - 같은 숫자는 싫어
	public int[] solution(int []arr) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        // standard라고 기준을 만듦
        int standard = arr[0];
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i] == standard){  // 기준과 같으면 중복된 숫자이므로 continue
                continue;
            }
            else{  // 기준과 다른 숫자가 나올 경우 list에 추가
                standard = arr[i];
                list.add(arr[i]);
            }
        }
        
        
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
        
	

	public static void main(String[] args) {
		

	}


}