package LinkedList;

public class reverseList {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode ReverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right)
            return head;

        // Dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Move prev to left - 1 position
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // step - 3 = start reversing
        ListNode curr = prev.next;
        ListNode next = null;

        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }

}
