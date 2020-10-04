public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ArrayList<ListNode> temp = new ArrayList<ListNode>();

        while (head != null) {
            temp.add(head);
            head = head.next;
        }

        head = temp.get(temp.size() - 1);
        ListNode r = head;

        for (int i = temp.size() - 2; i >= 0; i--) {
            head.next = temp.get(i);
            head = temp.get(i);
        }

        head.next = null;
        return r;
    }


public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode t = new ListNode();
        t.val = head.val;
        t.next = null;

        ListNode t2 = null;
        while (head.next != null) {
            t2 = new ListNode();
            t2.val = head.next.val;
            t2.next = t;
            t = t2;
            head = head.next;
        }
        if(t2==null) return t;
        return t2;
    }
