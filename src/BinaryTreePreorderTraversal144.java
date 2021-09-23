import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal144 {
    List<Integer> results = new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode144 root) {
        if (root != null)
        {
            results.add(root.val);
            if(root.left != null)
            {
                preorderTraversal(root.left);
            }
            if(root.right != null)
            {
                preorderTraversal(root.right);
            }
        }

        return results;

    }
}
