public class SearchInABinarySearchTree700 {
    public TreeNode700 searchBST(TreeNode700 root, int val) {
        while (root != null)
        {
            if (root.val == val)
            {
                return root;
            }
            else if (root.val >= val)
            {
                return searchBST(root.left, val);
            }
            else
            {
                return searchBST(root.right, val);
            }
        }
        return root;
    }
}
