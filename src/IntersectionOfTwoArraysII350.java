import java.util.Hashtable;

public class IntersectionOfTwoArraysII350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] answers = new int[Math.max(nums1.length, nums2.length)];
        int size = 0;
        Hashtable<Integer, Integer> myMap = new Hashtable<>();
        for (int i = 0; i < nums1.length; i++)
        {
            if (myMap.containsKey(nums1[i]))
            {
                myMap.replace(nums1[i], myMap.get(nums1[i]) + 1);
            }
            else
            {
                myMap.put(nums1[i], 1);
            }

        }
        for (int i = 0; i < nums2.length; i++)
        {
            if(myMap.containsKey(nums2[i]))
            {
                answers[size] = nums2[i];
                size++;
                if(myMap.get(nums2[i]) > 1)
                {
                    myMap.replace(nums2[i], myMap.get(nums2[i]) - 1);
                }
                else
                {
                    myMap.remove(nums2[i]);
                }

            }
        }
        int[] realAnswers = new int[size];
        for (int i = 0; i < size; i++)
        {
            realAnswers[i] = answers[i];
        }
        return realAnswers;
    }
}
