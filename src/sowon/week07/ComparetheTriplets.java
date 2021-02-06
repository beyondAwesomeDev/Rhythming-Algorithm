package sowon.week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparetheTriplets {
  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int cntA = 1;
    int cntB = 1;
    List<Integer> ans = new ArrayList<>(Arrays.asList(0,0));
    for(int i=0; i<a.size(); i++){
      if(a.get(i) > b.get(i)){
        ans.set(0, cntA++);
        //cntA++;
      }else if(a.get(i) < b.get(i)){
        ans.set(1, cntB++);
        //cntB++;
      }
    }

    return ans;
  }
}
