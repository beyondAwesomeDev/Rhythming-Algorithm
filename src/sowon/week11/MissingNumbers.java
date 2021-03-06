package sowon.week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MissingNumbers {
    static int[] missingNumbers(int[] arr, int[] brr) {
	HashMap<Integer,Integer> hashmapA = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> hashmapB = new HashMap<Integer,Integer>();
        
        for(int i:arr){
            if(hashmapA.containsKey(i)){
                hashmapA.put(i,hashmapA.get(i)+1);
            }
            else{
                hashmapA.put(i,1);
            }
        }
        for(int j:brr){
            if(hashmapB.containsKey(j)){
                hashmapB.put(j,hashmapB.get(j)+1);
            }
            else{
                hashmapB.put(j,1);
            }
        }
        ArrayList<Integer> diff = new ArrayList<Integer>();
        for(Integer i:hashmapB.keySet()){
            if(hashmapA.get(i)==null || hashmapA.get(i)<hashmapB.get(i)){
                diff.add(i);
            }
        }
        
        int[] result = new int[diff.size()];
	for (int i = 0; i < diff.size(); i++) {
	    result[i] = diff.get(i);
	}
	System.out.println(Arrays.toString(result));
	return result;
    }

    public static void main(String[] args) {
	System.out.println(missingNumbers(new int[] { 203, 204, 205, 206, 207, 208, 203, 204, 205, 206 },
		new int[] { 203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204 })
		+ ", ans: [204 205 206]");
    }

}
