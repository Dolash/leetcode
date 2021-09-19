import java.util.HashMap;
import java.util.List;

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

        //1. Two Sum
        System.out.println("#1 - Two Sum");
        TwoSum1 ts1 = new TwoSum1();
        System.out.println("Test values: [1, 3, 5, 7], 6");
        int[] testts1 = {1, 3, 5, 7};
        int testts1target = 6;
        System.out.println("Expected output: 0, 2");
        int[] resultts1 = ts1.twoSum(testts1, testts1target);
        System.out.println("Received output: " + resultts1[0] + ", " + resultts1[1]);
        System.out.println("========================");

        //88. Merge Sorted Array
        System.out.println("#88 - Merge Sorted Array");
        MergeSortedArray88 msa88 = new MergeSortedArray88();
        System.out.println("Test values: [1, 3, 5, 0, 0], 3, [2, 4], 2");
        int[] testmsa881 = {1, 3, 5, 0, 0};
        int testmsa88size1 = 3;
        int[] testmsa882 = {2, 4};
        int testmsa88size2 = 2;
        System.out.println("Expected output: 1, 2, 3, 4, 5");
        msa88.merge(testmsa881, testmsa88size1, testmsa882, testmsa88size2);
        System.out.println("Received output: " + testmsa881[0] + ", " + testmsa881[1] + ", " + testmsa881[2] + ", " + testmsa881[3] + ", " + testmsa881[4]);
        System.out.println("========================");

        //350. Intersection of Two Arrays II
        System.out.println("#350 - Intersection of Two Arrays II");
        IntersectionOfTwoArraysII350 iotaii350 = new IntersectionOfTwoArraysII350();
        System.out.println("Test values: [0, 3, 2, 4, 2, 3], [1, 2, 2]");
        int[] testiotaii3501 = {0, 3, 2, 4, 2, 3};
        int[] testiotaii3502 = {1, 2, 2};
        System.out.println("Expected output: 2, 2");
        int[] resultiotaii350 = iotaii350.intersect(testiotaii3501, testiotaii3502);
        System.out.print("Received output: ");
        for (int i = 0; i < resultiotaii350.length; i++)
        {
            System.out.print(resultiotaii350[i] + ", ");
        }
        System.out.println();
        System.out.println("========================");

        //121. Best Time To Buy And Sell Stock
        System.out.println("#121 - Best Time To Buy And Sell Stock");
        BestTimeToBuyAndSellStock121 bttbass121 = new BestTimeToBuyAndSellStock121();
        System.out.println("Test values: [7, 1, 5, 3, 6, 4]");
        int[] testbttbass121 = {7, 1, 5, 3, 6, 4};
        System.out.println("Expected output: 5");
        int resultbttbass121 = bttbass121.maxProfit(testbttbass121);
        System.out.println("Received output: " + resultbttbass121);
        System.out.println("========================");

        //566. Reshape The Matrix
        System.out.println("#566 - Reshape The Matrix");
        ReshapeTheMatrix566 rtm566 = new ReshapeTheMatrix566();
        System.out.println("Test values: [[1, 2,] [3, 4]], 1, 4");
        int[][] testrtm566 = {{1, 2}, {3, 4}};
        int testrtm566r = 1;
        int testrtm566c = 4;
        System.out.println("Expected output: [1, 2, 3, 4]");
        int[][] resultrtm566 = rtm566.matrixReshape(testrtm566, testrtm566r, testrtm566c);
        System.out.println("Received output: ");
        for (int i = 0; i < resultrtm566.length; i++)
        {
            System.out.print("[");
            for (int j = 0; j < resultrtm566[i].length; j++)
            {
                System.out.print(resultrtm566[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("========================");

        //118. Pascal's Triangle
        System.out.println("#118 - Pascal's Triangle");
        PascalsTriangle118 pt118 = new PascalsTriangle118();
        System.out.println("Test value: 5");
        int testpt118 = 5;
        System.out.println("Expected output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]");
        List<List<Integer>> resultpt118 = pt118.generate(testpt118);
        System.out.println("Received output: ");
        System.out.println("[");
        for (int i = 0; i < resultpt118.size(); i++)
        {
            System.out.print("[");
            for (int j = 0; j < resultpt118.get(i).size(); j++)
            {
                System.out.print(resultpt118.get(i).get(j) + " ");
            }
            System.out.println("]");
            if (i == resultpt118.size() - 1)
            {
                System.out.println("]");
            }
        }
        System.out.println("========================");

        //36. Valid Sudoku
        System.out.println("#36 Valid Sudoku");
        ValidSudoku36 vs36 = new ValidSudoku36();
        System.out.println("Test value: ");
        /*char[][] testvs36 = {{'5', '3', '.', '.', '7', '.', '.', '.', '.', },
                            {'6', '.', '.', '1', '9', '5', '.', '.', '.', },
                            {'.', '9', '8', '.', '.', '.', '.', '6', '.', },
                            {'8', '.', '.', '.', '6', '.', '.', '.', '3', },
                            {'4', '.', '.', '8', '.', '3', '.', '.', '1', },
                            {'7', '.', '.', '.', '2', '.', '.', '.', '6', },
                            {'.', '6', '.', '.', '.', '.', '2', '8', '.', },
                            {'.', '.', '.', '4', '1', '9', '.', '.', '5', },
                            {'.', '.', '.', '.', '8', '.', '.', '7', '9', }, };*/
        //Two ones in the top right corner, two threes in the top middle
        char[][] testvs36 =
                {{'.', '.', '.', '.', '5', '.', '.', '1', '.', },
                 {'.', '4', '.', '3', '.', '.', '.', '.', '.', },
                 {'.', '.', '.', '.', '.', '3', '.', '.', '1', },
                 {'8', '.', '.', '.', '.', '.', '.', '.', '2', },
                 {'.', '.', '2', '.', '7', '.', '.', '.', '.', },
                 {'.', '1', '5', '.', '.', '.', '.', '.', '.', },
                 {'.', '.', '.', '.', '.', '2', '.', '.', '.', },
                 {'.', '2', '.', '9', '.', '.', '.', '.', '.', },
                 {'.', '.', '4', '.', '.', '.', '.', '.', '.', }, };
        System.out.println("Expected output: true");
        boolean resultvs36 = vs36.isValidSudoku(testvs36);
        System.out.println("Received output: " + resultvs36);
        System.out.println("========================");

        //387. First Unique Character In A String
        System.out.println("#387 First Unique Character In A String");
        FirstUniqueCharacterInAString387 fucias387 = new FirstUniqueCharacterInAString387();
        System.out.println("Test value: leetcode");
        String testfucias387 = "leetcode";
        System.out.println("Expected output: 0");
        int resultfucias387 = fucias387.firstUniqChar(testfucias387);
        System.out.println("Received output: " + resultfucias387);
        System.out.println("========================");

        //383. Ransom Note
        System.out.println("#383 RansomNote");
        RansomNote383 rn383 = new RansomNote383();
        System.out.println("Test value: aa, aab");
        String testrn3831 = "aa";
        String testrn3832 = "aab";
        System.out.println("Expected output: true");
        boolean resultrn383 = rn383.canConstruct(testrn3831, testrn3832);
        System.out.println("Received output: " + resultrn383);
        System.out.println("========================");

        //242. Valid Anagram
        System.out.println("#242 Valid Anagram");
        ValidAnagram242 va242 = new ValidAnagram242();
        System.out.println("Test value: aba, baa");
        String testva2421 = "aba";
        String testva2422 = "baa";
        System.out.println("Expected output: true");
        boolean resultva242 = va242.isAnagram(testva2421, testva2422);
        System.out.println("Received output: " + resultva242);
        System.out.println("========================");
    }
}
