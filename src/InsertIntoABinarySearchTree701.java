public class InsertIntoABinarySearchTree701 {
    public TreeNode701 insertIntoBST(TreeNode701 root, int val) {
        if (root == null)
        {
            TreeNode701 newNode = new TreeNode701(val);
            return newNode;
        }
        if (root.val > val)
        {
            if (root.left == null)
            {
                TreeNode701 newNode = new TreeNode701(val);
                root.left = newNode;
            }
            else
            {
                insertIntoBST(root.left, val);
            }
        }
        else
        {
            if (root.right == null)
            {
                TreeNode701 newNode = new TreeNode701(val);
                root.right = newNode;
            }
            else
            {
                insertIntoBST(root.right, val);
            }
        }
        return root;
    }
}
