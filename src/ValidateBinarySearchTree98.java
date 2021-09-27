public class ValidateBinarySearchTree98 {
    public boolean isValidBST(TreeNode98 root) {
        if (root == null)
        {
            return true;
        }
        if (root.left != null)
        {
            if (root.left.val >= root.val)
            {
                return false;
            }
        }
        if (root.right != null)
        {
            if (root.right.val <= root.val)
            {
                return false;
            }
        }
        int[] smaller = {root.val};
        int[] greater = {root.val};
        if (!valiidBSTHelper(root.left, null, greater) || !valiidBSTHelper(root.right, smaller, null))
        {
            return false;
        }
        return true;
    }
    public boolean valiidBSTHelper(TreeNode98 current, int[] smaller, int[] greater)
    {
        if (current == null)
        {
            return true;
        }
        if (current.left != null)
        {
            if (current.left.val >= current.val)
            {
                return false;
            }
        }
        if (current.right != null)
        {
            if (current.right.val <= current.val)
            {
                return false;
            }
        }
        if (smaller != null)
        {
            for (int i = 0; i < smaller.length; i++)
            {
                if (current.val <= smaller[i])
                {
                    return false;
                }
            }
        }
        if (greater != null)
        {
            for (int i = 0; i < greater.length; i++)
            {
                if (current.val >= greater[i])
                {
                    return false;
                }
            }
        }
        int[] newSmaller;
        if (smaller != null)
        {
            newSmaller = new int[smaller.length + 1];
            for (int i = 0; i < smaller.length; i++)
            {
                newSmaller[i] = smaller[i];
            }
            newSmaller[smaller.length] = current.val;
        }
        else
        {
            newSmaller = new int[1];
            newSmaller[0] = current.val;
        }
        int[] newGreater;
        if (greater != null)
        {
            newGreater = new int[greater.length + 1];
            for (int i = 0; i < greater.length; i++)
            {
                newGreater[i] = greater[i];
            }
            newGreater[greater.length] = current.val;
        }
        else
        {
            newGreater = new int[1];
            newGreater[0] = current.val;
        }

        if (!valiidBSTHelper(current.left, smaller, newGreater))
        {
            return false;
        }
        if (!valiidBSTHelper(current.right, newSmaller, greater))
        {
            return false;
        }
        return true;
    }
}
