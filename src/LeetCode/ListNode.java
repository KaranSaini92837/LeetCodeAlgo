package LeetCode;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    static public ListNode addNode(ListNode head, int val) {
        if (head == null) {
            head = new ListNode(val);
            return head;
        }

        ListNode temp = head;

        while (temp.next != null) {

            temp = temp.next;
        }
        temp.next = new ListNode(val);
        System.out.println(head.next.val);
        return head;
    }

    static public void printNode(ListNode head) {
        ListNode temp = head;
        if (head == null) {
            return;
        } else {
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
    }
}
