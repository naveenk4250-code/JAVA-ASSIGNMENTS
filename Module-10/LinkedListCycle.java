// LeetCode 141 - Linked List Cycle (Easy)

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);
        node4.next = node2;

        LinkedListCycle lc = new LinkedListCycle();
        System.out.println(lc.hasCycle(head));

        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println(lc.hasCycle(head2));
    }
}
