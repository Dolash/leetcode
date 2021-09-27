public class LowestCommonAncestorOfABinarySearchTree235 {
    public TreeNode235 lowestCommonAncestor(TreeNode235 root, TreeNode235 p, TreeNode235 q) {
        if (root == null || root == p || root == q)
        {
            return root;
        }
        TreeNode235 left = lowestCommonAncestor(root.left, p, q);
        TreeNode235 right = lowestCommonAncestor(root.right, p, q);
        if (left == null)
        {
            return right;
        }
        else if (right == null)
        {
            return left;
        }
        return root;
    }
}
