package theory.maximumdepth;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaximumDepth {

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        dfs(root);
    }

    static int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = dfs(root.left);
        int rightDepth = dfs(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
