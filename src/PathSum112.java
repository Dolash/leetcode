public class PathSum112 {
    public boolean hasPathSum(TreeNode112 root, int targetSum) {
        if (root == null)
        {
            return false;
        }
        return pathAdder(root, targetSum);

    }
    public boolean pathAdder(TreeNode112 current, int target)
    {
        if(current == null)
        {
            return false;
        }
        target -= current.val;
        if (target == 0)
        {
            if (current.left == null && current.right == null)
            {
                return true;
            }
        }
        boolean leftResult = pathAdder(current.left, target);
        boolean rightResult = pathAdder(current.right, target);
        if (leftResult || rightResult)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
