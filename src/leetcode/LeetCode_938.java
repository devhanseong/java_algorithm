package leetcode;

//938. Range Sum of BST
public class LeetCode_938 {
    private int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        rangeSumBST(root.left, low, high);
        rangeSumBST(root.right, low, high);
        int curr = root.val;

        if (isBetween(curr, low, high)) {
            sum += curr;
        }

        return sum;
    }

    private boolean isBetween(int target, int low, int high) {
        return low <= target && target <= high;
    }

    class TreeNode {
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
