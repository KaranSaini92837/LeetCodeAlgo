package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class RootToLeaf {
    static List<String> rootToLeaf = new ArrayList<String>();
    static StringBuilder s = new StringBuilder();
    public static List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null){
            s.append(root.val);
            rootToLeaf.add(s.toString());
            return rootToLeaf;
        }
        s.append(root.val+"->");
        binaryTreePaths(root.left);
        binaryTreePaths(root.right);
        return rootToLeaf;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        RootToLeaf.binaryTreePaths(root);
    }
}
