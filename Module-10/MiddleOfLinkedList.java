// LeetCode 876 - Middle of the Linked List (Easy)

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        MiddleOfLinkedList ml = new MiddleOfLinkedList();
        ListNode middle = ml.middleNode(head);
        System.out.println(middle.val);

        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        middle = ml.middleNode(head2);
        System.out.println(middle.val);
    }
}
