public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp = headB;
        while (headA != null) {
            while (temp != null) {
                if (temp == headA) return temp;
                temp = temp.next;
            }
            headA = headA.next;
            temp = headB;
        }
        return null;
    }

public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
