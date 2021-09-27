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

        //102. Binary Tree Level Order Traversal
        System.out.println("#102 Binary Tree Level Order Traversal");
        BinaryTreeLevelOrderTraversal102 btlot102 = new BinaryTreeLevelOrderTraversal102();
        System.out.println("Test value: root = [3,9,20,null,null,15,7]");
        TreeNode102 testbtlot102a = new TreeNode102(3);
        TreeNode102 testbtlot102b = new TreeNode102(9);
        TreeNode102 testbtlot102c = new TreeNode102(20);
        TreeNode102 testbtlot102d = new TreeNode102(15);
        TreeNode102 testbtlot102e = new TreeNode102(7);
        testbtlot102a.left = testbtlot102b;
        testbtlot102a.right = testbtlot102c;
        testbtlot102c.left = testbtlot102d;
        testbtlot102c.right = testbtlot102e;
        System.out.println("Expected output: [[3],[9,20],[15,7]]");
        //List<List<Integer>> resultbtlot102 = btlot102.levelOrder(testbtlot102a);
        System.out.print("Received output: [" );
        /*for (int i = 0; i < resultbtlot102.size(); i++)
        {
            System.out.print("[");
            for (int j = 0; j < resultbtlot102.get(i).size(); j++)
            {
                System.out.print(resultbtlot102.get(i).get(j) + ", ");
            }
            System.out.print("], ");

        }*/
        System.out.println("]");
        System.out.println("========================");

        //226. Invert Binary Tree
        System.out.println("#226 Invert Binary Tree");
        InvertBinaryTree226 ibt226 = new InvertBinaryTree226();
        System.out.println("Test value: root = [4,2,7,1,3,6,9]");
        TreeNode226 testibt226a = new TreeNode226(4);
        TreeNode226 testibt226b = new TreeNode226(2);
        TreeNode226 testibt226c = new TreeNode226(7);
        TreeNode226 testibt226d = new TreeNode226(1);
        TreeNode226 testibt226e = new TreeNode226(3);
        TreeNode226 testibt226f = new TreeNode226(6);
        TreeNode226 testibt226g = new TreeNode226(9);
        testibt226a.left = testibt226b;
        testibt226a.right = testibt226c;
        testibt226b.left = testibt226d;
        testibt226b.right = testibt226e;
        testibt226c.left = testibt226f;
        testibt226c.right = testibt226g;
        System.out.println("Expected output: [4,7,2,9,6,3,1]");
        TreeNode226 resultibt226 = ibt226.invertTree(testibt226a);
        System.out.print("Received output: [" );
        System.out.print(resultibt226.val + ", " + resultibt226.left.val + ", " + resultibt226.right.val + ", " + resultibt226.left.left.val + ", " + resultibt226.left.right.val + ", " + resultibt226.right.left.val + ", " + resultibt226.right.right.val);
        System.out.println("]");
        System.out.println("========================");

        //112. PathSum
        System.out.println("#112 Path Sum");
        PathSum112 ps112 = new PathSum112();
        System.out.println("Test value: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22");
        TreeNode112 testps112a = new TreeNode112(5);
        TreeNode112 testps112b = new TreeNode112(4);
        TreeNode112 testps112c = new TreeNode112(8);
        TreeNode112 testps112d = new TreeNode112(11);
        TreeNode112 testps112e = new TreeNode112(13);
        TreeNode112 testps112f = new TreeNode112(4);
        TreeNode112 testps112g = new TreeNode112(7);
        TreeNode112 testps112h = new TreeNode112(2);
        TreeNode112 testps112i = new TreeNode112(1);
        testps112a.left = testps112b;
        testps112a.right = testps112c;
        testps112b.left = testps112d;
        testps112c.left = testps112e;
        testps112c.right = testps112f;
        testps112d.left = testps112g;
        testps112d.right = testps112h;
        testps112f.right = testps112i;
        System.out.println("Expected output: true");
        boolean resultps112 = ps112.hasPathSum(testps112a, 22);
        System.out.println("Received output: " + resultps112);
        System.out.println("========================");

        //700. Search In A Binary Search Tree
        System.out.println("#700 Search In A Binary Search Tree");
        SearchInABinarySearchTree700 siabst700 = new SearchInABinarySearchTree700();
        System.out.println("Test value: root = [4,2,7,1,3], val = 2");
        TreeNode700 testsiabst700a = new TreeNode700(4);
        TreeNode700 testsiabst700b = new TreeNode700(2);
        TreeNode700 testsiabst700c = new TreeNode700(7);
        TreeNode700 testsiabst700d = new TreeNode700(1);
        TreeNode700 testsiabst700e = new TreeNode700(3);
        testsiabst700a.left = testsiabst700b;
        testsiabst700a.right = testsiabst700c;
        testsiabst700b.left = testsiabst700d;
        testsiabst700b.right = testsiabst700e;
        System.out.println("Expected output: [2, 1, 3]");
        TreeNode700 resultsiabst700 = siabst700.searchBST(testsiabst700a, 2);
        System.out.println("Received output: [" + resultsiabst700.val + ", " + resultsiabst700.left.val + ", " + resultsiabst700.right.val + "]");
        System.out.println("========================");

        //701. Insert Into A Binary Search Tree
        System.out.println("#701 Insert Into A Binary Search Tree");
        InsertIntoABinarySearchTree701 iiabst701 = new InsertIntoABinarySearchTree701();
        System.out.println("Test value: root = [4,2,7,1,3], val = 5");
        TreeNode701 testiiabst701a = new TreeNode701(4);
        TreeNode701 testiiabst701b = new TreeNode701(2);
        TreeNode701 testiiabst701c = new TreeNode701(7);
        TreeNode701 testsiabst701d = new TreeNode701(1);
        TreeNode701 testiiabst701e = new TreeNode701(3);
        testiiabst701a.left = testiiabst701b;
        testiiabst701a.right = testiiabst701c;
        testiiabst701b.left = testsiabst701d;
        testiiabst701b.right = testiiabst701e;
        System.out.println("Expected output: [4,2,7,1,3,5]");
        TreeNode701 resultiiabst701 = iiabst701.insertIntoBST(testiiabst701a, 5);
        System.out.println("Received output: [" + resultiiabst701.val + ", " + resultiiabst701.left.val + ", " + resultiiabst701.right.val + ", " +
                resultiiabst701.left.left.val + ", " + resultiiabst701.left.right.val + ", " + resultiiabst701.right.left.val + "]");
        System.out.println("========================");

        //98. Validate Binary Search Tree
        System.out.println("#98 Validate Binary Search Tree");
        ValidateBinarySearchTree98 vbst98 = new ValidateBinarySearchTree98();
        System.out.println("Test value: root = [2,1,3]");
        TreeNode98 testvbst98a = new TreeNode98(2);
        TreeNode98 testvbst98b = new TreeNode98(1);
        TreeNode98 testvbst98c = new TreeNode98(3);
        //TreeNode98 testvbst98d = new TreeNode98(3);
        TreeNode98 testvbst98e = new TreeNode98(7);
        testvbst98a.left = testvbst98b;
        testvbst98a.right = testvbst98c;
        //testvbst98c.left = testvbst98d;
        //testvbst98c.right = testvbst98e;
        System.out.println("Expected output: true");
        boolean resultvbst98 = vbst98.isValidBST(testvbst98a);
        System.out.println("Received output: " + resultvbst98);
        System.out.println("========================");

        //653. Two Sum IV Input Is A BST
        System.out.println("#653 Two Sum IV Input Is A BST");
        TwoSumInputIsABST653 tsiiabst653 = new TwoSumInputIsABST653();
        System.out.println("root = [5,3,6,2,4,null,7], k = 9");
        TreeNode653 testtsiiabst653a = new TreeNode653(5);
        TreeNode653 testtsiiabst653b = new TreeNode653(3);
        TreeNode653 testtsiiabst653c = new TreeNode653(6);
        TreeNode653 testtsiiabst653d = new TreeNode653(2);
        TreeNode653 testtsiiabst653e = new TreeNode653(4);
        TreeNode653 testtsiiabst653f = new TreeNode653(7);
        testtsiiabst653a.left = testtsiiabst653b;
        testtsiiabst653a.right = testtsiiabst653b;
        testtsiiabst653b.left = testtsiiabst653d;
        testtsiiabst653b.right = testtsiiabst653e;
        testtsiiabst653c.right = testtsiiabst653f;
        System.out.println("Expected output: true");
        boolean resulttsiiabst653 = tsiiabst653.findTarget(testtsiiabst653a, 9);
        System.out.println("Received output: " + resulttsiiabst653);
        System.out.println("========================");

        //235. Lowest Common Ancestor Of A Binary Search Tree
        System.out.println("#235 Lowest Common Ancestor Of A Binary Search Tree");
        LowestCommonAncestorOfABinarySearchTree235 lcaoabst235 = new LowestCommonAncestorOfABinarySearchTree235();
        System.out.println("root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8");
        TreeNode235 testlcaoabst235a = new TreeNode235(6);
        TreeNode235 testlcaoabst235b = new TreeNode235(2);
        TreeNode235 testlcaoabst235c = new TreeNode235(8);
        TreeNode235 testlcaoabst235d = new TreeNode235(0);
        TreeNode235 testlcaoabst235e = new TreeNode235(4);
        TreeNode235 testlcaoabst235f = new TreeNode235(7);
        TreeNode235 testlcaoabst235g = new TreeNode235(9);
        TreeNode235 testlcaoabst235h = new TreeNode235(3);
        TreeNode235 testlcaoabst235i = new TreeNode235(5);
        testlcaoabst235a.left = testlcaoabst235b;
        testlcaoabst235a.right = testlcaoabst235c;
        testlcaoabst235b.left = testlcaoabst235d;
        testlcaoabst235b.right = testlcaoabst235e;
        testlcaoabst235c.left = testlcaoabst235f;
        testlcaoabst235c.right = testlcaoabst235g;
        testlcaoabst235e.left = testlcaoabst235h;
        testlcaoabst235e.right = testlcaoabst235i;
        System.out.println("Expected output: 6");
        TreeNode235 resultlcaoabst235 = lcaoabst235.lowestCommonAncestor(testlcaoabst235a, testlcaoabst235b, testlcaoabst235c);
        System.out.println("Received output: " + resultlcaoabst235.val);
        System.out.println("========================");
    }
}
