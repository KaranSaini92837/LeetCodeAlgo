package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Node {

    int data;
    Node left, right;

    public Node(int x){
        data = x;
    }

    public void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        else{
            inOrderTraversal(root.left);
            System.out.println(root.data);
            inOrderTraversal(root.right);
        }
    }

    public void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        else{
            System.out.println(root.data);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        else{
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.data);
        }
    }

    public void levelOrderTraversal(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
//        int max = 0;
        while(queue.isEmpty() == false){
            int count = queue.size();
//            if(count > max){
//                max = count;
//            }
//            max = Math.max(max, count);
            for(int i = 0; i < count ; i++){
                Node current = ((LinkedList<Node>) queue).pop();
                System.out.print(current.data+"  ");
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            System.out.println();
        }
//        return max;
    }

    public int depthOfNode(Node root, int val, int depth){
        if(root == null){
            return -1;
        }
        if(root != null && root.data == val) return depth;
        return Math.max(depthOfNode(root.left, val, depth+1), depthOfNode(root.right, val, depth+1));
    }

    public int parentOfANode(Node root, int val){

        if(root == null){
            return -1;
        }
        if(root.left != null && root.left.data == val)
            return root.data;
        if(root.right != null && root.right.data == val)
            return root.data;

        return Math.max(parentOfANode(root.left, val), parentOfANode(root.right, val));
    }

}
