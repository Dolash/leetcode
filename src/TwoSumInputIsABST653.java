import java.util.HashMap;

public class TwoSumInputIsABST653 {
    HashMap<Integer, Integer> known = new HashMap<>();
    public boolean findTarget(TreeNode653 root, int k) {
        if (root == null)
        {
            return false;
        }
        if (known.containsKey(root.val))
        {
            return true;
        }
        known.put(k - root.val, 1);
        if (findTarget(root.left, k) || findTarget(root.right, k))
        {
            return true;
        }
        return false;
    }
}
