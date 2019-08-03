package LeetCode;

public class PathSum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        if (root.left == null && root.right == null && sum == root.val) {
            return true;
        }
        boolean x = hasPathSum(root.left, sum-root.val);
        boolean y = hasPathSum(root.right, sum-root.val);
        return x||y;
    }
}
