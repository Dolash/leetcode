public class MaximumSubArray53 {
    public int maxSubArray(int[] nums) {
        int greatest = nums[0];
        int latest = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            int updatest = latest + nums[i];
            latest = Math.max(updatest, nums[i]);
            greatest = Math.max(greatest, latest);
        }
        return greatest;
    }
}
