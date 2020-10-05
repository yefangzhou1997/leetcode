public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        
        ArrayList<Integer> t = new ArrayList<Integer>();
        while (head != null) {
            t.add(head.val);
            head = head.next;
        }

        int size = t.size();
        for (int i = 0; i < size / 2; i++) {
            if (!(t.get(i).equals(t.get(size - i - 1)))) return false;
        }
        return true;
    }


public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode f = head;
        ListNode s = head;

        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }

        ListNode reverseHead = reverseList(s.next);

        while (head != null && reverseHead != null) {
            if (head.val != reverseHead.val) return false;
            head = head.next;
            reverseHead = reverseHead.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode theRight = head.next;
        ListNode reverseList = reverseList(theRight);
        theRight.next = head;
        head.next = null;
        return reverseList;
    }
