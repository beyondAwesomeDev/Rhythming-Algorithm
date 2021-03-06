package jeonghyun.week11;

public class removeTheSmallestNum {
	
	// 프로그래머스 - 제일 작은 수 제거하기
	public int[] solution(int[] arr) {
        
        int size = arr.length;
        
        int[] answer = new int[size - 1];
        
        // size(배열의 길이)가 1이면 -1을 리턴
        if(size == 1){
            arr[0] = -1;
            return arr;
        } else {
            int min = Integer.MAX_VALUE;
            int minIdx = 0;
            for(int i = 0; i < size; i++){
                if(arr[i] < min){
                    min = arr[i];
                    minIdx = i;                
                }
            }
 
            int index = 0;
            for(int i = 0; i < size; i++){
                if(i == minIdx)
                    continue;
                else {
                    answer[index] = arr[i];
                    index++;
                }
            }
        }

        return answer;
    }
	
	

	public static void main(String[] args) {
		

	}

}
