    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null && n == 1) return null;

        int ct = 0;
        ListNode r = head, t = head;

        while (head.next != null) {
            if (ct < n) head = head.next;
            else {
                head = head.next;
                t = t.next;
            }
            ct++;
        }

        if (ct == n - 1) return r.next;
        else {
            t.next = t.next.next;
            return r;
        }
    }
