 public void deleteNode(ListNode node) {
        while (node.next != null && node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }

public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
