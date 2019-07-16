package LeetCode;

import java.util.HashMap;

public class IntersectionOfLinkedLists {

    HashMap<ListNode, Integer> mapOfListVal = new HashMap<>();

    public ListNode intersectionOfLists(ListNode headA, ListNode headB) {
        addListToMap(headA);
        ListNode temp = headB;
        while (temp != null) {
            if (mapOfListVal.containsKey(temp) && mapOfListVal.containsValue(temp.val)) {
                return temp;
            } else {
                temp = temp.next;
            }
        }
        return null;
    }

    public void addListToMap(ListNode headA) {

        ListNode temp = headA;
        while (temp != null) {
            mapOfListVal.put(temp, temp.val);
            temp = temp.next;
        }

    }
}
