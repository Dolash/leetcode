import java.util.LinkedList;
import java.util.Queue;

public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Queue<Integer> myQueue = new LinkedList<>();
        int i = 0;
        int j = 0;
        while (i < m && j < n)
        {
            if(nums1[i] < nums2[j])
            {
                myQueue.add(nums1[i]);
                i++;
            }
            else
            {
                myQueue.add(nums2[j]);
                j++;
            }
        }
        if (j == n) {
            for (i = i; i < m; i++)
            {
                myQueue.add(nums1[i]);
            }
        }
        else
        {
            for (j = j; j < n; j++)
            {
                myQueue.add(nums2[j]);
            }
        }
        for (i = 0; i < m + n; i++)
        {
            nums1[i] = myQueue.remove();
        }
    }
}
