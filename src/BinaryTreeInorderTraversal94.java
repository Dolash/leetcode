import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {
    List<Integer> results = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode94 root) {
        if (root != null)
        {
            if(root.left != null)
            {
                inorderTraversal(root.left);
            }
            results.add(root.val);
            if(root.right != null)
            {
                inorderTraversal(root.right);
            }
        }

        return results;

    }
}
