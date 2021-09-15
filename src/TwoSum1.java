import java.util.Hashtable;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = {0,0};
        Hashtable<Integer, Integer> myTable = new Hashtable<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (myTable.containsKey(nums[i]))
            {
                answer[0] = myTable.get(nums[i]);
                answer[1] = i;
            }
            //else if (target - nums[i] > -1)
            else
            {
                myTable.put(target - nums[i], i);
            }
        }
        return answer;
    }
}
