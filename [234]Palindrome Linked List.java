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
