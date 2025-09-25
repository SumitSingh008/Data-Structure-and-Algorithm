package LinkedList;

public class MergeSort {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Split list into two halves
        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;

        // Step 2: Sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        // Step 3: Merge two sorted halves
        return merge(left, right);
    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null)
            tail.next = list1;
        if (list2 != null)
            tail.next = list2;

        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
