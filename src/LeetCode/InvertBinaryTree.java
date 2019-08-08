package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if(current.left != null){
                q.add(current.left);
            }
            if(current.right != null){
                q.add(current.right);
            }
        }
        return root;
    }

    public TreeNode invertTreeRec(TreeNode root){
        if(root == null){
            return root;
        }

        TreeNode left = invertTreeRec(root.left);
        TreeNode right = invertTreeRec(root.left);

        TreeNode temp = left;
        root.left = right;
        root.right = temp;
        return root;
    }
}
