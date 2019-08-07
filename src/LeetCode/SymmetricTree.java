package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public boolean isSymmetricIterative(TreeNode root) {
        if(root == null ){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if(left == null && right != null){
                continue;
            }
            if(left == null || right == null || left.val != right.val){
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }

    public boolean isSymmetricRecursive(TreeNode root){
        if(root == null){
            return true;
        }
        return isSymmetricRecursive(root.left, root.right);
    }
    public boolean isSymmetricRecursive(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return left==right;
        }
        if(left == null || right == null || left.val != right.val){
            return false;
        }
        return isSymmetricRecursive(left.left, right.right) && isSymmetricRecursive(left.right, right.left);
    }

}
