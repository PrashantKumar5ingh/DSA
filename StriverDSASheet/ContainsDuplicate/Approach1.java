package StriverDSASheet.ContainsDuplicate;

import java.util.HashMap;
import java.util.Map;

public class Approach1 {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Boolean> visitedIsTrue = new HashMap<Integer, Boolean>();
        for(int x: nums){
            if( visitedIsTrue.containsKey(x)){
                return true;
            } else visitedIsTrue.put(x, true);
        }
        return false;
    }
}
