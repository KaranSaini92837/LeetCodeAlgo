package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SumOfLeftLeaves {
    List<Integer> listOfLeftLeaves = new ArrayList<>();
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        else if(root.left != null && root.left.left == null && root.left.right == null){
            return root.val + sumOfLeftLeaves(root.right);
        }
        else{
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }

    public static int sumOfLeavesIterative(TreeNode root){
        int ans = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp == null){
                continue;
            }
            else if(temp.left != null && temp.left.left == null && temp.left.right == null){
                ans += temp.left.val;
                q.add(temp.right);
            }
            else{
                q.add(temp.left);
                q.add(temp.right);
            }
        }
        return ans;
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(SumOfLeftLeaves.sumOfLeavesIterative(root));
    }
}
