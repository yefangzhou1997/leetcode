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
