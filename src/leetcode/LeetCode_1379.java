package leetcode;

//1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
public class LeetCode_1379 {

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode result = postOrder(original, cloned, target);
        return result;
    }

    private TreeNode postOrder(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return null;
        }
        if (original == target) {
            return cloned;
        }

        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        TreeNode right = getTargetCopy(original.right, cloned.right, target);

        if (left != null) {
            return left;
        }
        return right;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
