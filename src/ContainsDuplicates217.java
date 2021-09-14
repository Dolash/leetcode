import java.util.HashMap;

public class ContainsDuplicates217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> aMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (aMap.containsKey(nums[i]))
            {
                return true;
            }
            else
            {
                aMap.put(nums[i], 1);
            }
        }
        return false;

    }
}
