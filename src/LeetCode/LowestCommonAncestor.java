package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if((p.val >= root.val && q.val <= root.val) || (p.val <= root.val && q.val >= root.val)){
            return root;
        }
        else if(p.val > root.val && q.val > root.val){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root.right);
            while(!queue.isEmpty()){
                TreeNode temp = queue.poll();
                if(temp.left == null && temp.right == null){
                    continue;
                }
                if((p.val >= temp.val && q.val <= temp.val) || (p.val <= temp.val && q.val >= temp.val)){
                    return temp;
                }
                else{
                    if(temp.left != null && (temp.left.val == p.val) ||  (temp.left.val == q.val)){
                        return temp;
                    }
                    else if(temp.right != null && (temp.right.val == p.val) || (temp.right.val == q.val)){
                        return temp;
                    }
                    if(temp.left != null){
                        queue.add(temp.left);
                    }
                    if(temp.right != null){
                        queue.add(temp.right);
                    }
                }
            }
        }
        else{
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root.left);
            while(!queue.isEmpty()){
                TreeNode temp = queue.poll();
                if(temp.left == null && temp.right == null){
                    continue;
                }
                if((p.val >= temp.val && q.val <= temp.val) || (p.val <=           temp.val && q.val >= temp.val)){
                    return temp;
                }
                else{
                    if(temp.left != null && (temp.left.val == p.val) ||  (temp.left.val == q.val)){
                        return temp;
                    }
                    else if(temp.right != null && (temp.right.val == p.val) || (temp.right.val == q.val)){
                        return temp;
                    }
                    if(temp.left != null){
                        queue.add(temp.left);
                    }
                    if(temp.right != null){
                        queue.add(temp.right);
                    }
                }
            }
        }
        return null;
    }

    public TreeNode lowestCommonAncestorRec(TreeNode root, TreeNode p, TreeNode q){
        if((root.val == p.val || root.val == q.val) || (root.val >= p.val && root.val <= q.val) || (root.val <= p.val && root.val >= q.val)){
            return root;
        }
        else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestorRec(root.right, p, q);
        }
        else{
            return lowestCommonAncestorRec(root.left, p, q);
        }
    }
}
