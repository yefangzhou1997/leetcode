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
