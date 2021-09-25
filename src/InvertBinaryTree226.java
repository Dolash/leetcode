public class InvertBinaryTree226 {
    public TreeNode226 invertTree(TreeNode226 root) {
        if (root == null)
        {
            return null;
        }
        TreeNode226 temp = root.right;
        root.right = root.left;
        root.left = temp;
        invertTree(root.right);
        invertTree(root.left);
        return root;
    }
}
