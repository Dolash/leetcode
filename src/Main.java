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

        //141. Linked List Cycle
        System.out.println("#141 Linked List Cycle");
        LinkedListCycle141 llc141 = new LinkedListCycle141();
        System.out.println("Test value: head = [3,2,0,-4], pos = 1");
        ListNode testllc1410 = new ListNode(3);
        ListNode testllc141head = new ListNode(2);
        ListNode testllc1412 = new ListNode(0);
        ListNode testllc1413 = new ListNode(-4);
        testllc1410.next = testllc141head;
        testllc141head.next = testllc1412;
        testllc1412.next = testllc1413;
        System.out.println("Expected output: true");
        boolean resultllc141 = llc141.hasCycle(testllc141head);
        System.out.println("Received output: " + resultva242);
        System.out.println("========================");

        //21. Merge Two Lists
        System.out.println("#21 Merge Two Lists");
        MergeTwoLists21 mtl21 = new MergeTwoLists21();
        System.out.println("Test value: l1 = [1,2,4], l2 = [1,3,4]");
        ListNode21 mtl21l1a = new ListNode21(1);
        ListNode21 mtl21l1b = new ListNode21(2);
        ListNode21 mtl21l1c = new ListNode21(4);
        ListNode21 mtl21l2a = new ListNode21(1);
        ListNode21 mtl21l2b = new ListNode21(3);
        ListNode21 mtl21l2c = new ListNode21(4);
        mtl21l1a.next = mtl21l1b;
        mtl21l1b.next = mtl21l1c;
        mtl21l2a.next = mtl21l2b;
        mtl21l2b.next = mtl21l2c;
        System.out.println("Expected output: [1,1,2,3,4,4]");
        ListNode21 resultmtl21 = mtl21.mergeTwoLists(mtl21l1a, mtl21l2a);
        System.out.print("Received output: [");
        while (resultmtl21 != null)
        {
            System.out.print(resultmtl21.val + ", ");
            resultmtl21 = resultmtl21.next;
        }
        System.out.println("]");

        System.out.println("========================");

        //203. Remove Linked List Elements
        System.out.println("#203 Remove Linked List Elements");
        RemoveLinkedListElements203 rlle203 = new RemoveLinkedListElements203();
        System.out.println("Test value: head = [1,2,6,3,4,5,6], val = 6");
        ListNode203 rlle203a = new ListNode203(1);
        ListNode203 rlle203b = new ListNode203(2);
        ListNode203 rlle203c = new ListNode203(6);
        ListNode203 rlle203d = new ListNode203(3);
        ListNode203 rlle203e = new ListNode203(4);
        ListNode203 rlle203f = new ListNode203(5);
        ListNode203 rlle203g = new ListNode203(6);
        rlle203a.next = rlle203b;
        rlle203b.next = rlle203c;
        rlle203c.next = rlle203d;
        rlle203d.next = rlle203e;
        rlle203e.next = rlle203f;
        rlle203f.next = rlle203g;
        System.out.println("Expected output: [1,2,3,4,5]");
        ListNode203 resultrlle = rlle203.removeElements(rlle203a, 6);
        System.out.print("Received output: [");
        while (resultrlle != null)
        {
            System.out.print(resultrlle.val + ", ");
            resultrlle = resultrlle.next;
        }
        System.out.println("]");
        System.out.println("========================");

        //206. Reverse Linked List
        System.out.println("#206 Reverse Linked List");
        ReverseLinkedList206 rll206 = new ReverseLinkedList206();
        System.out.println("Test value: head = [1,2,3,4,5]");
        ListNode206 testrll206a = new ListNode206(1);
        ListNode206 testrll206b = new ListNode206(2);
        ListNode206 testrll206c = new ListNode206(3);
        ListNode206 testrll206d = new ListNode206(4);
        ListNode206 testrll206e = new ListNode206(5);
        testrll206a.next = testrll206b;
        testrll206b.next = testrll206c;
        testrll206c.next = testrll206d;
        testrll206d.next = testrll206e;
        System.out.println("Expected output: [5, 4, 3, 2, 1]");
        ListNode206 resultrll206 = rll206.reverseList(testrll206a);
        System.out.print("Received output: [");
        while (resultrll206 != null)
        {
            System.out.print(resultrll206.val + ", ");
            resultrll206 = resultrll206.next;
        }
        System.out.println("]");
        System.out.println("========================");

        //83. Remove Duplicates From Sorted List
        System.out.println("#83 Remove Duplicates From Sorted List");
        RemoveDuplicatesFromSortedList83 rdfsl83 = new RemoveDuplicatesFromSortedList83();
        System.out.println("Test value: head = [1, 1, 2, 3, 3]");
        ListNode83 testrdfsl83a = new ListNode83(1);
        ListNode83 testrdfsl83b = new ListNode83(1);
        ListNode83 testrdfsl83c = new ListNode83(2);
        ListNode83 testrdfsl83d = new ListNode83(3);
        ListNode83 testrdfsl83e = new ListNode83(3);
        testrdfsl83a.next = testrdfsl83b;
        testrdfsl83b.next = testrdfsl83c;
        testrdfsl83c.next = testrdfsl83d;
        testrdfsl83d.next = testrdfsl83e;
        System.out.println("Expected output: [1, 2, 3]");
        ListNode83 resultrdfsl83 = rdfsl83.deleteDuplicates(testrdfsl83a);
        System.out.print("Received output: [");
        while (resultrdfsl83 != null)
        {
            System.out.print(resultrdfsl83.val + ", ");
            resultrdfsl83 = resultrdfsl83.next;
        }
        System.out.println("]");
        System.out.println("========================");

        //20. Valid Parentheses
        System.out.println("#20 Valid Parentheses");
        ValidParentheses20 vp20 = new ValidParentheses20();
        System.out.println("Test value: ()[]{}");
        String testvp20 = "()[]{}";
        System.out.println("Expected output: true");
        boolean resultvp20 = vp20.isValid(testvp20);
        System.out.println("Received output: " + resultvp20);
        System.out.println("========================");

        //232. Implement Queue Using Stacks
        System.out.println("#232 Implement Queue Using Stacks");
        ImplementQueueUsingStacks232 iqus232 = new ImplementQueueUsingStacks232();
        System.out.println("Test value: push [1], push [2], peek, pop, empty");
        int testiqus232a = 1;
        int testiqus232b = 2;
        iqus232.push(testiqus232a);
        iqus232.push(testiqus232b);
        System.out.println("Expected output: 1, 1, false");
        int resultiqus232a = iqus232.peek();
        int resultiqus232b = iqus232.pop();
        boolean resultiqus232c = iqus232.empty();
        System.out.println("Received output: " + resultiqus232a + ", " + resultiqus232b + ", " + resultiqus232c);
        System.out.println("========================");

        //144. Binary Tree Preorder Traversal
        System.out.println("#144 Binary Tree Preorder Traversal");
        BinaryTreePreorderTraversal144 btpt144 = new BinaryTreePreorderTraversal144();
        System.out.println("Test value: root = [1,null,2,3]");
        TreeNode144 testbtpt144a = new TreeNode144(1);
        TreeNode144 testbtpt144b = new TreeNode144(2);
        TreeNode144 testbtpt144c = new TreeNode144(3);
        testbtpt144a.right = testbtpt144b;
        testbtpt144b.left = testbtpt144c;
        System.out.println("Expected output: [1,2,3]");
        List<Integer> resultbtpt144 = btpt144.preorderTraversal(testbtpt144a);
        System.out.print("Received output: [" );
        for (int i = 0; i < resultbtpt144.size(); i++)
        {
            System.out.print(resultbtpt144.get(i) + ", ");
        }
        System.out.println("]");
        System.out.println("========================");

        //94. Binary Tree Inorder Traversal
        System.out.println("#144 Binary Tree Inorder Traversal");
        BinaryTreeInorderTraversal94 btit94 = new BinaryTreeInorderTraversal94();
        System.out.println("Test value: root = [1,null,2,3]");
        TreeNode94 testbtit94a = new TreeNode94(1);
        TreeNode94 testbtit94b = new TreeNode94(2);
        TreeNode94 testbtit94c = new TreeNode94(3);
        testbtit94a.right = testbtit94b;
        testbtit94b.left = testbtit94c;
        System.out.println("Expected output: [1,3,2]");
        List<Integer> resultbtit94 = btit94.inorderTraversal(testbtit94a);
        System.out.print("Received output: [" );
        for (int i = 0; i < resultbtit94.size(); i++)
        {
            System.out.print(resultbtit94.get(i) + ", ");
        }
        System.out.println("]");
        System.out.println("========================");

        //145. Binary Tree Postorder Traversal
        System.out.println("#145 Binary Tree Postorder Traversal");
        BinaryTreePostorderTraversal145 btpt145 = new BinaryTreePostorderTraversal145();
        System.out.println("Test value: root = [1,null,2,3]");
        TreeNode145 testbtpt145a = new TreeNode145(1);
        TreeNode145 testbtpt145b = new TreeNode145(2);
        TreeNode145 testbtpt145c = new TreeNode145(3);
        testbtpt145a.right = testbtpt145b;
        testbtpt145b.left = testbtpt145c;
        System.out.println("Expected output: [3, 2, 1]");
        List<Integer> resultbtpt145 = btpt145.postorderTraversal(testbtpt145a);
        System.out.print("Received output: [" );
        for (int i = 0; i < resultbtpt145.size(); i++)
        {
            System.out.print(resultbtpt145.get(i) + ", ");
        }
        System.out.println("]");
        System.out.println("========================");
    }
}
