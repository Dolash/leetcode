import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Jack's LeetCode Samples");
        System.out.println("========================");

        //217. Contains Duplicates
        System.out.println("#217 - Contains Duplicates");
        ContainsDuplicates217 cd217 = new ContainsDuplicates217();
        System.out.println("Test values: 1, 2, 3, 1");
        int[] testcd217 = {1, 2, 3, 1};
        System.out.println("Expected output: true");
        boolean resultcd217 = cd217.containsDuplicate(testcd217);
        System.out.println("Received output: " + resultcd217);
        System.out.println("========================");

        //53. Maximum Sub-Array
        System.out.println("#53 - Maximum Sub-Array");
        MaximumSubArray53 ma53 = new MaximumSubArray53();
        System.out.println("Test values: -2, 1, -3, 4, -1, 2, 1, -5, 4");
        int[] testma53 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Expected output: 6");
        int resultma53 = ma53.maxSubArray(testma53);
        System.out.println("Received output: " + resultma53);
        System.out.println("========================");

    }
}
