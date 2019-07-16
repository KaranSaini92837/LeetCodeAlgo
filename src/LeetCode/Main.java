package LeetCode;


public class Main {

    public static void main(String[] args){
        ListNode headA = new ListNode(4);
        ListNode headB = new ListNode(5);
        headA.next = new ListNode(6);
        headA.next.next = new ListNode(7);
        headA.next.next.next = new ListNode(8);
        headA.next.next.next.next = new ListNode(9);
        headB.next = new ListNode(1);
        headB.next.next = new ListNode(2);
        headB.next.next.next = headA.next.next.next.next;

//        Node root = new Node(10);
//        root.left = new Node(5);
//        root.right = new Node(20);
//        root.left.left = new Node(12);
//        root.left.right = new Node(15);
//        root.right.left = new Node(21);
//        root.right.right = new Node(25);

//        root.inOrderTraversal(root);
//        root.preOrderTraversal(root);
//        root.postOrderTraversal(root);
        //System.out.println(root.levelOrderTraversal(root));
        //root.levelOrderTraversal(root);
//        System.out.println(root.parentOfANode(root, 25 ));
        IntersectionOfLinkedLists il = new IntersectionOfLinkedLists();
        System.out.println(il.intersectionOfLists(headA, headB));
        /*
        Adding nodes to a linked list
         */
//        ListNode headA = null;
//        System.out.println(ListNode.addNode(headA, 3).val);
//        ListNode.printNode(headA);
//        ListNode.addNode(headA, 4);
//        ListNode.printNode(headA);
//        ListNode.addNode(headA, 7);
    }
}
