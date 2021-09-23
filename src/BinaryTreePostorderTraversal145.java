import java.util.LinkedList;
import java.util.List;

public class BinaryTreePostorderTraversal145 {
    List<Integer> results = new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode145 root) {
        if (root != null)
        {
            if(root.left != null)
            {
                postorderTraversal(root.left);
            }
            if(root.right != null)
            {
                postorderTraversal(root.right);
            }
            results.add(root.val);
        }

        return results;

    }
}
