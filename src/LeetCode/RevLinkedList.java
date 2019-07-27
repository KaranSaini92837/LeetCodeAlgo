package LeetCode;

public class RevLinkedList {

    public ListNode reverseBetween(ListNode head, int m, int n) {

        if(head == null || head.next == null){
            return null;
        }

        int counter = 1;
        ListNode current = head;

        while(current != null){
            if(counter + 1 == m){
                current.next = reverseLink(current.next, current.next.next, n-m);
            }
            current = current.next;
            counter++;
        }
        return head;
    }

    public ListNode reverseLink(ListNode next, ListNode head, int diff){
        ListNode returnNode = next;
        ListNode tempCurrent = head;
        for(int i = diff; i >= 1; i--) {
            ListNode tempNext = tempCurrent.next;
            tempCurrent.next = returnNode;
            returnNode = tempCurrent;
            tempCurrent = tempNext;
        }
        next.next = tempCurrent;
        return returnNode;
    }
}
